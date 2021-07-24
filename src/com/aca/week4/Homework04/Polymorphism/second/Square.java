package com.aca.week4.Homework04.Polymorphism.second;

public class Square implements Shape  {

    private final Edge a;

    public Square(Edge a) {
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return a.getLength() * a.getLength();
    }

    @Override
    public ShapeType getName() {
        return ShapeType.SQUARE;
    }
}
