package com.aca.week4.Homework04.Polymorphism.second;

public class Square implements Shape  {

    private final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public ShapeType getName() {
        return ShapeType.SQUARE;
    }
}
