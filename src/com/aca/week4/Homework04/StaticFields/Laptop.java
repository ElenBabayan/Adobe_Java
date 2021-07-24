package com.aca.week4.Homework04.StaticFields;

public class Laptop {
    public static int counterPublic;
    public static int counterProtected;
    private int counter;
    private String model;


    public Laptop() {
        counterPublic++;
    }

    protected Laptop(String model) {
        counterProtected++;
        this.model = model;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }
}
