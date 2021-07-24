package com.aca.week3.Class6;

public class PointImplement {


    public static void main(String[] args) {

        PolarCoordinates polarCoordinates = new PolarCoordinates(1,1);
        System.out.println(String.format("%.2f", polarCoordinates.getX()));
        System.out.println(String.format("%.2f", polarCoordinates.getY()));
        System.out.println(polarCoordinates.getType());

        // cartesianPoint is Point

        // point is pointer to reference in heap // cartesianCoord is object in heap
        Object point = new CartesianCoordinate(10,15);
        CartesianCoordinate point2 = new CartesianCoordinate(1,1);
        PolarCoordinates point1 = new PolarCoordinates(1,2);

      //  System.out.println(point2.getClass() == Point.class); WILL BE FALSE

        if(point1 instanceof Point) {
            System.out.println(true);
        }

//        System.out.println(String.format("%.2f", point.getPhi()));
//        System.out.println(String.format("%.2f", point.getR()));
//        System.out.println(point.getType());
        // for Object point only methods of Object are visible

        System.out.println(point.toString());
        /*
        there is no super() in toString,
        and in general in METHODS, if overridden


         */
        isAtStartPointC(point2);
        //isAtStartPointP(point2); // error , types are different

        isAtStartPointC(point1);

        // object of INTERFACE can be created ONLY
        // IF all methods are implemented
        Point p = new Point() {
            @Override
            public PointType getType() {
                return null;
            }

            @Override
            public double getPhi() {
                return 0;
            }

            @Override
            public double getR() {
                return 0;
            }

            @Override
            public double getX() {
                return 0;
            }

            @Override
            public double getY() {
                return 0;
            }
        };
    }


    public static boolean isAtStartPointC(Object point) {
        // if new Object() is passed, class cast exception will be thrown
        // or should check if instance of Point, then cast
        Point p = (Point) point;
        return p.getX() == 0 && p.getY() == 0;

    }
//    public static boolean isAtStartPointP(PolarCoordinates point) {
//        return point.getX() == 0 && point.getY() == 0;
//    }
//


    // CTRL + SHIFT + F -- find in project

}
