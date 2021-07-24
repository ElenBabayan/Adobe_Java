package com.aca.week4.Homework04.Interfaces.first;

public class Lion implements LandAnimal {
    @Override
    public void isBreathing() {
        System.out.println("Lion is breathing");
    }

    @Override
    public void isRunning() {
        System.out.println("Lion is running");
    }

    @Override
    public void isSwimming() {
        System.out.println("Lion is not swimming");
    }
}
