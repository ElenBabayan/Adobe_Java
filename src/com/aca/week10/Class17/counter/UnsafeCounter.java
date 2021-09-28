package com.aca.week10.Class17.counter;

import com.aca.week10.Class17.counter.Counter;

public class UnsafeCounter implements Counter {

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
