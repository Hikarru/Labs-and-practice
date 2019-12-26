package com.company;

import java.util.Comparator;

public class Student {
    private String name;
    private int ID;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    Student(String name, int ID)
    {
        this.name = name;
        this.ID = ID;
    }


    @Override public String toString()
    {
        return "Имя: " + name + ", ID: " + ID + "\n";
    }
}
