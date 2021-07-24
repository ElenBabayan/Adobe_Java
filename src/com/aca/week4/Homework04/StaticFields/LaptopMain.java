package com.aca.week4.Homework04.StaticFields;

public class LaptopMain {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop();
        Laptop laptop3 = new Laptop();
        Laptop laptop4 = new Laptop("Dell");
        Laptop laptop5 = new Laptop("Asus");

        System.out.println(Laptop.counterPublic);
        System.out.println(Laptop.counterProtected);

        laptop5.setCounter(1);
        System.out.println(laptop5.getCounter());

    }
}
