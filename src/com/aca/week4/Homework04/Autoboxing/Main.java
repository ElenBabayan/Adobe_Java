package com.aca.week4.Homework04.Autoboxing;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //first part
        Random rand = new Random();
        Integer integer = -1 * rand.nextInt();
        System.out.println(calculateAbsoluteValue(integer));

        //second part
        List<Double> myList = new ArrayList<>();
        double num1 = 23.4;
        myList.add(num1);
        myList.add(4.5);
        myList.add(6.3);
        myList.add(Math.PI);

        double element = myList.get(0);
        System.out.println(element);

    }

    public static int calculateAbsoluteValue( Integer integer) {
        return Math.abs(integer);
    }
}
