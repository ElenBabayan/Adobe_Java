package com.aca.week4.Class7;

public class Utils {

    private Utils() {
    }

    // STATIC because it doesn't keep state of object
    // and because it belongs to class
    public static void sleep(int millis) {
        long startMillis = System.currentTimeMillis();
        while(System.currentTimeMillis() - startMillis < millis) {

        }
    }

    public static void main(String[] args) {
        Utils obj = new Utils();
    }
}
