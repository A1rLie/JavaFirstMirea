package ru.mirea.task5;

public class Sofa extends Furniture{
    Sofa(String color){
        type = "Диван";
        this.color = color;
    }

    @Override
    public void Chill() {
        System.out.println("Я отдыхаю лежа на диване цвета " + color);
    }
}
