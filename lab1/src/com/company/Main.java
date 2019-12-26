package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int n = 5;
        //func1();
        func2(args);
        func3();
        //func4();
        //func5(n);
    }

    public static void func1()
    {
        int [] mas = new int [3];
        mas[0] = 11;
        mas[1] = 1;
        mas[2] = 10;
        int s = 0;
        int i = 0;
        for(i=0; i<3;i++)
        {
            s += mas[i];
        }
        System.out.println(s);
        s = 0;
        i = 0;
        while (i < mas.length)
        {
            s += mas[i];
            i++;
        }
        System.out.println(s);
        s = 0;
        i = 0;
        do{
            s += mas[i];
            i++;
        }while(i<mas.length);
        System.out.println(s);
    }

    public static void func2(String[] mas)
    {
        for(int i = 0; i < mas.length; i++)
        {
            System.out.println(mas[i]);
        }
    }

    public static void func3()
    {
        for(double i = 1; i < 11; i++)
        {
            System.out.println("1/" + (int)i + ", " + (double)Math.round((1/i)*100)/100);
        }
    }

    public static void func4() {
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round(Math.random() * 10);
            System.out.print(mas[i] + " ");
        }
        Arrays.sort(mas);
        System.out.println();
        for (int i = 0; i <mas.length; i++)
        {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    public static void func5(int n)
    {
        int result = 1;
        for (int i = 1; i <= n; i ++)
        {
            result = result * i;
        }
        System.out.println(result);
    }
}