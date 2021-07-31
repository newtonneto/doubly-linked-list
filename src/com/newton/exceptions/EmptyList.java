package com.newton.exceptions;

public class EmptyList extends RuntimeException {
    public EmptyList(String error) {
        super(error);
    }
}
