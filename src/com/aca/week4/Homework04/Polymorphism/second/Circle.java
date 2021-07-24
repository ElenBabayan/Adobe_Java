package com.aca.week4.Homework04.Polymorphism.second;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public ShapeType getName() {
        return ShapeType.CIRCLE;
    }
}
