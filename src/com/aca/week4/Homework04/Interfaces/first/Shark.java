package com.aca.week4.Homework04.Interfaces.first;

public class Shark implements WaterAnimal {
    @Override
    public void isBreathing() {
        System.out.println("Shark is breathing");
    }

    @Override
    public void isRunning() {
        System.out.println("Shark is not running");
    }

    @Override
    public void isSwimming() {
        System.out.println("Shark is swimming");
    }
}
