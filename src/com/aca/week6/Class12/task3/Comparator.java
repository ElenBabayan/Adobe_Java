package com.aca.week6.Class12.task3;

public class Comparator implements Comparable {

    // partadrum enq vor extend ani Comparable
    // for generic always extends
    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        // extends from Comparable => able to use compareTo method
        T res = a.compareTo(b) > 0 ? a : b;

        return  res.compareTo(c) > 0 ? res : c;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    // can pass different types (raw use)
    /*public static Comparable max(Comparable a, Comparable b) {
        return null;
    }

    public static <T> T method(T a) {
        // Object's methods are visible
        //a.
    }*/

    public static void main(String[] args) {
        System.out.println(max(10, 48, 87));
        // in Class
        System.out.println(Comparator.max(34, 23, 56));
    }
}
