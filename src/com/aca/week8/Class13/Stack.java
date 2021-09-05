package com.aca.week8.Class13;

// extends Iterable - causes errors
public interface Stack<T> extends Iterable<T> {
    void push(T o) throws StackOverflowException;

    T pop();
}