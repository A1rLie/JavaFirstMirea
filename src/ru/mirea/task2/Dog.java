package ru.mirea.task2;

public class Dog {
    private String dogName;
    private int dogAge;

    public Dog(String name, int age){
        dogName = name;
        dogAge = age;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogName() {
        return dogName;
    }

    public int convertDogAgeToHumanAge(){
        return dogAge * 7;
    }

    @Override
    public String toString() {
        return "Кличка: " + dogName + ", возраст: " + dogAge;
    }
}
