package com.aca.week6.Class12.task1;

import com.aca.week8.Class13.StackOverflowException;

public interface Stack<T> {
    // in interface NO PUBLIC

    void push(T obj) throws StackIsFullException, StackOverflowException;

    T pop() throws StackIsEmptyException;
}
