package com.innovasoft.PO2Academy.infrastructure.advice;

import com.innovasoft.PO2Academy.application.exception.ChallengeException;
import com.innovasoft.PO2Academy.application.exception.ChallengeRestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ChallengeException.class)
    public String challengeException(ChallengeException challengeException, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", challengeException.getMessage());
        return "redirect:/challenge";
    }
    @ExceptionHandler(ChallengeRestException.class)
    public ResponseEntity<String> challengeRestException(ChallengeRestException challengeException) {
        return ResponseEntity.status(challengeException.getHttpStatus()).body(challengeException.getMessage());
    }
}
