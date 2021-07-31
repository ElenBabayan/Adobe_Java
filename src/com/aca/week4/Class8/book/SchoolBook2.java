package com.aca.week4.Class8.book;

public class SchoolBook2 extends PagePrinter {

    private String print;

    public SchoolBook2(String print) {
        this.print = print;
    }

    @Override
    public void printContent(int number, String content) {
        System.out.println(print);
        System.out.println(content);
    }
}
