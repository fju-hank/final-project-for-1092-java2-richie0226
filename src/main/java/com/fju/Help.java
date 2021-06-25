package com.fju;

import javax.swing.*;
import java.awt.*;

public class Help {
    public static void main(String[] args) {
        showWindow();
    }

    public static void showWindow() {
        JFrame frame = new JFrame("Panel");
        frame.setBounds(100,100,500,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel label=new JLabel("Emergecy can call for help");
        label.setFont(new Font("Tahoma",Font.PLAIN,25));
        label.setBounds(90,0,500,200);
        frame.getContentPane().add(label);

        JLabel label1=new JLabel("Comment can ask question");
        label1.setFont(new Font("Tahoma",Font.PLAIN,25));
        label1.setBounds(90,25,500,200);
        frame.getContentPane().add(label1);

        JLabel label2=new JLabel("Time can check ");
        label2.setFont(new Font("Tahoma",Font.PLAIN,25));
        label2.setBounds(90,25,500,200);
        frame.getContentPane().add(label2);

        frame.setVisible(true);

    }
}
