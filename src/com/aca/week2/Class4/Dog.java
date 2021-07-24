package com.aca.week2.Class4;

public class Dog extends  Animal {

    String name;

    public Dog() {
        System.out.println("Dog constructor");
    }

    @Override
    public void saySomething() {
        System.out.println("I'm a dog");
        super.saySomething();
    }
}
