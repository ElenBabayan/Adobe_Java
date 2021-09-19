package com.aca.week10.Homework07.task12;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
Create a method to return a list of sequential integers for the provided count
and print 2xValue of each element using a separate list argument having method
which can print any kind of numbers (Number is an abstract class in java.lang package)

Also, create a method to return a list of random doubles and print them using the method mentioned above.

input: 5, integer
output:
2.0
4.0
6.0
8.0
10.0

input: 2, double
output:
44.22
-8884.68
 */
public class NumbersGenerator<T extends Number> {

    public List<Integer> func(Integer count) {

        Integer num = new Random().nextInt(100);

        List<Integer> list = new LinkedList<>();

        Integer index = 0;
        while (count > 0) {
            list.add(num + index);
            index++;
            count--;
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
        }

        print(list);

        return list;

    }

    public List<Double> func2(Integer count) {

        List<Double> list = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            list.add(new Random().nextDouble());
        }
        ;

        print(list);

        return list;

    }

    public static <T extends Number> void print(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {

        NumbersGenerator<Integer> numbersGenerator = new NumbersGenerator<>();
        numbersGenerator.func(5);
        numbersGenerator.func2(2);
    }
}
