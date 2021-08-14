package com.aca.week5.Homework05.task1;

public class UsersIsFullException extends RuntimeException {
    public UsersIsFullException() {
    }

    public UsersIsFullException(String message) {
        super(message);
    }
}
