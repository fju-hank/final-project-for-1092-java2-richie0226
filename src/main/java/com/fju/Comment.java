package com.fju;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class Comment{
    public static void main(String[] args) {
        showWindow();
    }

    public static void showWindow() {
        JFrame frame = new JFrame("Panel");
        frame.setBounds(100,100,500,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("Please enter your comment:");
        label.setFont(new Font("Tahoma",Font.PLAIN,25));
        label.setBounds(100,120,500,100);
        frame.getContentPane().add(label);

        frame.setVisible(true);

    }
}
