package ru.mirea.task3;

import java.util.Arrays;

class Head{
    private String eye;
    private String head;
    private String beard;

    public Head(){
        this.eye = "Blue";
        this.head = "Bold";
        this.beard = "No beard";
    }

    public Head(String eye){
        this();
        this.eye = eye;
    }

    public Head(String eye, String head){
        this(eye);
        this.head = head;
    }

    public Head(String eye, String head, String beard){
        this(eye, head);
        this.beard = beard;
    }

    @Override
    public String toString() {
        return "Head{" +
                "eye='" + eye + '\'' +
                ", head='" + head + '\'' +
                ", beard='" + beard + '\'' +
                '}';
    }
}

class Leg{
    private final byte length;

    Leg(int length){
        this.length = (byte)length;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "length=" + length +
                '}';
    }
}

class Hand{

    private final byte length;

    Hand(int length){
        this.length = (byte)length;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "length=" + length +
                '}';
    }
}

public class Human {
    private Leg[] legs;
    private Hand[] hands;
    private Head head;

    public Human(Head head, Leg[] legs, Hand[] hands){
        this.head = head;
        this.legs = legs;
        this.hands = hands;
    }

    @Override
    public String toString() {
        return "Human{" +
                "legs=" + Arrays.toString(legs) +
                ", hands=" + Arrays.toString(hands) +
                ", head=" + head +
                '}';
    }
}
