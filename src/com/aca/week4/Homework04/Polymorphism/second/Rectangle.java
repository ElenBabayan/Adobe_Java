package com.aca.week4.Homework04.Polymorphism.second;

public class Rectangle implements Shape {
    private final double sideLength1;
    private final double sideLength2;

    public Rectangle(double sideLength1, double getSideLength2) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = getSideLength2;
    }

    @Override
    public double calculateArea() {
        return sideLength1 * sideLength2;
    }

    @Override
    public ShapeType getName() {
        return ShapeType.RECTANGLE;
    }
}
