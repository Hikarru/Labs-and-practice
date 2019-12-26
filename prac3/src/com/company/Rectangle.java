package com.company;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle ()
    {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle (double width, double length)
    {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle (double width, double lenght, String color, boolean filled)
    {
        super(color,filled);
        this.width = width;
        this.length = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea()
    {
        return length*width;
    }
    @Override
    public double getPerimeter()
    {
        return 2*width+2*length;
    }
    @Override
    public String toString()
    {
        return length + "," + width + "," + color + "," + filled;
    }
}
