package com.aca.week11.Homework08.listAndSetAssertion;

import java.util.*;

public class Main {

    /*
    Create a single method that checks the size of the provided data structure
    (should work at least for List and Set implementations such as ArrayList, LinkedList, HashSet, TreeSet)
    and throws an exception in case of size mismatch. The method must receive size as an argument.
     */

    public static <T extends Iterable> boolean checkSizeOfDS(T dataStructure, int size) {

        for (Object o : dataStructure) {
            size--;
        }

        if (size == 0)
            return true;
        else {
            throw new InputMismatchException("provided size does not match " +
                    "with the size of the underlying data structure");
        }
    }

    public static void main(String[] args) {

        List<Integer> myArrayList = new ArrayList<>();
        List<Integer> myLinkedList = new LinkedList<>();
        Set<Integer> myHashSet = new HashSet<>();
        Set<Integer> myTreeSet = new TreeSet<>();

        for (int i = 0; i < 12; i++) {
            myArrayList.add(1);
        }

        for (int i = 0; i < 24; i++) {
            myLinkedList.add(2);
        }

        for (int i = 0; i < 48; i++) {
            myHashSet.add(i);
        }

        for (int i = 0; i < 96; i++) {
            myTreeSet.add(i);
        }

        System.out.println(checkSizeOfDS(myArrayList, 12));
        System.out.println(checkSizeOfDS(myLinkedList, 24));
        System.out.println(checkSizeOfDS(myHashSet, 48));
        System.out.println(checkSizeOfDS(myTreeSet, 96));
    }
}
