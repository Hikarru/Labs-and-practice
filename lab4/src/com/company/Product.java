package com.company;

public class Product implements Priceable {
    protected String mark;
    protected int price;
    public static int globalPrice = 0;

    public int getPrice()
    {
        return price;
    }

    Product(String mark, int price)
    {
        this.mark = mark;
        this.price = price;
        globalPrice += price;
    }

    public String getMark() {
        return mark;
    }

}
