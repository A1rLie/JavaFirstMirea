package ru.mirea.task3;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human(new Head("Brown"), new Leg[]{new Leg(100), new Leg(100)},new Hand[]{new Hand(50), new Hand(50)});
        System.out.println(human.toString());
    }
}
