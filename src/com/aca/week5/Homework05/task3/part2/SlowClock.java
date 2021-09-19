package com.aca.week5.Homework05.task3.part2;

public class SlowClock implements Clock {

    private int seconds = 0;

    @Override
    public void start() {
        long startTime = System.currentTimeMillis();
        while (true) {
            if (System.currentTimeMillis() - startTime > 2000) {
                seconds++;
                System.out.println(seconds);
                startTime = System.currentTimeMillis();
            }
        }
    }
}
