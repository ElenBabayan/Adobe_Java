package com.aca.week10.Class17;

import com.aca.week9.Class16.task3.AppUtils;

public class PrintInterruptRunnable implements Runnable {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            AppUtils.sleep(1);
            System.out.println("abc");
        }
    }

    public static void main(String[] args) {
        PrintInterruptRunnable p = new PrintInterruptRunnable();
        p.run();
    }
}
