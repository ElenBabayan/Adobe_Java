package com.aca.week3.Class6;

//to keep array of constants , also can have properties
public enum ColorEnum {
    RED(255,0,0),
    WHITE(255,255,255);

    //RGB
    private int red;
    private int green;
    private int blue;

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    ColorEnum(int red, int green, int blue) {
    //    super(); by default
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

}
