package com.aca.week4.Class8.game;

public class Timer {

    private final TimerListener timerListener;

    public Timer(TimerListener timerListener) {
        this.timerListener = timerListener;
    }

    public void start() {

        long printMillis = System.currentTimeMillis();
        while(true) {
            long delta = System.currentTimeMillis() - printMillis;

            if(delta > 100) {
                printMillis = System.currentTimeMillis();
                timerListener.onTick();
            }
        }
    }
}
