package com.innovasoft.PO2Academy.domain.usecase;

import com.innovasoft.PO2Academy.domain.api.IQuestionServicePort;
import com.innovasoft.PO2Academy.domain.model.Question;
import com.innovasoft.PO2Academy.domain.spi.IQuestionPersistencePort;

import java.util.List;

public class QuestionUseCase implements IQuestionServicePort {
    private final IQuestionPersistencePort questionPersistencePort;

    public QuestionUseCase(IQuestionPersistencePort questionPersistencePort) {
        this.questionPersistencePort = questionPersistencePort;
    }

    @Override
    public List<Question> getByIdChallengeAndLevel(Long challengeId, int level) {
        return questionPersistencePort.getByIdChallengeAndLevel(challengeId,level);
    }
}
