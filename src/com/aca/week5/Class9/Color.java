package com.aca.week5.Class9;

import java.util.Objects;

public class Color {

    private int r; // 0 - 255
    private int g;
    private int b;

    public Color() {
        super();
    }

    public Color(Color color) {
        this.r = color.getR();
        this.g = color.getG();
        this.b = color.getB();
    }

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Color))
            return false;

        Color color = (Color) o;
        return getR() == color.getR() &&
                getG() == color.getG() &&
                getB() == color.getB();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getR(), getG(), getB());
    }

    @Override
    public String toString() {
        return "Color{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }
}
