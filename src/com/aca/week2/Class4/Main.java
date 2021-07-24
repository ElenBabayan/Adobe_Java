package com.aca.week2.Class4;

public class Main {

    public static void main(String[] args) {
        // if milli is incorrect =>
        // all checks in setter/constructor
        // Person p = new Person(2);
        // Person person = new Person(-59); //ctrl b  -  goes to the constructor
        //  Person person1 = new Person(""); // calls constructor with corresponding signature


        //  Person person = new Person();

        final Person person1 = new Person();

        // good practice not to modify person =>  final

        // not same object , not same reference in memory
        final Person p1 = new Person();
        final Person p2 = new Person();

        p1.equals(p2);
        // same but no guarantee
        String s = "black";
        String s1 = "black";

        // references vs parunakutyun

    }
}
