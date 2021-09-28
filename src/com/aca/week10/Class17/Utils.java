package com.aca.week10.Class17;

public class Utils {
    private Utils(int x, int y) {

    }

    public static void check(final XY xy) {
        int x = xy.getX();
        int y = xy.getY();

        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
