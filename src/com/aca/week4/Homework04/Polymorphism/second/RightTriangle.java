package com.aca.week4.Homework04.Polymorphism.second;

public class RightTriangle implements Shape {

    private final double base;
    private final double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }

    @Override
    public ShapeType getName() {
        return ShapeType.RIGHT_TRIANGLE;
    }
}
