package com.innovasoft.PO2Academy.infrastructure.advice;

import com.innovasoft.PO2Academy.application.dto.GenericError;
import com.innovasoft.PO2Academy.application.exception.ChallengeException;
import com.innovasoft.PO2Academy.application.exception.ChallengeRestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.net.ConnectException;
@Slf4j
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
    @ExceptionHandler({CannotGetJdbcConnectionException.class, CannotCreateTransactionException.class,
            ConnectException.class, DataAccessResourceFailureException.class})
    public String databaseNotPresent(Exception ex,
                                     Model model) {
        log.error("Database Not Available");
        log.error(ex.getMessage());
        model.addAttribute("error",
                new GenericError("Database Not Available",
                        "No es posible acceder a la base de datos en este momento, por favor inténtelo de nuevo mas tarde." +
                                "Si el error persiste contacte con el administrador."));
        return "error/generic_error";
    }
}
