package com.company;

import java.util.Arrays;

public class Ex_2 {
    public static Object [] SuperArray;

    Ex_2(int n){
        this.SuperArray = new Object[n];
    }
    Ex_2(){
         this.SuperArray = new Object[10];
    }

    public Object[] add(Object o){
        int count = -1;
        do{
            count++;
        }
        while (SuperArray[count]!=null);
        if(SuperArray[count] == null){
            SuperArray[count] = o;
        }
        return SuperArray;
    }


    public String toString(){ //метод для преобразования массива в строку
        return Arrays.toString(SuperArray);
    }

    public Object get(int i){ //метод для получения данных любого типа
        return SuperArray[i];
    }

}
