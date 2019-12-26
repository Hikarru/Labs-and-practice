package com.company;

public class CircleTest {
    public static void main(String[] args) {
        Circle cir = new Circle(10);
        System.out.println(cir);
        System.out.println(Math.round(cir.area() * 100.0) / 100.0); //  *100/100 - округление до двух знаков
        System.out.println(Math.round(cir.length() * 100.0) / 100.0);
    }
}