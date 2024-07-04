package com.innovasoft.PO2Academy.infrastructure.output.jpa.adapter;

import com.innovasoft.PO2Academy.domain.model.Question;
import com.innovasoft.PO2Academy.domain.spi.IQuestionProviderPort;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.mapper.QuestionEntityMapper;
import com.innovasoft.PO2Academy.infrastructure.output.jpa.repository.IQuestionRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class QuestionJpaAdapter implements IQuestionProviderPort {
    private final IQuestionRepository questionRepository;
    private final QuestionEntityMapper questionEntityMapper;
    @Override
    public List<Question> getByIdChallengeAndLevel(Long challengeId, int level) {
        return questionRepository.findByChallengeIdAndLevel(challengeId,level)
                .stream()
                .map(questionEntityMapper::toModel)
                .collect(Collectors.toList());
    }
}
