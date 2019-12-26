package com.company;

import javax.swing.*;

public class ImageShow extends JFrame{
    private int width = 605;
    private int height = 454;

    JLabel jl = new JLabel();

    ImageShow(String arg) {
        setSize(width, height);
        setTitle("lab5");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //выступает в некотором роде деструктором окна
        setLocationRelativeTo(null); //окно появится в центре экрана
        setResizable(false);//запрещаем растягивать окно
        jl.setIcon(new ImageIcon(arg));//в лейбл записываем изображение по пути arg
        add(jl); //добавляем лейбл с картинкой в окно
        setVisible(true);

    }


    public static void main(String args[])
    {
        new ImageShow(args[0]);
    }
}
