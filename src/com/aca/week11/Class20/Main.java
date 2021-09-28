package com.aca.week11.Class20;

public class Main {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread());
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        // ksharunaki ashxatel minchev bolor thread ery verjanan ashxatel
        //  throw new UnsupportedOperationException();
    }
}
