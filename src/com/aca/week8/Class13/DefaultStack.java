package com.aca.week8.Class13;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DefaultStack<T> implements Stack<T> {
    private T[] stack;
    private int counter = 0;
    private final int STACK_MAX_SIZE = 5;

    @SuppressWarnings("unchecked")
    public DefaultStack() {
        stack = (T[]) new Object[STACK_MAX_SIZE];
    }

    @Override
    public void push(T o) throws StackOverflowException {
        if (o == null) {
            throw new IllegalStateException("Null object");
        } else if (counter < STACK_MAX_SIZE) {
            stack[counter] = o;
            counter++;
        } else {
            throw new StackOverflowException(STACK_MAX_SIZE);
        }
    }

    @Override
    public T pop() {
        if (counter == 0) {
            throw new NoSuchElementException("No element in stack");
        }
        T temp = stack[counter - 1];
        stack[counter - 1] = null;
        counter--;
        return temp;
    }

    @Override
    public Iterator<T> iterator() {
        // returns Iterator<T> , can return new instance of Iter,
        // class that implements Iterator
        return new Iter();
    }

    private class Iter implements Iterator<T> {

        private int modCount;
        private int cursor;

        public T next() {
            checkForModification();
            return stack[cursor++];
        }

        public boolean hasNext() {

            return cursor < counter;
        }

        private void checkForModification() {
            if( modCount != 0) {
                throw new ConcurrentModificationException();
            }
        }
    }


    public static void main(String[] args) throws StackOverflowException {
        DefaultStack<String> myStack = new DefaultStack<>();

        myStack.push("a");
        myStack.push("b");
        myStack.push("c");

       Iterator<String> iter = myStack.iterator();
       while(iter.hasNext()) {
           System.out.println(iter.next());
           // null i vra next => nullPtr exception
       }

      // String obj = (String) myStack.iterator().next();


    }
}