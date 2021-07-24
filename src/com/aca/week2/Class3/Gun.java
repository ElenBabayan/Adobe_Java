package com.aca.week2.Class3;

public class Gun {
    private static int count;

    public void fire() {
        System.out.println("fire called");
        count++;
    }

    // we have access to getCount only by object of Gun
    // =>  make static to call - Gun.getCount()

    //static variable => static getter
    public static int getCount() {
        return count;
    }
}
