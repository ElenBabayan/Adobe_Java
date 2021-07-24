package com.aca.week4.Homework04.Polymorphism.second;

public class Rectangle implements Shape {
    private Edge a;
    private Edge b;

    public Rectangle(Edge a, Edge b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a.getLength() * b.getLength();
    }

    @Override
    public ShapeType getName() {
        return ShapeType.RECTANGLE;
    }
}
