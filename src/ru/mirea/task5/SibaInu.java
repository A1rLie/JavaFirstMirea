package ru.mirea.task5;

public class SibaInu extends Dog{

    public SibaInu(String name, String color, double width, double height) {
        this.name = name;
        this.color = color;
        this.width = width;
        this.height = height;
    }
    @Override
    public void Bark() {
        System.out.println("I'm SibaInu, my color is " + color +", bork bork");
    }
}
