package com.aca.week4.Class8.book;

public class SchoolBook1 extends PagePrinter {

    private final String seal;

    public SchoolBook1(String seal) {
        this.seal = seal;
    }

    @Override
    public void printContent(int number, String content) {
        System.out.println(content);
        if(number == 17) {
            System.out.println(seal);
        }
    }
}
