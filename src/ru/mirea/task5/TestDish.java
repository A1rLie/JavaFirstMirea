package ru.mirea.task5;

public class TestDish {

    public static void main(String[] args) {
        Plate plate = new Plate("blue", 0.4);
        plate.Info();

        Teapot teapot = new Teapot("black", 2);
        teapot.Info();
    }
}
