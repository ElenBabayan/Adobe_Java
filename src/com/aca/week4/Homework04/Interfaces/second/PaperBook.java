package com.aca.week4.Homework04.Interfaces.second;

public class PaperBook extends Books{

    public PaperBook(int numOfPages, String author, String genre) {
        super(numOfPages, author, genre);
    }

    @Override
    public void open() {
        System.out.println("PaperBook opened");
    }

    @Override
    public void close() {
        System.out.println("PaperBook closed");
    }
}
