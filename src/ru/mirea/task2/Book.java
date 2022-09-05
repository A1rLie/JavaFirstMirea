package ru.mirea.task2;


public class Book {
    private int pages;
    private String bookTitle;

    public Book(){
        pages = 0;
        bookTitle = null;
    }

    public Book(String title){
        this();
        bookTitle = title;
    }

    public Book(String title, int pages){
        this(title);
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Название: " + bookTitle + ", количество страниц: " + pages;
    }
}
