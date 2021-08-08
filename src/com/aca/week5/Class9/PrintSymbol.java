package com.aca.week5.Class9;
import java.util.Scanner;

public class PrintSymbol {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Count: ");
        final int count = kb.nextInt();
        System.out.println("Character");
        final String ch = kb.next();

        StringBuilder result = new StringBuilder(count + 50); // capacity is 16 - by default
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < count; i++) {
            result.append(ch); // every time new object is created => n objects created without the need
        }
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println(result);
    }

    /*
    StringBuilder - will help to build the string
     */

}
