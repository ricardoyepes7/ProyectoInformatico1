package com.innovasoft.PO2Academy.application.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ChallengeRestException extends RuntimeException{
    private final HttpStatus httpStatus;

    public ChallengeRestException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
