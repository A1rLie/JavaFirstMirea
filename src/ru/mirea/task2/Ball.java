package ru.mirea.task2;
public class Ball {
    private int volume;
    private String color;
    private String type;

    public Ball(){
        volume = 0;
        color = null;
        type = null;
    }

    public Ball(String type){
        this();
        this.type = type;
    }

    public Ball(String type, String color){
        this(type);
        this.color = color;
    }

    public Ball(String type, String color, int volume){
        this(type, color);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Тип: " + type + ", цвет: " + color + ", объем: " + volume;
    }
}
