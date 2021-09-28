package com.aca.week11.Homework08.proxybook;

public class ProxyBook extends Book {

    private boolean flag = false;

    public ProxyBook(String title, String author, boolean flag) {
        super(title, author);
        this.flag = flag;
    }

    public boolean isLoaded() {
        return flag;
    }

    public void load() {
        if (flag) {
            throw new isAlreadyLoadedException("ProxyBook is already loaded");
        }
        flag = true;
    }

    @Override
    public String getTitle() {
        if (!isLoaded()) {
            throw new IllegalStateException("Cannot getTitle, is not loaded");
        }
        return super.getTitle();
    }

    @Override
    public String getAuthor() {
        if (!isLoaded()) {
            throw new IllegalStateException("Cannot getAuthor, is not loaded");
        }
        return super.getAuthor();
    }

    public static void main(String[] args) {
        ProxyBook proxyBook = new ProxyBook("title", "author", false);
        proxyBook.load();
        proxyBook.getAuthor();
        proxyBook.getTitle();
    }
}