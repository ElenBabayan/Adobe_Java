package com.aca.week6.Class12.task1;

import java.util.Arrays;
import java.util.Objects;

// type parameter - T
// left T ---> right T
public class StackDefault<T> implements Stack<T> {

    private static final int STACK_SIZE = 5;
    private T[] objects;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public StackDefault() {
        this.objects = (T[]) new Object[STACK_SIZE];
    }

    @Override
    public void push(T obj) throws StackIsFullException {
        if (obj == null)
            throw new IllegalArgumentException("Pushed object into Stack should not be null");

        if (size == STACK_SIZE) {
            throw new StackIsFullException(STACK_SIZE);
        }

        objects[size] = obj;
        size++;
    }


    @Override
    public T pop() throws StackIsEmptyException {
        if (size == 0) {
            throw new StackIsEmptyException();
        }

        T tmp = objects[size - 1];
        objects[size - 1] = null;
        size--;
        return tmp;
    }

    public void printStack() {
        for (int i = 0; i < size; i++) {
            System.out.println(objects[i]);
        }
    }

    @Override
    public String toString() {
        return "Stack{" +
                "objects=" + Arrays.toString(objects) +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StackDefault)) return false;
        StackDefault<?> that = (StackDefault<?>) o;
        return size == that.size &&
                Arrays.equals(objects, that.objects);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(objects);
        return result;
    }
}
