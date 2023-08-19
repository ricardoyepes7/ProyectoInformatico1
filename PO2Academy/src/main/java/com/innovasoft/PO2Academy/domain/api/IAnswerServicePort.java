package com.innovasoft.PO2Academy.domain.api;

import com.innovasoft.PO2Academy.domain.model.Answer;


import java.util.List;

public interface IAnswerServicePort {
    List<Answer> getByQuestionId(Long questionId);
    boolean isCorrect(Long id);
}
