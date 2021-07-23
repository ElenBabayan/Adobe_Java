package com.aca.week3.Homework02;
import com.aca.week3.Homework02.ProgressAware;
import java.util.concurrent.TimeUnit;

public class CircleProgressAware extends ProgressAware {

    @Override
    public void showProgress(int seconds) throws InterruptedException {
        showProgress();
        double currTime = 0;
        while(currTime <= seconds) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println( "Circle width: " + String.format("%.2f", 360 * (currTime/seconds)) +
                    ", Progress length: " +  (int) currTime );
            currTime++;
        }
        hideProgress();
    }

    public static void main(String[] args) throws InterruptedException {
        CircleProgressAware circleProgressAware = new CircleProgressAware();
        circleProgressAware.showProgress(10);
    }
}
