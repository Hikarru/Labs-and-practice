package com.company;

import java.math.*;

public class Circle {
    private double radius;

    Circle()
    {
        radius = 5;
    }

    Circle(double n)
    {
        radius = n;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area()
    {
        return Math.PI*radius*radius;
    }

    public double length()
    {
        return Math.PI*2*radius;
    }

    @Override
    public String toString()
    {
        return "Radius of this circle:" + this.radius;
    }
}
