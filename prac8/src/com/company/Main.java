package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        WaitList<Integer> list = new WaitList<Integer>();
        list.add(10);
        list.add(20);
        list.remove(); //удаляем первое вошедшее число
        System.out.println(list);

        BoundedWaitList<String> list2 = new BoundedWaitList<String>(2);
        list2.add("Hello");
        list2.add("It's me");
        list2.add("Mario");
        System.out.println(list2);

        UnfairWaitList<Integer> list3 = new UnfairWaitList<Integer>();
        list3.add(10);
        list3.add(20);
        list3.add(10);
        list3.add(30);
        System.out.println(list3);
        list3.removeElement(10); //удаляем первую добавленную 10
        list3.moveToBack(); //переносим 20 из начала в конец
        System.out.println(list3);
    }
}
