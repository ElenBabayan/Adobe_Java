package com.aca.week10.Homework07.task8;

public interface SimpleList<T>
{
    void add(T item) throws InterruptedException;
    int getSize();
    T get(int index) throws InterruptedException;
}
