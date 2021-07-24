package com.aca.week3.Class6;

public class PolarCoordinates implements Point {
    private final double r;
    private final double phi;

    public PolarCoordinates(double r, double phi) {
        this.r = r;
        this.phi = phi;
    }

    @Override
    public double getX() {
        return Math.cos(phi) * r;
    }

    @Override
    public double getY() {
        return Math.sin(phi) * r;
    }

    @Override
    public double getPhi() {
        return phi;
    }

    @Override
    public double getR() {
        return r;
    }

    @Override
    public PointType getType() {
        return PointType.POLAR;
    }
}
