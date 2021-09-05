package com.aca.week8.Class14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // cannot write int - generics do not accept primitives
        // const time retrieval
        Map<User, Integer> map = new HashMap<>();

        final User key = new User("First name", "Last name");
        final Integer value = 25;
        map.put(new User("First name", "Last name"), 25);
        map.put(new User("First name", "Last name"), 25);
        map.put(new User("First name", "Last name"), 25);
        map.put(new User("First name", "Last name"), 25);

        System.out.println(map.get(key));

        Set<User> sets = new HashSet<>();
        sets.add(new User("First name", "Last name"));
        sets.add(new User("First name", "Last name"));
        sets.add(new User("First name", "Last name"));


        System.out.println();
        // equals and hashCode not implemented => 4 values

        // TreeSet implementation of Set
        // ctrl alt b

        Set<User> treeSet = new TreeSet<>();
        treeSet.add(new User("Elen", "Babayan"));
        treeSet.add(new User("Elen", "Babayan"));
        treeSet.add(new User("Elen", "Babayan"));
        treeSet.add(new User("Elen", "Babayan"));

        System.out.println();

        Map<User, Integer> usersMap = new HashMap<>();
        usersMap.put(new User("Elen", "Babayan"),23);
        usersMap.put(new User("Elen", "Babayan"),23);
        usersMap.put(new User("Elen", "Babayan"),23);
        usersMap.put(new User("Elen", "Babayan"),23);
        final Set<User> users1 = usersMap.keySet();


        // QUEUES

        Queue<User> userQueue = new PriorityQueue<>();


        // 1.keep User in file and read
        // 2.firstname lastname keep in file
        // 3.keep as bytes
    }

    private static class User implements Comparable<User> {
        private final String firstName;
        private final String lastName;

        private User(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public int compareTo(User o) {

            String str1 = o.firstName + o.lastName;
            String str2 = this.firstName + this.lastName;

            return str1.compareTo(str2);
        }
    }

    public void printSet(Set<User> userSet) {
        // If we know for sure that should return an emptyList, return this
        final List<Object> objects = Collections.emptyList();
        final List<Object> objects1 = Collections.emptyList();

        // List that has only one element
        final List<User> users = Collections.singletonList(new User("E", "B"));

        final Set<String> singleton = Collections.singleton("");
    }
}


//        @Override
//        public int compareTo(Object o) {
////            User user = (User) o;
////
////
////
////            if( this.firstName.equals(user.firstName) && this.lastName.equals(user.lastName)) {
////                return 0;
////            }
//
//            return 1;
//
//        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            User user = (User) o;
//            return Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(firstName, lastName);
//        }

