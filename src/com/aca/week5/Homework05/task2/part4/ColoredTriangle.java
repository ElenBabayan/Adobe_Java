package com.aca.week5.Homework05.task2.part4;

import com.aca.week5.Homework05.task2.part1.AssertionUtils;
import com.aca.week5.Homework05.task2.part2.ImmutablePoint;
import com.aca.week5.Homework05.task2.part3.Triangle;

public class ColoredTriangle extends Triangle {

    private Color color;

    public ColoredTriangle(ImmutablePoint point1, ImmutablePoint point2, ImmutablePoint point3, Color color) {
        super(point1, point2, point3);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Triangle)){
            return false;
        }
        if(o.getClass() == Triangle.class) {
           return o.equals(this);
        }
        ColoredTriangle that = (ColoredTriangle) o;
        return color == that.color;
    }

    @Override
    public String toString() {
        return super.toString() + "ColoredTriangle{" +
                "color=" + color +
                '}';
    }

    public static void main(String[] args) {
        ImmutablePoint p1 = new ImmutablePoint(1,2);
        ImmutablePoint p2 = new ImmutablePoint(3,4);
        ImmutablePoint p3 = new ImmutablePoint(5,6);
        ImmutablePoint p4 = new ImmutablePoint(6,8);

        ColoredTriangle ct1 = new ColoredTriangle(p1,p2,p3,Color.BLUE);

        ColoredTriangle ct2 = new ColoredTriangle(p1,p2,p4, Color.BLUE);

        Triangle t1 = new Triangle(p1,p2,p3);
        AssertionUtils.assertNotNull(ct1);
        AssertionUtils.assertNotNull(ct2);
        AssertionUtils.assertNotNull(t1);

        System.out.println(ct1.equals(ct2));
        System.out.println(t1.equals(ct2));

    }
}
