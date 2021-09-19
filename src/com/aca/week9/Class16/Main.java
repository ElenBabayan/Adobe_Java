package com.aca.week9.Class16;

import java.util.Random;

import static java.lang.String.format;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ResultPrinter resultPrinter = createResult(RANDOM.nextInt(3));
            new Application(resultPrinter).calculateAndPrint(RANDOM.nextInt());
        }
    }

    public static ResultPrinter createResult(int arg) {
        if(arg == 0) {
            return new SystemResultPrinter();
        }
        else if(arg == 1) {
            return new SystemErrorResultPrinter();
        }
        else if(arg == 2) {
            return new ResultPrinter() { // 3 implementations of ResultPrinter - ctrl alt b
                @Override
                public void print(final String result) {
                    System.out.println("Print via Anonymous Class instance");
                    System.out.println(result);
                }
            };
        }
        throw new IllegalArgumentException(
                format("Could not resolve result printer for arg %d", arg));

    }
}
