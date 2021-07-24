package com.aca.week3.Class5;

public class Main {
    // from private constructor cannot create object

    public static void main(String[] args) {
      //  Gun gun = new Gun();

        Counter counter = new Counter();
        // all objects share one counter reference

        Gun gun1 = new Gun("gun1", counter);
        Gun gun2 = new Gun("gun2", counter);
        Gun gun3 = new Gun("gun3", counter);
        Gun gun4 = new Gun("gun4", counter);

        // we want to calculate how many fires were called overall
        // Have Counter class, every Gun has counter, same reference
       gun1.fire();
        System.out.println(counter.getCount());

        gun2.fire();
        System.out.println(counter.getCount());

        gun3.fire();
        System.out.println(counter.getCount());

        gun4.fire();
        System.out.println(counter.getCount());
        /*
        non static variables belong to the  Class object
        static variables belong to the Class
         */

    }
}
