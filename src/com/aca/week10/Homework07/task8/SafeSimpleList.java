package com.aca.week10.Homework07.task8;

import com.aca.week8.Class13.Randomizer;

import java.util.Random;

public class SafeSimpleList<T> implements SimpleList<T> {

    private Object[] arrOfObjects = new Object[10000];
    private int length = 0;

    @Override
    public synchronized void add(Object item) {

        if (length >= arrOfObjects.length) {
            throw new IndexOutOfBoundsException();
        }
        arrOfObjects[length] = item;
        length++;
    }

    @Override
    public synchronized int getSize() {
        return length;
    }

    @Override
    public synchronized T get(int index) {

        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        return (T) arrOfObjects[index];
    }

    public static void main(String[] args) throws InterruptedException {

        SafeSimpleList<Integer> safeSimpleList = new SafeSimpleList<>();

        for (int i = 0; i < 20; i++) {
            int tmp = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 500; j++) {
                        safeSimpleList.add(j);
                        safeSimpleList.get(j);
                    }

                }
            }).start();
        }
        Thread.sleep(1000);


        System.out.println(safeSimpleList.getSize());
    }
}
