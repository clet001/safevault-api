package com.safevault.exception;

import org.springframework.http.HttpStatus;

public class ConflictException extends BankException {
    public ConflictException(String message) {

        super(message, HttpStatus.CONFLICT);
    }
}
