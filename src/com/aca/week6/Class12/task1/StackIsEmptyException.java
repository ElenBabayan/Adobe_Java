package com.aca.week6.Class12.task1;

public class StackIsEmptyException extends Exception {
    public StackIsEmptyException() {
    }

    public StackIsEmptyException(String message) {
        super(message);
    }

    public StackIsEmptyException(int size) {
        super("Stack is empty. Size: " + size + ". Cannot pop more elements");
    }

}
