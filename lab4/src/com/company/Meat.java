package com.company;

public class Meat extends Product {
    Meat(String mark, int price)
    {
        super(mark,price);
    }

    @Override
    public String toString()
    {
        return "Вы выбрали мясо марки " + mark + " его стоимость " + Integer.toString(price) + " ,общая стоимость всех покупок " + globalPrice + "\n";
    }
}
