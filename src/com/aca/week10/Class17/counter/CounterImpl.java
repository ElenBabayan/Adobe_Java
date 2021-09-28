package com.aca.week10.Class17.counter;

public class CounterImpl implements Counter {
    private int count;

    @Override
    public synchronized int getCount() {
        return count;
    }

//    @Override
//    public synchronized void setCount(int count) {
//        this.count = count;
//    }

    // those methods that have synchronized written before return type
    // wait for one thread to finish then the other

    // but again, whenever we call getValue there's no guarantee
    // that it will return 40.000
    // for example during print we call get
    @Override
    public synchronized int increment() {
        return this.count++;
    }

}
