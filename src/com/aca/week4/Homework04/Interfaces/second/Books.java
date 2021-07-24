package com.aca.week4.Homework04.Interfaces.second;

public class Books implements Book {
    private final int numOfPages;
    private final String author;
    private final String genre;

    public Books(int numOfPages, String author, String genre) {
        this.numOfPages = numOfPages;
        this.author = author;
        this.genre = genre;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void open() {
        System.out.println("Book opened");
    }

    @Override
    public void close() {
        System.out.println("Book closed");
    }
}
