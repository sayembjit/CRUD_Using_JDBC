package com.mottakin.main.exception;

public class BirthdayNotFoundException extends RuntimeException{
    private static final String MESSAGE = "There is no birthday saved against the id!";

    public BirthdayNotFoundException() {
        super(MESSAGE);
    }

}
