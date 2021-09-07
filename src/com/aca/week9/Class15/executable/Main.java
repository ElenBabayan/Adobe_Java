package com.aca.week9.Class15.executable;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write a number");
        int number = scanner.nextInt();

        System.out.println("Please write true for write in file, false for system");
        boolean flag = scanner.nextBoolean();

        System.out.println("Please choose an algorithm");
        System.out.println("1) factorial of 10");
        System.out.println("2) sum of 1-10");
        System.out.println("3) 10! zeros count");
        System.out.println("4) run all 1,2,3");
        int algo = scanner.nextInt();

        callListExecute(returnList(algo, flag, number));

    }

    private static List<Executable> returnList(int algo, boolean flag, int number) {
        if (algo == 1) {
            return Collections.singletonList(new FactorialExecutable(number, flag));
        } else if (algo == 2) {
            return Collections.singletonList(new SumExecutable(number, flag));
        } else if (algo == 3) {
            return Collections.singletonList(new FactorialZeroCounterExecutable(number, flag));
        } else if (algo == 4) {
            List<Executable> list = new ArrayList<>(3);
            list.add(new FactorialExecutable(number, flag));
            list.add(new SumExecutable(number, flag));
            list.add(new FactorialZeroCounterExecutable(number, flag));

            return list;
        }
        return null;
    }

    private static void callListExecute(List<Executable> list) throws FileNotFoundException {
        for (Executable e : list) {
            e.execute();
        }
    }

}
