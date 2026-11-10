package com.safevault.exception;

import org.springframework.http.HttpStatus;

public class ForbiddenException extends BankException {
    public ForbiddenException(String message) {
        super(message, HttpStatus.FORBIDDEN);
    }
}
