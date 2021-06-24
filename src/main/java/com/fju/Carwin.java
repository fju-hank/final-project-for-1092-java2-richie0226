package com.fju;
import javax.swing.*;
import java.awt.*;
public class Carwin {
    static final int WIDTH = 600;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(WIDTH, 400);
        frame.setLocation(1000, 300);
        JButton button1 = new JButton("TIME");
        JButton button2 = new JButton("EMERGENCY CALL");
        JButton button3 = new JButton("HELP");
        JButton button4 = new JButton("COMMENT");
        JButton button5 = new JButton("TOUCH TO START");
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.EAST);
        frame.add(button4, BorderLayout.WEST);
        frame.add(button5, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}