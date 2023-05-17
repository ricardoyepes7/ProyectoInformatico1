package com.innovasoft.PO2Academy.dto;


import java.util.List;

public record QuizDto(  Long id,
         String description,
             List<QuestionDto> questionList) {

}
