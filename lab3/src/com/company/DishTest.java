package com.company;

public class DishTest {
    public static void main(String[] args)
    {
        CookWare cookWare = new CookWare("Fork", false, "Red");
        System.out.println(cookWare);
        cookWare.dishClean();
    }
}
