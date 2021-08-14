package com.aca.week6.Class11;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws UserCastException, OrderCastException {
        User user1 = new User("abc");
        User user2 = new User("abc");

        Order order1 = new Order(100, "recipient1");

//        System.out.println(user1.compareTo(user2));
//        System.out.println(order1.compareTo(user2));
        //good practice: throw own exceptions

        // runtime exception - program stops
        // solution: during compile time - exception

        // do not allow to run with exceptions

        System.out.println(user1.compareTo(user2));

        /*
        Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.

        It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.

         */

        Order[] orders = new Order[10];


        orders[0] = new Order(97, "abc");
        orders[1] = new Order(75, "def");
        orders[2] = new Order(45,  "ghi");
        orders[3] = new Order(24, "jkl");
        orders[4] = new Order(56, "mno");
        orders[5] = new Order(87, "pqr");
        orders[6] = new Order(15, "stu");
        orders[7] = new Order(15, "vwx");
        orders[8] = new Order(76, "y");
        orders[9] = new Order(34, "z");

        Arrays.sort(orders);

        for(int i = 0; i < orders.length; i++) {
            System.out.println(orders[i]);
        }
    }
}
