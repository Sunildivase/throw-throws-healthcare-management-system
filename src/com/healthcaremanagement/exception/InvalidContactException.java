package com.healthcaremanagement.exception;

public class InvalidContactException extends RuntimeException {
    public InvalidContactException(String message) {
        super(message);
    }
}
