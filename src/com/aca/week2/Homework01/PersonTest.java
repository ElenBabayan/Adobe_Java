package com.aca.week2.Homework01;

public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person();
        Double birthMilli = 599184000000D;
        person1.setName("Elen");
        person1.setBirthMilli(birthMilli);

        System.out.println("Person1's name: " + person1.getName());
        System.out.println("Person1's age: " + person1.getAge());
        System.out.println("Person1's age readable: " + person1.getAgeReadableFormat());

        Double newBirthMilli = 599582088001D;
        person1.setBirthMilli(newBirthMilli);

        Person person2 = new Person();
        person2.setName("Davit");

        System.out.println("Person2's name: " + person2.getName());
        System.out.println("Person2's age: " + person2.getAge());

        Person person3 = new Person();
        person3.setName("Garri");
        Double birthMilli3 = 599184000000D + 2592000000D;
        person3.setBirthMilli(birthMilli3);
        System.out.println("Person3's age: " + person3.getAge());
        System.out.println("Person3's age readable: " + person3.getAgeReadableFormat());
    }
}
