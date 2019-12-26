package com.company;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Enter Key: ");
        try {
            String key = myscanner.nextLine();
            if (key.equals(""))
                throw new Exception("Key set to empty string\n");
        }
        catch (Exception e)
        {
            System.out.print(e.getMessage());
            getKey();
            return;
        }
        System.out.print("Key has been set");
    }
}
