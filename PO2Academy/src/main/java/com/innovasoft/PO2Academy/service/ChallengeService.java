package com.innovasoft.PO2Academy.service;

import com.innovasoft.PO2Academy.dto.AnswerDto;
import com.innovasoft.PO2Academy.dto.GradeDto;
import com.innovasoft.PO2Academy.dto.QuestionDto;
import com.innovasoft.PO2Academy.dto.QuizDto;
import com.innovasoft.PO2Academy.entity.Challenge;
import com.innovasoft.PO2Academy.entity.Result;
import com.innovasoft.PO2Academy.entity.User;
import com.innovasoft.PO2Academy.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@Service
public class ChallengeService {
    @Autowired
    private ChallengeRepository challengeRepository;
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private AnswerRepository answerRepository;
    @Autowired
    private ResultRepository resultRepository;
    @Autowired
    private UserRepository userRepository;

    public QuizDto getChallengeByName(String name, String username) throws RuntimeException {
        User user = userRepository.findByUsername(username).orElseThrow(RuntimeException::new);
        Challenge challenge = challengeRepository.findByName(name).orElseThrow(() -> new RuntimeException(name + " no encontrado."));

        List<QuestionDto> questionDtos = questionRepository.findByIdChallengeAndLevel(challenge.getId(), user.getLevel())
                .parallelStream()
                .map(question -> {
                    List<AnswerDto> answerDto = answerRepository.findByIdQuestion(question.getId())
                            .parallelStream()
                            .map(answer -> new AnswerDto(answer.getId(), answer.getOptionAnswer()))
                            .collect(Collectors.toCollection(ArrayList::new));
                    Collections.shuffle(answerDto);
                    return new QuestionDto(question.getId(), question.getQuestion(), answerDto);
                })
                .collect(Collectors.toCollection(ArrayList::new));

        Collections.shuffle(questionDtos);
        return new QuizDto(challenge.getId(), challenge.getDescription(), questionDtos);
    }

    public GradeDto grade(List<Long> answerList, String username) {
        Map<Boolean, Long> answer = answerList.stream()
                .map(answerRepository::isCorrect)
                .collect(Collectors.groupingBy(ans -> ans, Collectors.counting()));
        Double correct = (double) (answer.containsKey(true) ? answer.get(true) : 0);
        Double total = answer.containsKey(false) ? correct + answer.get(false) : correct;
        Double score = (correct / total) * 100;
        resultRepository.save(new Result(null, username, challengeRepository.getChallengeIdByAnswerId(answerList.get(0)),
                score.intValue(), LocalDateTime.now(),userRepository.findByUsername(username).get().getLevel()));
        return new GradeDto(correct.intValue(), total.intValue(), score.intValue());
    }

    public int levelUp(String username) {
        boolean isCompleted = challengeRepository.findAll()
                .stream()
                .allMatch(c -> resultRepository.getMaxChallenge(username, c.getId()) == 100L);
        if(isCompleted) {
            User user = userRepository.findByUsername(username).orElseThrow(RuntimeException::new);
            user.setLevel(user.getLevel() + 1);
            userRepository.save(user);
            return user.getLevel() + 1;
        }else {
            throw new RuntimeException("No has completado todos los desafios.");
        }
    }
}
