package com.aca.week10.Homework07.task8;

public class UnsafeSimpleList<T> implements SimpleList<T> {

    private Object [] arrOfObjects = new Object[10000];
    private int length;

    @Override
    public void add(Object item) {
        if(length >= arrOfObjects.length) {
            throw new IndexOutOfBoundsException();
        }
        arrOfObjects[length] = item;
        length++;
    }

    @Override
    public int getSize() {
        return length;
    }

    @Override
    public T get(int index) {

        if(index < 0 || index > length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        return (T)arrOfObjects[index];
    }

    public static void main(String[] args) {
        UnsafeSimpleList<Integer> unsafeSimpleList = new UnsafeSimpleList<>();

        for (int i = 0; i < 20; i++) {
            int tmp = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    unsafeSimpleList.add(tmp);
                    System.out.println(unsafeSimpleList.get(tmp));
                }
            }).run();

        }
    }
}
