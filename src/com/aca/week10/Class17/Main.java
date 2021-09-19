package com.aca.week10.Class17;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new SafeCounter();
        CounterRunnable counterRunnable = new CounterRunnable(counter);
        CounterRunnable counterRunnable1 = new CounterRunnable(counter);
        Thread t1 =  new Thread(counterRunnable);
        Thread t2 = new Thread(counterRunnable1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCount());

        /*
        create Thread and call run
        thread is in Runnable state - started to work

        start doesn't guarantee that thread will work
        OS decides

        afterwards thread will go to terminate state

        counter object is shared between 2 threads => potential error

        t1:0   1
        t2:  0   1(but should be 2)

        In case of SafeCounter, it is in block state until increment is not finished
         */
    }
}
