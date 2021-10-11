package com.aca.week12.Homework09.carregistery;

public class Person {
    private String name;
    private String surname;
    private Integer passportNumber;

    public Person(String name, String surname, Integer passportNumber) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
    }

    public Person() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(Integer passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                '}';
    }
}
