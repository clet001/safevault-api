package com.safevault.exception;

import org.springframework.http.HttpStatus;

public class UnauthorizedException extends BankException {

    public UnauthorizedException(String message) {
        super(message, HttpStatus.UNAUTHORIZED);
    }
}
