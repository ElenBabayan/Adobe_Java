package com.aca.week2.Class4;

public class Animal {
    // SUPER CLASS
    // CHILD CLASS
    // inherits state and behaviour
    private float weight;

    public Animal() {
        System.out.println("Animal constructor");
    }

    public void saySomething() {
        System.out.println("I'm an animal");
    }

    // final => cannot override
    public void setWeight(final float weight) {
        this.weight = weight;
    }
    public float getWeight() {
        return weight;
    }
    public static void main(String[] args) {
        final Animal animal = new Animal();
        animal.weight = 34.5f;

        final Dog dog = new Dog();
        System.out.println(dog.getWeight());

        dog.name = "jack";

        dog.saySomething();
        animal.saySomething();

        Cat cat = new Cat();
        cat.setWeight(10.3f);
        System.out.println(cat.getWeight());
    }
}
