package com.aca.week4.Class8.book;

public abstract class PagePrinter {

    public void print(int number, String content) {
        System.out.println(number);
        printContent(number,content);
        System.out.println("Page " + number);
    }

    // if wasn't abstract, the subclass cher uzi vor override aneinq anpayman
    public abstract void printContent(int number, String content) ;
}

