package com.innovasoft.PO2Academy.domain.spi;

import com.innovasoft.PO2Academy.domain.model.Question;

import java.util.List;

public interface IQuestionProviderPort {
    List<Question> getByIdChallengeAndLevel(Long challengeId, int level);

}
