package com.aca.week10.Homework07.task11;

import java.util.*;

/*
    Write assertion method and assert that size of first 2 is 5 and size of hashSet and treeSet is 3.
 */
public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "user1");
        User user2 = new User(2, "user2");
        User user3 = new User(3, "user3");
        User user4 = new User(4, "user4");
        User user5 = new User(5, "user5");

        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);
        arrayList.add(user4);
        arrayList.add(user5);

        LinkedList<User> linkedList = new LinkedList<>();
        linkedList.add(user1);
        linkedList.add(user2);
        linkedList.add(user3);
        linkedList.add(user4);
        linkedList.add(user5);

        HashSet<User> hashSet = new HashSet<>();
        hashSet.add(user1);
        hashSet.add(user2);
        hashSet.add(user3);
        hashSet.add(user4);
        hashSet.add(user5);

        TreeSet<User> treeSet = new TreeSet<>();
        treeSet.add(user1);
        treeSet.add(user2);
        treeSet.add(user3);
        treeSet.add(user4);
        treeSet.add(user5);

        AssertSizeIsFive(arrayList);
        AssertSizeIsFive(linkedList);

        AssertSizeIsTwo(treeSet);
        AssertSizeIsTwo(hashSet);
    }
    public static void AssertSizeIsFive(List<User> list) {

        if(list.size() != 5) {
            throw new AssertionError("Size should be equal to 5");
        }
    }

    public static void AssertSizeIsTwo(Set<User> list) {

        if(list.size() != 2) {
            throw new AssertionError("Size should be equal to 5");
        }
    }
}
