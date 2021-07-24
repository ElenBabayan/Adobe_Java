package com.aca.week4.Homework04.Interfaces.first;

public class Frog implements LandAnimal, WaterAnimal {
    @Override
    public void isBreathing() {
        System.out.println("Frog is breathing");
    }

    @Override
    public void isRunning() {
        System.out.println("Frog is running");
    }

    @Override
    public void isSwimming() {
        System.out.println("Frog is swimming");
    }
}
