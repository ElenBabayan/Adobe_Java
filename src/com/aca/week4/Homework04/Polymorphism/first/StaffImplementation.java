package com.aca.week4.Homework04.Polymorphism.first;

public class StaffImplementation {

    public static void main(String[] args) {
        Staff manager = new Manager();
        Staff employee = new Employee();
        Staff intern = new Intern();

        manager.work();
        employee.work();
        intern.work();
    }
}
