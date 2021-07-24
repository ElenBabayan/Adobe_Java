package com.aca.week4.Homework04.Enums;

public class DirectionsMain {

    public static void main(String[] args) {
        Directions directions1 = Directions.EAST;
        Directions directions2 = Directions.SOUTH;
        Directions directions3 = Directions.NORTH;
        Directions directions4 = Directions.WEST;

        System.out.println(directions1.getWest());
        System.out.println(directions1.toString());
    }

}
