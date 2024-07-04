package com.innovasoft.PO2Academy.domain.spi;

import com.innovasoft.PO2Academy.domain.model.Answer;

import java.util.List;

public interface IAnswerProviderPort {
    List<Answer> getByQuestionId(Long questionId);
    boolean isCorrect(Long id);
}
