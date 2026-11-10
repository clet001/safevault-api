package com.safevault.exception;

import org.springframework.http.HttpStatus;

public class InsufficientFundsException extends BankException {
    public InsufficientFundsException() {

        super("Insufficient funds", HttpStatus.BAD_REQUEST);
    }
}
