package com.aca.week12.Homework09;

/*
Create a Database Car Registery
which need to have
1.Person Table with columns Name, Surname,Passport number
2.Document table with columns, Person_id(which refers To one person in person table)
Document number (Generate Random Numeric String )
3.Car Table
With columns Mark Name ,Model name,Document id(which refers to one document in Document table )

Create Repositories for all previously marked Entities with methods create and getById

Create 100 examples of each Entity and then print Entities with Id 54 ,60 ,92
 */
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
