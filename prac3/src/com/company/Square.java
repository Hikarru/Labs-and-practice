package com.company;

public class Square extends Rectangle {
    public Square()
    {
        super();
    }
    public Square(double side)
    {
        super(side, side);
    }
    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }
    public double getSide()
    {
        return length;
    }
    public void setSide(double side)
    {
        length = side;
        width = side;
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
        return width + "," + color + "," + filled;
    }

}
