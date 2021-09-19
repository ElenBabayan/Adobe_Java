package com.aca.week9.Class16;

public class SystemErrorResultPrinter implements ResultPrinter{

    public void print(String s) {
        System.err.println(s);
    }
}
