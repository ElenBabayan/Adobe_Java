package com.aca.week6.Class12.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // generic => compile time know about the error !!!
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("string1");
        list.add("string2");
        list.add("string3");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        Main.printList(list);
        Main.printList(list1);

        //System.out.println(list.get(3)); // => class cast exception
    }

    public static void printList(List<?> list ) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // add accepts object
        // list.add(45);
    }


}
