package ru.mirea.task5;

import java.util.Scanner;

public class FurnitureTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Цвет дивана >> ");
        Sofa sofa = new Sofa(scanner.next());
        sofa.Chill();
    }
}
