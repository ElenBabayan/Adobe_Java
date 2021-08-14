package com.aca.week5.Class9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int a = 5;
//
//        System.out.println(a);
//
//        a = change(a);
//
//        System.out.println(a);
//
//
//        Color color = new Color(5,5,5);
//        System.out.println(color);
//
//        change(color);
//
//        System.out.println(color);
//
//        final Color color1 = color(color);
//        change(color1);
//
//        System.out.println(color1);
//
//
//        final Point p = new PointImmutable(1,2,new Color(9,9,9));
//        Color color = p.getColor();
//        color = null; // color will point to null
//        System.out.println(p); //p's color will remain unchanged
//// will not throw nullptr,
        Color color = new Color(3,4,5);
        Color c1 = color;
        Color c2 = color;

        color.setR(10000);

        System.out.println(c1);
        System.out.println(c2);

        Scanner kb = new Scanner(System.in);
        try {
            int a = kb.nextInt(); //no access to variables inside try
            int b = kb.nextInt();
            if (b == 0) {
                System.out.println("Error: cannot divide by zero.");
                System.out.println("Enter b");
                b = kb.nextInt();
            } else {
                System.out.println(divide(a, b));
            }
        }
        catch (InputMismatchException e) {
            System.out.println("exception");
        }


        System.out.println("After try");
        // 1 line
      //  System.out.println( b == 0 ? "Error: cannot divide by zero." : (divide(a, b)) );

    }

    /*
    Main thread - step by step executed
    as soon as sees exception, program stops
     */
    public static double divide(int a, int b) {
        return a / b;
    }

    public static Color color(Color color) {// receives a reference, returns a reference
        // color = null    will not throw nullptr exception
        return color;
    }

    public static void change(Color color) {
        color.setB(77);
    }

    public static int change(int a) {
        a = 77;
        return a;
    }
}
