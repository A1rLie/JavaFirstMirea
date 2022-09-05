package ru.mirea.task3;

public class Book {
    private String author;
    private String title;
    private String color;
    private String cover;
    private short pages;


    public Book(){
        author = title = color = cover = "Unidentified";
        pages = 0;
    }

    public Book(String author){
        this();
        this.author = author;
    }

    public Book(String author, String title){
        this(author);
        this.title = title;
    }

    public Book(String author, String title, String color){
        this(author, title);
        this.color = color;
    }

    public Book(String author, String title, String color, String cover){
        this(author, title, color);
        this.cover = cover;
    }

    public Book(String author, String title, String color, String cover, int pages){
        this(author,title,color,cover);
        this.pages = (short)pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public short getPages() {
        return pages;
    }

    public void setPages(short pages) {
        this.pages = pages;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", cover='" + cover + '\'' +
                ", pages=" + pages +
                '}';
    }
}
