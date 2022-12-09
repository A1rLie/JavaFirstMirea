package ru.mirea.task5;

import java.util.Scanner;

public class DogTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Кличка, цвет >> ");
        Korgi korgi = new Korgi(scanner.next(), scanner.next(), 0.5, 0.9);
        korgi.Bark();

        System.out.print("Кличка, цвет >> ");
        SibaInu sibaInu = new SibaInu(scanner.next(), scanner.next(), 0.7, 0.8);
        sibaInu.Bark();
    }
}
