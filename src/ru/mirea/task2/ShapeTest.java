package ru.mirea.task2;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("Круг");
        System.out.println("Тип shape1: " + shape1.toString() + "\nТип shape2: " + shape2.toString());
    }

}
