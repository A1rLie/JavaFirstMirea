package ru.mirea.task6;

public class Planet implements Nameable {
    String type;
    public Planet(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return type;
    }
}
