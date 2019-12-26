package com.company;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> deq1 = new ArrayDeque<>();
        ArrayDeque<Integer> deq2 = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) { deq1.add(scan.nextInt()); }
        for (int i = 0; i < 5; i++) { deq2.add(scan.nextInt()); }
        Game(deq1, deq2);
    }

    static void Game(ArrayDeque<Integer> deq1, ArrayDeque<Integer> deq2)
    {
        int turn = 0;
        while (!(deq1.isEmpty() || deq2.isEmpty()))
        {
            if (turn >= 106) break;
            if (deq1.peek() == 0 && deq2.peek() == 9)
            {
                deq1.add(deq1.pop());
                deq1.add(deq2.pop());
            }
            else if (deq1.peek() == 9 && deq2.peek() == 0)
            {
                deq2.add(deq2.pop());
                deq2.add(deq1.pop());
            }
            else if (deq1.peek() < deq2.peek())
            {
                deq2.add(deq2.pop());
                deq2.add(deq1.pop());
            }
            else if (deq1.peek() > deq2.peek())
            {
                deq1.add(deq1.pop());
                deq1.add(deq2.pop());
            }
            turn++;
            System.out.println("Ход №" + turn + "\nДек 1: " + deq1 + "\nДек 2:" + deq2);
        }
        if (deq1.isEmpty()) System.out.println("Игрок 2 победил");
        else if (deq2.isEmpty()) System.out.println("Игрок 1 победил");
        else System.out.println("botva");
    }
}
