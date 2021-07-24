package com.aca.week4.Homework04.Interfaces.second;

public class EBook extends Books {

    private int size;

    public EBook(int numOfPages, String author, String genre, int size) {
        super(numOfPages, author, genre);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void open() {
        System.out.println("Ebook opened");
    }

    @Override
    public void close() {
        System.out.println("Ebook closed");
    }

    public void browsePages() {
        System.out.println("Ebook browsed");
    }
}
