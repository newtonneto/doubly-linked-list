package com.newton.exceptions;

public class InvalidListIndex extends RuntimeException {
    public InvalidListIndex(String error) {
        super(error);
    }
}
