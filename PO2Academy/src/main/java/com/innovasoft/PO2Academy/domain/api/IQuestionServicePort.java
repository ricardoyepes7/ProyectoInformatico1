package com.innovasoft.PO2Academy.domain.api;

import com.innovasoft.PO2Academy.domain.model.Question;

import java.util.List;

public interface IQuestionServicePort {
   List<Question> getByIdChallengeAndLevel(Long challengeId, int level);
}
