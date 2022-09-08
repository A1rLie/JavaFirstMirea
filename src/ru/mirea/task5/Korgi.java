package ru.mirea.task5;

public class Korgi extends Dog{

    public Korgi(String name, String color, double width, double height){
        this.name = name;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public void Bark() {
        System.out.println("I'm Korgi, my name "+name+ ", gaf gaf");
    }
}
