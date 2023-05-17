package com.innovasoft.PO2Academy.controller;

import com.innovasoft.PO2Academy.dto.QuestionDto;
import com.innovasoft.PO2Academy.dto.QuizDto;
import com.innovasoft.PO2Academy.service.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/grade")
public class GradeRestController {

    @Autowired
    ChallengeService challengeService;
    @PostMapping
    public ResponseEntity gradeChallenge(@RequestBody List<Long> answerList, Principal principal){
        return ResponseEntity.status(201).body(challengeService.grade(answerList,principal.getName()));
    }

    @GetMapping
    public ResponseEntity levelUp(Principal principal){
        ;
        return ResponseEntity.ok(challengeService.levelUp(principal.getName()));
    }
}
