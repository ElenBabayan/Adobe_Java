package com.aca.week4.Homework04.Polymorphism.second;

public class RightTriangle implements Shape {

    private final Edge base;
    private final Edge height;

    public RightTriangle(Edge base, Edge height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base.getLength() * height.getLength() / 2;
    }

    @Override
    public ShapeType getName() {
        return ShapeType.RIGHT_TRIANGLE;
    }
}
