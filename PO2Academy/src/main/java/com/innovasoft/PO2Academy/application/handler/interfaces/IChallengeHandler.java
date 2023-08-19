package com.innovasoft.PO2Academy.application.handler.interfaces;

import com.innovasoft.PO2Academy.application.dto.GradeDto;
import com.innovasoft.PO2Academy.application.dto.QuizDto;

import java.util.List;

public interface IChallengeHandler {
    QuizDto getChallengeByName(String challengeName, String username);
    GradeDto grade(List<Long> answerList, String username);
    int levelUp(String username);
}
