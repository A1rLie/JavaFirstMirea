package ru.mirea.task6;

public class Product implements Priceable{

    private double price;

    private String type;

    Product(String type, double price){
        this.price = price;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
