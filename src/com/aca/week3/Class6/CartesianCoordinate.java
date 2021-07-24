package com.aca.week3.Class6;

public class CartesianCoordinate implements Point {
    private final double x;
    private final double y;

    public CartesianCoordinate(double x, double y) {
        this.x = x;
        this.y = y;
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
    public double getPhi() {
        return Math.atan(getY()/getX()) ;
    }

    @Override
    public double getR() {
        return Math.sqrt(getX() * getX() + getY() * getY());
    }

    @Override
    public PointType getType() {
        return PointType.CARTESIAN;
    }

    @Override
    public String toString() {
        return "CartesianCoordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
//        if(o == null) {
//            return false;
//        } // if instance of =>no need

        if(!(o instanceof Point)) { // does null check
            return false;
        }
        Point p = (Point) o;
        return this.getX() == p.getX() && this.getY() == p.getY();
    }
}
