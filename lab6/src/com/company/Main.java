package com.company;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Main extends JFrame {
    private int width = 400;
    private  int height = 400;

    JButton jb1 = new JButton("North");
    JButton jb2 = new JButton("East");
    JButton jb3 = new JButton("West");
    JButton jb4 = new JButton("South");
    JButton jb5 = new JButton("Center");

    Main()
    {
        setTitle("lab6");
        setSize(width, height);
        setLayout(new BorderLayout());
        add(jb1, BorderLayout.NORTH);
        add(jb2, BorderLayout.EAST);
        add(jb3, BorderLayout.WEST);
        add(jb4, BorderLayout.SOUTH);
        add(jb5, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jb1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на север");
            }
        });
        jb2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на восток");
            }
        });
        jb3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на запад");
            }
        });
        jb4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать на юг");
            }
        });
        jb5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в центр");
            }
        });
        setVisible(true);
    }


    public static void main(String[] args) {
        new Main();
    }
}
