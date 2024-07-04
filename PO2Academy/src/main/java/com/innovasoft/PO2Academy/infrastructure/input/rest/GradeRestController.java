package com.innovasoft.PO2Academy.infrastructure.input.rest;

import com.innovasoft.PO2Academy.application.dto.GradeDto;
import com.innovasoft.PO2Academy.application.handler.interfaces.IChallengeHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/grade")
@RequiredArgsConstructor
public class GradeRestController {
    private final IChallengeHandler challengeHandler;
    @PostMapping
    public ResponseEntity<GradeDto> gradeChallenge(@RequestBody List<Long> answerList, Principal principal){
        return ResponseEntity.status(201).body(challengeHandler.grade(answerList,principal.getName()));
    }

    @GetMapping
    public ResponseEntity<Integer> levelUp(Principal principal){
        return ResponseEntity.ok(challengeHandler.levelUp(principal.getName()));
    }
}
