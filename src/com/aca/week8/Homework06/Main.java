package com.aca.week8.Homework06;

public class Main {

    public static void main(String[] args) {
        Class<String> c = String.class;
        CustomArrayList<String> myList = new CustomArrayList<String>(c,10);
       myList.addAtEnd("5");
        myList.addAtEnd("2");
        myList.addAtEnd("1");
        myList.addAtEnd("8");
        myList.addAtEnd("4");

        myList.quickSortIterative();
        myList.printList();
        System.out.println();

       System.out.println("add at end 1");
        myList.addAtEnd("1");
        myList.addAtEnd("1");
        myList.printList();

        System.out.println();
        System.out.println("add at beginning 2");
        myList.addAtBeginning("2");
        myList.addAtBeginning("2");
        myList.printList();

        System.out.println();
        System.out.println("add at given index 1, 2");
        myList.addAtGivenIndex("2", 1);
        System.out.println("add at given index 0, 2");
        myList.addAtGivenIndex("2", 0);
        myList.printList();

        System.out.println();
        System.out.println("remove index 3, 2");
        myList.remove(3);
        myList.printList();
        System.out.println();
        myList.remove(2);
        myList.printList();

        myList.addAtEnd("1");
        myList.addAtEnd("2");
        myList.addAtEnd("3");
        myList.addAtEnd("4");
        myList.addAtEnd("5");
        System.out.println();
        System.out.println("delete elements 1,4");
        myList.delete("1");
        myList.printList();
        System.out.println();
        myList.delete("4");
        myList.printList();

        System.out.println();
        System.out.println("Search for element 3");
        System.out.println("returned index " + myList.search("3"));
        System.out.println("search element 1");
        myList.search("1");

        System.out.println("bubble sort");
        myList.bubbleSort();
        
        myList.printList();

        System.out.println();
        System.out.println("quick sort iterative");
        myList.quickSortIterative();
        
        myList.printList();

        System.out.println();
        myList.quickSortInPlace(myList.getData(), 0, myList.size()- 1);
        myList.printList();

        System.out.println();
        for (int i = 0; i < 2000; i++) {
            myList.addAtEnd((Math.random() * i) + "");
        }
        myList.quickSortIterative();
        myList.bubbleSort();

        // quick sort is faster

    }
}
