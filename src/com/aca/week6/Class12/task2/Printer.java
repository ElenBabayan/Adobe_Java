package com.aca.week6.Class12.task2;

public class Printer<T> {

    public void print(T[] objects) {
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }

    // in any generic class, T is actually an Object - type erasure
    // during compilation, T is replaced
    public static void main(String[] args) {
        Printer<String> printer = new Printer<>();
        String[] strArr = {"s1", "s2", "s3", "s4"};
        printer.print(strArr);

        new Printer<Integer>().print(new Integer[]{1, 2, 3});

        Printer<String> objectPrinter = new Printer<>();
        objectPrinter.print(new String[] {"a", "b"});

        Printer2<String, Integer> printer2 = new Printer2<>();
        printer2.print1(new Integer[]{1,2,3});
        printer2.print2(new String[]{"1", "2", "3"});
    }


}
