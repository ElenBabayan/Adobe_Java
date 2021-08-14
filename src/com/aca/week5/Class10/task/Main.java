package com.aca.week5.Class10.task;

import java.util.Random;

public class Main {
    public static final String RANDSTR[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    public static final Random RANDOM = new Random();

    public static void main(String[] args)  {

       // System.out.println(generate(10));

        Main m = new Main();
        // ctrl alt t => exception
        try {
            System.out.println(m.generate(100000));
        } catch (CalculationTimeoutException e) {
       //     e.printStackTrace();
       //     System.exit(0); // application stops, finally not executed
            throw new RuntimeException("Generation does not work today");
        }
//        finally {
//            System.out.println("Finally block");
//        }

    }

    // generate random string with count length
    // if takes longer than 1 sec = > throw exception
    public  GenerationResult generate(int count) throws CalculationTimeoutException {
        // extend from Exception => checked => should handle
        if(count < 0) {
            // Good practice - do not use Runtime exception
            throw new IllegalArgumentException("The count is negative");
        }

        long startTime = System.currentTimeMillis();
        String result = "";
        while(count > 0) {
            if(System.currentTimeMillis() - startTime > 1000) {
                throw new CalculationTimeoutException("count: " + count + " more than 1 second");
            }
            final int index = RANDOM.nextInt(10);
            final String str = RANDSTR[index];
            result += str;
            count--;
        }

        return new GenerationResult(
                result, (System.currentTimeMillis() - startTime));
    }

    public static int count(String symbol, String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == symbol.charAt(0)) {
                count++;
            }
        }

        return count;
    }

    private static class GenerationResult {
        private final String text;
        private final long duration;


        private GenerationResult(String text, long duration) {
            this.text = text;
            this.duration = duration;
        }

        @Override
        public String toString() {
            return "GenerationResult{" +
                    "text='" + text + '\'' +
                    ", duration=" + duration +
                    '}';
        }
    }


}

