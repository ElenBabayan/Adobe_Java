package com.aca.week3.Homework02;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ProgressAware {

    private boolean progressStatus;

    public void showProgress() {
        progressStatus = true;
        System.out.println("Progress became visible");
    }

    public void hideProgress() {
        progressStatus = false;
        System.out.println("Progress became invisible");
    }

    public boolean isProgressVisible() {
            return progressStatus;
    }

    public void showProgress(int seconds) throws InterruptedException {
        showProgress();
        long currTime = 0;
        while(currTime <= seconds) {
            TimeUnit.SECONDS.sleep(1);
            long progress = progressLengthCalculator(currTime, seconds);
            System.out.println( "Progress length: " + progress + " % ");
            currTime++;
        }
        hideProgress();
    }
    private long progressLengthCalculator(long currTime, int seconds) {
        return currTime * 100 / seconds;
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        ProgressAware progressAware = new ProgressAware();
        progressAware.showProgress(10);
    }

}
