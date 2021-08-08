package com.aca.week5.Class10.test;

public class Test {
    // C B A

    public static void main(String[] args) {
      //  method();

        final RuntimeException e = new OurException();
        throw e;


    }

    // can pass A B C
    public static void method(C c) {

    }
}
