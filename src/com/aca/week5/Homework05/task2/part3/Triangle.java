package com.aca.week5.Homework05.task2.part3;

import com.aca.week5.Homework05.task2.part1.AssertionUtils;
import com.aca.week5.Homework05.task2.part2.ImmutablePoint;
import com.aca.week5.Homework05.task2.part2.Point;

public class Triangle {

    private final Point point1;
    private final Point point2;
    private final Point point3;

    public Triangle(Point point1, Point point2, Point point3) {

        AssertionUtils.assertNotNull(point1);
        AssertionUtils.assertNotNull(point2);
        AssertionUtils.assertNotNull(point3);

        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Triangle(Triangle triangle) {

        AssertionUtils.assertNotNull(triangle);

        this.point1 = new ImmutablePoint(triangle.point1);
        this.point2 = new ImmutablePoint(triangle.point2);
        this.point3 = new ImmutablePoint(triangle.point3);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Triangle))
            return false;
        Triangle triangle = (Triangle) o;
        return point1.equals(triangle.point1) &&
                point2.equals(triangle.point2) &&
                point3.equals(triangle.point3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                '}';
    }
}
