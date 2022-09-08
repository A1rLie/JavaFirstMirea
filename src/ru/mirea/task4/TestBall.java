package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball.toString());
        ball.setXY(10,10);
        System.out.println(ball.toString());
        ball.move(-2, 10);
        System.out.println(ball.toString());
    }
}
