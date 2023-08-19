package com.innovasoft.PO2Academy.infrastructure.output.jpa.adapter;

import com.innovasoft.PO2Academy.domain.model.Answer;
import com.innovasoft.PO2Academy.domain.spi.IAnswerPersistencePort;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper.AnswerEntityMapper;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.repository.IAnswerRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class AnswerJpaAdapter implements IAnswerPersistencePort {
    private final IAnswerRepository answerRepository;
    private final AnswerEntityMapper answerEntityMapper;
    @Override
    public List<Answer> getByQuestionId(Long questionId) {
        return answerRepository.findByQuestionId(questionId)
                .stream()
                .map(answerEntityMapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public boolean isCorrect(Long id) {
        return answerRepository.isCorrect(id);
    }
}
