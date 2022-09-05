package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.toString());

        book.setAuthor("Дюма");
        System.out.println(book.getAuthor());

        book.setTitle("Граф Монте-Кристо");
        book.setPages((short)1715);
        book.setColor("Красный");

        System.out.println(book.toString());
    }

}
