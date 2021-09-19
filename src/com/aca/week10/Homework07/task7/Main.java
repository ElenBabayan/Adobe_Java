package com.aca.week10.Homework07.task7;

import java.util.ArrayList;
import java.util.List;

/*
Create 100 threads that accept anonymous runnable instances and each adds 1 to 500 numbers to a shared list.
Assure that after all threads execution list size is 50000.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 1; j <= 500; j++) {
                        synchronized (list) {
                            list.add(j);
                        }
                    }
                }

            }).start();

        }
        Thread.sleep(2000);

        System.out.println(list.size());
    }
}
