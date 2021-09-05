package com.aca.week8.Class13;


import java.math.BigDecimal;
import java.util.*;

public class Main {

    /*
        Iterable

        interface Iterator
        boolean hasNext()
        E next()


     */
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();

//        List<String> l = List.of("a", "b", "c");
//        List<String> l1 = Arrays.asList("a", "b", "c");
//
//        List<String> l2 = new ArrayList<>() {
//            {
//                add("a");
//                add("b");
//                add("c");
//            }
//        };

        lst.add("a");
        lst.add("b");
        lst.add("c");


        Iterator<String> iter = lst.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        for(String s : lst) {
            System.out.println(s);
        }

        // debug -> calculator -> evaluate
        // if Stack interface extends Iterable => all implementations should be iterable
        // => make DefaultStack implement Iterable


         List<String> list = Arrays.asList("a", "b", "c");
         list.add("d");

        ArrayList<String> list1 = new ArrayList<>(list);
        list1.add("s");

        final List<User> objects = new ArrayList<>();

        for(int i = 0; i < 10_000; i++) {
            final User user = new User(UUID.randomUUID().toString(),
            BigDecimal.valueOf(i)
            );

            objects.add(user);

        }



    }


    private List<User> getByAge(int age) {
        if(age < 0) {
            return Collections.emptyList();
        }
        return new ArrayList<>();
    }


}
