package com.aca.week9.Class16.task2;

public class ChildClass extends SuperClass {
    String name;

    public ChildClass() {
        super();
    }

    @Override
    public void init() {
       // super.init();
        System.out.println(name.toCharArray()); // name is not initialized => nullPtr exception
    }

    public static void main(String[] args) {
        new ChildClass();

    }
    // Test - questions - multiple choice
    // Coding - github
}
