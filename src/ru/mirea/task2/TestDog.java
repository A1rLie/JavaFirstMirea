package ru.mirea.task2;

import java.util.ArrayList;

public class TestDog {

    public static void addDog(ArrayList<Dog> dogs, String name, int age){
        dogs.add(new Dog(name, age));
    }

    public static Dog getDog(ArrayList<Dog> dogs, int index){
        return dogs.get(index);
    }

    public static void main(String[] args) {
        var dogs = new ArrayList<Dog>();

    }
}
