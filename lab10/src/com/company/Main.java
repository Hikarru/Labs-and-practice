package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
	    Integer[] mass = new Integer[3];
	    mass[0] = 1;
	    mass[1] = 0;
	    mass[2] = 2;
	    ArrayList<?> mass2 = method_1(mass);
	    System.out.println(mass2);

	    Ex_2 ex2 = new Ex_2(3);
	    ex2.add(1);
	    ex2.add(2);
	    ex2.add("qq");
        System.out.println(ex2);

	    System.out.println(ex2.get(2));

	    method_4();
    }

    public static <T> ArrayList<T> method_1(T[] mass)
    {
        ArrayList<T> arr = new ArrayList<T>();
        for (T i : mass)
            arr.add(i);
        return arr;
    }

    public static void method_4()
    {
        ArrayList<File> files = new ArrayList<File>();
        File dir = new File("C:/");
        if (dir.isDirectory())
        {
            for (File item : dir.listFiles()) //проходим по всем файлам нашей директории
            {
                files.add(item);
                if (item.isDirectory())
                {
                    System.out.println(item.getName() + " catalog");
                }
                else System.out.println(item.getName() + " file");
            }
        }
        System.out.println("First 5 files");
        for (int i = 0; i < 5; i++)
            System.out.print(i + ") " + files.get(i).getName());
    }
}
