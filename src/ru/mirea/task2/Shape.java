package ru.mirea.task2;

public class Shape {
    private String shapeType;

    public Shape(){
        shapeType = null;
    }
    public Shape(String shapeType){
        this.shapeType = shapeType;
    }

    @Override
    public String toString() {
        return shapeType;
    }
}
