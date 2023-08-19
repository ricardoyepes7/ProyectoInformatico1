package com.innovasoft.PO2Academy.infrastructure.exception;

public class JpaException extends RuntimeException{
    public JpaException(String message) {
        super(message);
    }
}
