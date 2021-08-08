package com.aca.week5.Class10.exception;

public class IntegerClass {
    // Stack trace - WHERE exception comes from

    public static void main(String[] args)  {
        /*
        System.out.println("***");
        System.err.println("My error message");
        System.out.println("***");
        System.err.println(result);
        System.out.println("***");
        Integer result = null;
        try {
             result = calculate(-1, 10);
        }
        // RuntimeException is a Throwable
        catch (OurException e) { // will not print, anything
            int result1 = 0;
            e.printStackTrace();  // prints information about the error
        }
      //  System.out.println(result);

        runtimeException
        throw object

        Objects that extend from Throwable have special meaning

        throw new RuntimeException();

        throw new Exception(); // doesn't allow to throw

        Runtime - unchecked exception - partavor ches handle anes

        Exception - checked exception - partavor es handle anes - at least try catch

HIERARCHY:
                      Throwable
        Exception                Error

   RuntimeException IOException
         */

        try{
            endlessLoop();

        }
        catch (StackOverflowError e) {
            System.out.println("endlessLoop throws exception");
        }
    }

    public static int endlessLoop() {
        return 1 + endlessLoop();
    }

    public static void method() throws Exception {
        calculate(10,-10);
    }

    public static Integer calculate(Integer a, Integer b) throws Exception {
        if(a < 0) {
            throw new Exception();// only throw, no need to catch
        }

        return null;
    }
}
