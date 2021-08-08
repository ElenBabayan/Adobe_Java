package com.aca.week5.Class9;

import java.util.Objects;

public final class PointImmutable implements Point, Cloneable {
    private final int x;
    private final int y;
    private final Color color;

    public PointImmutable(int x, int y, Color color) {
        this.x = x;
        this.y = y;
    //  this.color = color;
        this.color = new Color(color);
    }

    public PointImmutable(PointImmutable p) {
        this.x = p.x();
        this.y = p.y();
        this.color = new Color(p.getColor());
    }

    @Override
    public int x() {
        return x;
    }

    @Override
    public int y() {
        return y;
    }

    @Override
    public Color getColor() {
        return color;
    //    return new Color(color); // by copy constructor
    }

    @Override
    protected PointImmutable clone() throws CloneNotSupportedException {
        return (PointImmutable) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PointImmutable)) return false;
        PointImmutable that = (PointImmutable) o;
        return x == that.x &&
                y == that.y &&
                color.equals(that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, color);
    }

    @Override
    public String toString() {
        return "PointImmutable{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Point p = new PointImmutable(10,5, new Color()); //PointImmutable is Point
        System.out.println(p);

        p.getColor().setB(4); // access to reference => setter modify
        System.out.println(p);
//        PointImmutable pCloned = ((PointImmutable) p).clone();

        Color color1 = new Color(1,2,3);
        Color color2 = new Color(color1);
        System.out.println(color1);
        System.out.println(color2);

        PointImmutable p1 = new PointImmutable(0,0,color1);
        PointImmutable p2 = new PointImmutable(p1);
        System.out.println(p1);
        System.out.println(p2);

        final Color color5 = new Color();
        Point point5 = new PointImmutable(10,5,color5);
        color5.setR(10); // WILL MODIFY VIA CONSTRUCTOR

    }
}
