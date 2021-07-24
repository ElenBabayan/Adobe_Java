package com.aca.week2.Class4;

public class Cat extends Animal {


    private float weight;

    public Cat() {

    }

    public Cat(float weight) {
        setWeight(weight);
    }

    public void catchMouse() {
        System.out.println("I caught a mouse");
    }

//    public float getWeight() {
//       return this.weight; // cannot do this !!!!!
//    }

    public float getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(float weight) {
        this.weight = (weight - 2); // call Animal's setweight and modify
    }

    @Override
    public void saySomething() {
        System.out.println("I'm a cat"); //ctrl p ---- what parameters sout expects
    }
}
