package com.aca.week4.Class7;

import com.aca.week3.Homework02.ProgressAware;

public class CircleProgressAware extends ProgressAware {

//System.out.println( "Circle width: " + String.format("%.2f", 360 * (currTime/seconds)) +
//            ", Progress length: " +  (int) currTime );
//    currTime++;
//
//    @Override
//    public void print(final int p) {
//        System.out.println((p * lineLength)/100 + "current line length");
//    }


    public static void main(String[] args) throws InterruptedException {
        com.aca.week3.Homework02.CircleProgressAware circleProgressAware = new com.aca.week3.Homework02.CircleProgressAware();
        circleProgressAware.showProgress(10);
    }
}
