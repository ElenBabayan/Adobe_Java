package com.aca.week4.Class7;

public class Main {

    public static void main(String[] args) {
//        ProgressAware progressAware = new ProgressAware();
//        progressAware.show(5);
//
//        ProgressAware lineProgress = new LineProgress(500);
//        lineProgress.show(5);
//
        HDDStorage o1 = new HDDStorage();
        SSDStorage o2 = new SSDStorage();


        o1.read();
        o1.write(50);

        o2.write(100);
        o2.read();

    }
}
