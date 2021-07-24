package com.aca.week2.Class3;

public class Main {

    public static void main(String[] args) {
        Gun gun1 = new Gun();
        Gun gun2 = new Gun();
        Gun gun3 = new Gun();

        gun1.fire();
        gun2.fire();
        gun3.fire();
        System.out.println(Gun.getCount());

        // int a cannot be null
        // Integer a can be null
        Integer a1 = 1;
        Integer a2 = 1;
        Integer a3 = 1;
        // in heap 1 object - integer pool

        // no object will be created, will always print 9 by optimization
        for(int i = 0; i < 10000; i++) {
            Integer a = 9;
            System.out.println(a);
        }
    }

    /*
    box primitive

    industry growth 0 %
    => need null, to not be 0

    Integer pool - cache - goes and checks if object is already in cache
    and doesn't create more
     */

    Integer integer = Integer.valueOf(5); // takes from cache if -128 - 127 range
 //   Integer integer = Integer.valueOf(5);



}
