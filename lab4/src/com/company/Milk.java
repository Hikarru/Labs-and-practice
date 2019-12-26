package com.company;

public class Milk extends Product {

    public Milk(String mark, int price)
    {
        super(mark,price);
    }

    @Override public String toString()
    {
        return "Вы выбрали молоко марки " + mark + " его стоимость " + Integer.toString(price) + " ,общая стоимость всех покупок " + globalPrice + "\n";
    }
}
