package com.company;

public class Main {

    public static void main(String[] args) {
        Product obj1 = createProduct("Мясной ряд", 1000, 0);
        System.out.print(obj1);
        Product obj2 = createProduct("Молочная река", 500, 1);
        System.out.print(obj2);
    }

    static Product createProduct(String mark, int price, int indexNumber)
    {
        switch(indexNumber)
        {
            case 0:
                return new Meat(mark, price);
            case 1:
                return  new Milk(mark, price);
        }
        return null;
    }
}
