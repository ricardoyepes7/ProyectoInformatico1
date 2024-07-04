package com.innovasoft.PO2Academy.domain.usecase;

import com.innovasoft.PO2Academy.domain.api.IAnswerServicePort;
import com.innovasoft.PO2Academy.domain.model.Answer;
import com.innovasoft.PO2Academy.domain.spi.IAnswerProviderPort;

import java.util.List;

public class AnswerUseCase implements IAnswerServicePort {
    private final IAnswerProviderPort answerProviderPort;

    public AnswerUseCase(IAnswerProviderPort answerProviderPort) {
        this.answerProviderPort = answerProviderPort;
    }

    @Override
    public List<Answer> getByQuestionId(Long questionId) {
        return answerProviderPort.getByQuestionId(questionId);
    }

    @Override
    public boolean isCorrect(Long id) {
        return answerProviderPort.isCorrect(id);
    }
}
