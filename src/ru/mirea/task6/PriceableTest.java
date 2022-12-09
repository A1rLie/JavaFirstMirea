package ru.mirea.task6;

import java.util.Scanner;

public class PriceableTest {
    public static void main(String[] args) {
        System.out.print("Введи название машины >> ");
        Scanner scanner = new Scanner(System.in);
        Product product = new Product(scanner.next(), 1_234_567);
        System.out.println(product.getType() + " price: " + product.getPrice());
    }
}
