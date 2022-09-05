package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Circle\nSquare: " + circle.getSquare() + "\nCircumference length: " + circle.getCircumferenceLength() + "\nRadius: " + circle.getRadius());
        System.out.println("Circle raidus = 5");
        circle.setRadius(5);
        System.out.println("New circle:\nSquare: " + circle.getSquare() + "\nCircumference length: " + circle.getCircumferenceLength() + "\nRadius: " + circle.getRadius());
    }
}
