package com.aca.week10.Class17;

public class UnsafeCounter implements Counter{

    private int value;

    @Override
    public int getCount() {
        return value;
    }

    @Override
    public int increment() {
        return value++;
    }
}
