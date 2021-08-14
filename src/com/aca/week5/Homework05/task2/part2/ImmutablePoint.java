package com.aca.week5.Homework05.task2.part2;

public final class ImmutablePoint implements Point {
    private final double x;
    private final double y;


    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public ImmutablePoint( Point that) {
        this.x = that.getX();
        this.y = that.getY();
    }

    public Point shiftRight() {
        return new ImmutablePoint(x + 1, y);
    }
    public Point shiftLeft() {
        return new ImmutablePoint(x - 1, y);
    }
    public Point shiftUp() {
        return new ImmutablePoint(x, y + 1);
    }
    public Point shiftDown() {
        return new ImmutablePoint(x, y - 1);
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof ImmutablePoint))
            return false;
        ImmutablePoint that = (ImmutablePoint) o;
        return Double.compare(that.x, x) == 0 &&
                Double.compare(that.y, y) == 0;
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }
}
