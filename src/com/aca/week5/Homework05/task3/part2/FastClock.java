package com.aca.week5.Homework05.task3.part2;

import com.aca.week5.Homework05.task3.part2.Clock;

public class FastClock implements Clock {

    private int seconds = 0;

    @Override
    public void start() {
        long startTime = System.currentTimeMillis();
        while (true) {
            if (System.currentTimeMillis() - startTime > 500) {
                seconds++;
                System.out.println(seconds);
                startTime = System.currentTimeMillis();
            }
        }
    }
}
