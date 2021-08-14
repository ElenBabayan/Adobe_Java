package com.aca.week6.Class12.task1;

import com.aca.week6.Class12.task1.StackIsEmptyException;
import com.aca.week6.Class12.task1.StackIsFullException;

public interface Stack<T> {
    // in interface NO PUBLIC

    void push(T obj) throws StackIsFullException;

    T pop() throws StackIsEmptyException;
}
