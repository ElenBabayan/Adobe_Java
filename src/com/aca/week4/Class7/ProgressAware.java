package com.aca.week4.Class7;

public class ProgressAware {

    public Visibility visibility;

    public ProgressAware() {
        super();
        visibility = Visibility.VISIBLE; // when object is created => value is assigned (readability)
    }

    public void show() {
        if(visibility == Visibility.VISIBLE) {
            System.out.println("Progress became visible");
            return;
        }
        this.visibility = Visibility.VISIBLE;
        System.out.println("Progress became visible");
    }

    public void show(int sec) {
        long startMillis = System.currentTimeMillis();
        long printMillis = System.currentTimeMillis();
        // curr <= t0 + sec*1000
        //
        while( System.currentTimeMillis() - startMillis <= sec * 1000L) {

            long delta = System.currentTimeMillis() - printMillis;
            if(delta > 100) {
                printMillis = System.currentTimeMillis();
                int temp = (int) ((System.currentTimeMillis() - startMillis) / (sec * 10)) ;
                print(temp);
            }
        }

        // a-b - x%
        //sec  - 10%

    }
    public void print(int t) {
        System.out.println(t + "%");
    }

    public void hide() {
        if(visibility == Visibility.INVISIBLE) {
            System.out.println("Progress is already invisible");
            return;
        }
        this.visibility = Visibility.INVISIBLE;
        System.out.println("Progress became visible");
    }

    public static void main(String[] args) {
        ProgressAware p = new ProgressAware();
        p.show(5);
    }
}
