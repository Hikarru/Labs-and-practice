package com.company;

public class CookWare extends Dish{
    protected String type;

    public CookWare()
    {
        super();
        this.type = "Plate";
    }

    public CookWare(String type)
    {
        super();
        this.type = type;

    }

    public CookWare(String type, boolean clean, String color)
    {
        super(color, clean);
        this.type = type;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void dishClean()
    {
        if(clean == false)
        {
            clean = true;
            System.out.println(type + " was washed");
        }
    }

    @Override
    public String toString()
    {
        return type + "," + color + "," + clean;
    }
}
