package com.aca.week5.Homework05.task2.part1;

public class AssertionUtils {
    public static void assertEquals(int val1, int val2) {
        if(val1 != val2) {
            throw new RuntimeException("int val1 and int val2 are not equal");
        }
    }
    public static void assertEquals(double val1, double val2) {
        if(val1 != val2) {
            throw new RuntimeException("double val1 and double val2 are not equal");
        }
    }
    public static void assertEquals(String val1, String val2) {
        if(!val1.equals(val2)) {
            throw new RuntimeException("String val1 and String val2 are not equal");
        }
    }
    public static void assertEquals(boolean val1, boolean val2) {
        if(val1 != val2) {
            throw new RuntimeException("boolean val1 and boolean val2 are not equal");
        }
    }
    public static void assertNotNull(Object obj) {
        if(obj == null) {
            throw new RuntimeException("Object obj is null");
        }
    }
}
