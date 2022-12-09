package ru.mirea.task3;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите автора >> ");
        book.setAuthor(scanner.next());

        System.out.print("Введите название >> ");
        book.setTitle(scanner.next());

        System.out.print("Введите количество страниц >> ");
        book.setPages(scanner.nextShort());

        System.out.print("Введите цвет >> ");
        book.setColor(scanner.next());

        System.out.println(book.toString());
    }

}
