package com.yibo.exception;

public class NoSuchBeanException extends RuntimeException {
    private static final long serialVersionUID = 3514690173731489132L;

    public NoSuchBeanException() {
    }

    public NoSuchBeanException(String message) {
        super(message);
    }
}