package com.aca.week9.Class16.task3;

public final class AppUtils {
    // do not want to create objects from AppUtils => private
    private AppUtils() {
    }

    public static void sleep(int sec){

        long startMillis = System.currentTimeMillis();
        while(System.currentTimeMillis() - startMillis < sec * 1000) {

        }
    }
}
