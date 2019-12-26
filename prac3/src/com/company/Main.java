package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(11, "Green", false);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(11, 4, "Blue", true);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle);
        Square square = new Square(11, "Yellow", true);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(square);

    }
}
