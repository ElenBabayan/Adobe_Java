package com.aca.week9.Class16.task2;

public class SuperClass {
    private String name;

    public SuperClass() {
        super();
        init(); // Child init is called.
        // shouldn't call overloaded method in Super Class's constructor.
    }

    public void init() {
        name = "name";
    }
}
