package com.aca.week4.Homework04.Enums;

public enum Directions {
    EAST(1,0,0,0),
    SOUTH(0,1,0,0),
    NORTH(0,0,1,0),
    WEST(0,0,0,1);

    private int east;
    private int south;
    private int north;
    private int west;

    public int getEast() {
        return east;
    }

    public int getSouth() {
        return south;
    }

    public int getNorth() {
        return north;
    }

    public int getWest() {
        return west;
    }

    Directions(int east, int south, int north, int west) {
        this.east = east;
        this.south = south;
        this.north = north;
        this.west = west;
    }

    @Override
    public String toString() {
        return "Directions{" +
                "east=" + east +
                ", south=" + south +
                ", north=" + north +
                ", west=" + west +
                '}';
    }
}
