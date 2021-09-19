package com.aca.week10.Class17;

public class SafeCounter implements Counter {

    private int count ;
    @Override
    public synchronized int getCount() {
        return count;
    }

    @Override
    public synchronized int increment() {
        return count++;
    }
}
