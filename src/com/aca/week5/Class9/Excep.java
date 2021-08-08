package com.aca.week5.Class9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep {

    public static void main(String[] args) {
        /*
        Scanner kb = new Scanner(System.in);
        Integer a;
        boolean excep = false;
        while(excep) {
            try {
                System.out.println("a: ");
                a = kb.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("a: ");
                excep = true;
            }
        }

        Integer b;
        boolean flag2 = false;
        while(!flag2) {
            try {
                System.out.println("b: ");
                b = kb.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("b: ");
            }
            flag2 = true;
        }

         */

        int i = getIntegerFromScanner( "A: ");
        while (i == 0) {
            i = getIntegerFromScanner( "A: ");
        }

        int j = getIntegerFromScanner( "B: ");
        while (j == 0) {
            j = getIntegerFromScanner( "B: ");
        }
    }

        public static int getIntegerFromScanner( String message) {
        int i = 0;
        Scanner kb = new Scanner(System.in);
        try {
            System.out.println(message);
            i = kb.nextInt();
        }
        catch (InputMismatchException e) {
        }

        return i;
    }
}
