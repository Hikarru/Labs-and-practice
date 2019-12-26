package com.company;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball (10, 15);
        System.out.println(ball);
        ball.move(5,6);
        System.out.println(ball);
    }
}
