package ru.mirea.task3;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        System.out.print("Введите радиус круга >> ");
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle(scanner.nextInt());
        System.out.println("Circle\nSquare: " + circle.getSquare() + "\nCircumference length: " + circle.getCircumferenceLength() + "\nRadius: " + circle.getRadius());
        System.out.println("Circle raidus = 5");
        circle.setRadius(5);
        System.out.println("New circle:\nSquare: " + circle.getSquare() + "\nCircumference length: " + circle.getCircumferenceLength() + "\nRadius: " + circle.getRadius());
    }
}
