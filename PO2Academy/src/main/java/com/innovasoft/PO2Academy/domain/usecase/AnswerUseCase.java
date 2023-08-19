package com.innovasoft.PO2Academy.domain.usecase;

import com.innovasoft.PO2Academy.domain.api.IAnswerServicePort;
import com.innovasoft.PO2Academy.domain.model.Answer;
import com.innovasoft.PO2Academy.domain.spi.IAnswerPersistencePort;

import java.util.List;

public class AnswerUseCase implements IAnswerServicePort {
    private final IAnswerPersistencePort answerPersistencePort;

    public AnswerUseCase(IAnswerPersistencePort answerPersistencePort) {
        this.answerPersistencePort = answerPersistencePort;
    }

    @Override
    public List<Answer> getByQuestionId(Long questionId) {
        return answerPersistencePort.getByQuestionId(questionId);
    }

    @Override
    public boolean isCorrect(Long id) {
        return answerPersistencePort.isCorrect(id);
    }
}
