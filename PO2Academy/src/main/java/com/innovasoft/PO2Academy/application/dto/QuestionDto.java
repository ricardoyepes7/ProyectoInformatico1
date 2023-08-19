package com.innovasoft.PO2Academy.application.dto;

import java.util.List;

public record QuestionDto(Long id, String question, List<AnswerDto> answerList) {
}
