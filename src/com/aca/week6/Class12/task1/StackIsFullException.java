package com.aca.week6.Class12.task1;

public class StackIsFullException extends Exception {
    public StackIsFullException() {
        super();
    }

    public StackIsFullException(String message) {
        super(message);
    }

    public StackIsFullException(int size) {
        super("Stack is full. Size is " + size + ". Cannot push more elements");
    }

}
