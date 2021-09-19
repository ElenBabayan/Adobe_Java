package com.aca.week10.Class17;

public final class AppUtils {

    private AppUtils() {

    }

    public static void sleep(int sec) {
        long startTimeMillis = System.currentTimeMillis();

        while (System.currentTimeMillis() - startTimeMillis <= sec * 1000) {

        }
    }
}