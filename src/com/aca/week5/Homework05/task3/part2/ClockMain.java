package com.aca.week5.Homework05.task3.part2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClockMain {

    public static void main(String[] args) {
        Clock clock;
        int num = getIntegerFromScanner("Please enter 1 for FastClock, and 2 for SlowClock");

        if (num == 1) {
            clock = new FastClock();
            clock.start();

        } else if (num == 2) {
            clock = new SlowClock();
            clock.start();
        } else {
            throw new RuntimeException("Input number should be either 1 or 2");
        }
    }

    public static int getIntegerFromScanner(String message) {
        int i = 0;
        Scanner kb = new Scanner(System.in);

        System.out.println(message);
        i = kb.nextInt();

        return i;
    }
}

