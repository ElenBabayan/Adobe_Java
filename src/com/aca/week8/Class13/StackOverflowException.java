package com.aca.week8.Class13;

public class StackOverflowException extends Exception {
    public StackOverflowException(int maxSize) {
        super("Stack max size - " + maxSize + " is exceeded");
    }
}