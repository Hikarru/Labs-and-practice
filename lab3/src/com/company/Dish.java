package com.company;

public abstract class Dish {
    protected String color;
    protected boolean clean;

    public Dish() {
        this.color = "White";
        this.clean = false;
    }

    public Dish(String color, boolean clean) {
        this.color = color;
        this.clean = clean;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public abstract void dishClean();

    public String toString() {
        return "Color: " + color + "Clean: " + clean;
    }
}