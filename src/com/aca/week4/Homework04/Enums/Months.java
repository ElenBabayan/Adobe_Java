package com.aca.week4.Homework04.Enums;

public enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Months getMonth(int month) {
        return Months.values()[month - 1];
    }
}
