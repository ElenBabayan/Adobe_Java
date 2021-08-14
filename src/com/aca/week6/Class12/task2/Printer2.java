package com.aca.week6.Class12.task2;

public class Printer2 <T,K> {

    public void print1(K[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }

    public void print2(T[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }

    // generic K,V => Object - type erasure
    // => signature is the same


}
