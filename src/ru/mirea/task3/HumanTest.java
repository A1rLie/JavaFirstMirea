package ru.mirea.task3;

import java.util.Scanner;

public class HumanTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цвет волос, длину ног, длину рук");
        String head = scanner.next();
        int legSize = scanner.nextInt();
        int handSize = scanner.nextInt();
        Human human = new Human(new Head(head), new Leg[]{new Leg(legSize), new Leg(legSize)},new Hand[]{new Hand(handSize), new Hand(handSize)});
        System.out.println(human.toString());
    }
}
