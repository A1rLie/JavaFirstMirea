package ru.mirea.task6;

import java.util.Scanner;

public class NameableTest {

    public static void main(String[] args) {
        System.out.print("Введи название планеты >> ");
        Scanner scanner = new Scanner(System.in);
        Planet planet = new Planet(scanner.next());
        System.out.println("Мое имя: " + planet.getName());
    }
}
