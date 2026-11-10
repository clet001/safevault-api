package com.safevault.exception;

import org.springframework.http.HttpStatus;

public class InvalidRequestException extends BankException {

    public InvalidRequestException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
