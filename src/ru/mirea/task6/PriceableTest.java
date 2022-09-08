package ru.mirea.task6;

public class PriceableTest {
    public static void main(String[] args) {
        Product product = new Product("Машина", 1_234_567);
        System.out.println(product.getType() + " price: " + product.getPrice());
    }
}
