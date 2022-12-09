package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDog {

    public static void addDog(ArrayList<Dog> dogs, String name, int age){
        dogs.add(new Dog(name, age));
    }

    public static Dog getDog(ArrayList<Dog> dogs, int index){
        return dogs.get(index);
    }


    public static void main(String[] args) {
        var dogs = new ArrayList<Dog>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.print("Введите имя и возраст собаки >> ");
            addDog(dogs, scanner.next(), scanner.nextInt());
        }

        for (var s : dogs){
            System.out.println(s.toString() + ", " + s.convertDogAgeToHumanAge() + " в человечьих годах");
        }
    }
}
