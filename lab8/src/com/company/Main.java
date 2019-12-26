package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String filePath = "C:/Users/Hikaru/Desktop/text.txt";
        input(filePath);
        output(filePath);
    }

    public static void input(String filePath)
    {
        System.out.println("Input text: ");
        Scanner scn = new Scanner(System.in);
        String text = scn.nextLine();
        System.out.println("change or add?");
        String choose = scn.nextLine();

        try {
            switch (choose) {
                case "change":
                    FileWriter writer = new FileWriter(filePath, false);//создаем поток
                    //записи в файл и указываем как аргумент путь к файлу и true - не очищать файл
                    BufferedWriter bufferWriter = new BufferedWriter(writer);//создаем буффер
                    //записи текста и указываем как аргумент поток записи
                    bufferWriter.write(text);
                    bufferWriter.close();
                    writer.close();
                    break;
                case "add":
                    FileWriter writera = new FileWriter(filePath, true);//создаем поток
                    //записи в файл и указываем как аргумент путь к файлу и true - не очищать файл
                    BufferedWriter bufferWritera = new BufferedWriter(writera);//создаем поток
                    //записи текста и указываем как аргумент поток записи
                    bufferWritera.write(text);
                    bufferWritera.close();
                    writera.close();
                    break;
                default:
                    System.out.print("error choice");
            }
        }
        catch (IOException e) { //срабатывает если в try возникает ошибка, передает код ошибки
            System.out.println(e);
        }
    }

    public static void output(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        char[] buffer = new char[8096];
        int chars = reader.read(buffer);
        while (chars != -1) {
            System.out.println(String.valueOf(buffer, 0, chars));
            chars = reader.read(buffer);
        }
        reader.close();
    }

}