package com.innovasoft.PO2Academy.domain.usecase;

import com.innovasoft.PO2Academy.domain.api.IQuestionServicePort;
import com.innovasoft.PO2Academy.domain.model.Question;
import com.innovasoft.PO2Academy.domain.spi.IQuestionProviderPort;

import java.util.List;

public class QuestionUseCase implements IQuestionServicePort {
    private final IQuestionProviderPort questionProviderPort;

    public QuestionUseCase(IQuestionProviderPort questionProviderPort) {
        this.questionProviderPort = questionProviderPort;
    }

    @Override
    public List<Question> getByIdChallengeAndLevel(Long challengeId, int level) {
        return questionProviderPort.getByIdChallengeAndLevel(challengeId,level);
    }
}
