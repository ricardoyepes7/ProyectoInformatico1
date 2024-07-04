package com.innovasoft.PO2Academy.application.handler.implementations;

import com.innovasoft.PO2Academy.application.dto.AnswerDto;
import com.innovasoft.PO2Academy.application.dto.GradeDto;
import com.innovasoft.PO2Academy.application.dto.QuestionDto;
import com.innovasoft.PO2Academy.application.dto.QuizDto;
import com.innovasoft.PO2Academy.application.exception.ChallengeRestException;
import com.innovasoft.PO2Academy.application.handler.interfaces.IChallengeHandler;
import com.innovasoft.PO2Academy.domain.api.*;
import com.innovasoft.PO2Academy.domain.model.Challenge;
import com.innovasoft.PO2Academy.domain.model.Result;
import com.innovasoft.PO2Academy.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ChallengeHandlerImp implements IChallengeHandler {
    private final IChallengeServicePort challengeServicePort;
    private final IUserServicePort userServicePort;
    private final IQuestionServicePort questionServicePort;
    private final IAnswerServicePort answerServicePort;
    private final IResultServicePort resultServicePort;

    @Override
    public QuizDto getChallengeByName(String challengeName, String username) {
        User user = userServicePort.getUserByUsername(username);
        Challenge challenge = challengeServicePort.getChallengeByName(challengeName);

        List<QuestionDto> questionsDto = questionServicePort.getByIdChallengeAndLevel(challenge.getId(), user.getLevel())
                .parallelStream()
                .map(question -> {
                    List<AnswerDto> answerDto = answerServicePort.getByQuestionId(question.getId())
                            .parallelStream()
                            .map(answer -> new AnswerDto(answer.getId(), answer.getOptionAnswer()))
                            .collect(Collectors.toCollection(ArrayList::new));
                    Collections.shuffle(answerDto);
                    return new QuestionDto(question.getId(), question.getQuestion(), answerDto);
                })
                .collect(Collectors.toCollection(ArrayList::new));

        Collections.shuffle(questionsDto);
        return new QuizDto(challenge.getId(), challenge.getDescription(), questionsDto);
    }

    @Override
    @Transactional
    public GradeDto grade(List<Long> answerList, String username) {
        Map<Boolean, Long> answer = answerList.stream()
                .map(answerServicePort::isCorrect)
                .collect(Collectors.groupingBy(ans -> ans, Collectors.counting()));

        Double correct = (double) (answer.containsKey(true) ? answer.get(true) : 0);
        Double total = answer.containsKey(false) ? correct + answer.get(false) : correct;
        double score = (correct / total) * 100;
        Result result = Result.builder()
                .username(username)
                .challengeId(challengeServicePort.getChallengeIdByAnswerId(answerList.get(0)))
                .score((int) score)
                .date(LocalDateTime.now())
                .level(userServicePort.getUserByUsername(username).getLevel())
                .build();
        resultServicePort.saveResult(result);
        return new GradeDto(correct.intValue(), total.intValue(), (int) score);
    }

    @Override
    @Transactional
    public int levelUp(String username) {
        boolean isCompleted = challengeServicePort.getAllChallenges()
                .stream()
                .allMatch(challenge -> resultServicePort.getMaxChallenge(username, challenge.getId()) == 100L);

        if (isCompleted) {
            User user = userServicePort.getUserByUsername(username);
            user.setLevel(user.getLevel() + 1);
            userServicePort.update(user);
            return user.getLevel() + 1;
        } else {
            throw new ChallengeRestException("No puedes subir de nivel porque no has completado todos los desafíos.", HttpStatus.CONFLICT);
        }
    }
}
