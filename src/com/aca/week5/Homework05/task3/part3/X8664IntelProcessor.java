package com.aca.week5.Homework05.task3.part3;

public class X8664IntelProcessor implements Processor {
    @Override
    public long calculateBinary(long decimal) {
        long startTime = System.currentTimeMillis();
        String binary;
        while (true) {
            if (System.currentTimeMillis() - startTime > 2000) {
                binary = java.lang.Long.toBinaryString(decimal);
                break;
            }
        }

        return Long.parseLong(binary);
    }
}
