package com.aca.week2.Class4;

public class Car {
    // variables ---- constructors ---- public methods ---- getter&setter ---- private methods
   // same folder  - no 2 same names


    // String str1,str2,str2 = white => in JAVA all 3 strings can point to the same reference

    // compare all characters, length - equals
    private final String colour;
    private final String[] colourArray = {"BLUE", "RED", "BLACK", "WHITE"};

    public String getColour() {
        return colour;
    }

    public Car(String colour) {

        if(!checkIfValid(colour))
            throw new RuntimeException();

        this.colour = colour;
        System.out.println(this.colour);
    }

    private boolean checkIfValid(String colour) {
        for (String s : colourArray) {
            if (s.equals(colour)) {
                return true;
            }
        }

        return false;
    }

    public  boolean compare(Car car1, Car car2) {
        return car1.getColour().equals(car2.getColour());
    }

//    public static boolean compare(Car other) {
//        return this.getColour().equals(other.getColour());
//    }
    public static void main(String[] args) {
        Car car1 = new Car("RED");
        Car car2 = new Car("RED");

      //  System.out.println(compare(car1, car2));
    }

}
