package com.aca.week5.Homework05.task3.part1;

import com.aca.week5.Homework05.task1.User;
import com.aca.week5.Homework05.task1.UserGroup;
import com.aca.week5.Homework05.task2.part4.Color;
import com.aca.week5.Homework05.task2.part4.ColoredTriangle;
import com.aca.week5.Homework05.task2.part2.ImmutablePoint;
import com.aca.week5.Homework05.task2.part3.Triangle;

public class Printer {

    public static void specialPrint(Object obj) {
        System.out.println("************************************");
        System.out.println(obj.toString());
        System.out.println("************************************");
    }

    public static void main(String[] args) {
        User user1 = new User("Elen1", "Babayan1", "elen1", "elen1@mail.ru");
        User user2 = new User("Elen2", "Babayan2", "elen2", "elen2@mail.ru");

        UserGroup userGroup = new UserGroup();
        userGroup.addUser(user1);
        userGroup.addUser(user2);

        ImmutablePoint p1 = new ImmutablePoint(1, 2);
        ImmutablePoint p2 = new ImmutablePoint(3, 4);
        ImmutablePoint p3 = new ImmutablePoint(5, 6);
        Triangle t1 = new Triangle(p1, p2, p3);

        ColoredTriangle ct1 = new ColoredTriangle(p1, p2, p3, Color.BLUE);

        Printer.specialPrint(user1);
        Printer.specialPrint(userGroup);
        Printer.specialPrint(p1);
        Printer.specialPrint(t1);
        Printer.specialPrint(ct1);
    }
}
