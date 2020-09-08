package ru.mirea.pr2;

public class BallTest {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50);
        System.out.println(ball);
        ball.setXY(1, 2);
        System.out.println(ball);
    }
}
