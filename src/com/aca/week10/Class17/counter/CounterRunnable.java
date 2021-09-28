package com.aca.week10.Class17.counter;

public class CounterRunnable implements Runnable {

    private Counter counter;

    public CounterRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
//        CounterImpl counter = new CounterImpl();
//        for (int i = 0; i < 20000; i++) {
//            int c = counter.getCount();
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            final int newCount = c + 1;
//            counter.setCount(newCount);
//        }

        // two threads simultaneously increment
        for (int i = 0; i < 20000; i++) {
                //final int count = counter.getCount();
                counter.increment();
                //final int newCount = count + 1;
                //counter.setCount(counter.getCount());

        }
        System.out.println("For is ended");
    }
}
