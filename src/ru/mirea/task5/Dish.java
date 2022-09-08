package ru.mirea.task5;

public abstract class Dish {
    protected double volume;
    protected String type;
    protected String color;

    public double getVolume() {return volume;}

    public String getType() {return type;}

    public abstract void Info();

    public String getColor() {return color;}
}
