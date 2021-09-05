package com.aca.week8.Homework06;

import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class SortClass<T extends Comparable<T>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}
