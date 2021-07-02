package com.fju;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class Panel {
    static final int WIDTH = 600;

    public static void main(String[] args) {
        showWindow();
    }

    public static void showWindow() {
        JFrame frame = new JFrame("Panel");
        frame.setSize(WIDTH, 400);
        frame.setLocation(100, 200);
        JButton button1 = new JButton("TIME");
        frame.getContentPane().add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(true);
                //frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Time time = new Time();
                time.showWindow();
                time.showCurrentTime();



            }
        });
        JButton button2 = new JButton("EMERGENCY CALL");
        frame.getContentPane().add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(true);
                EmergencyCall emergencyCall = new EmergencyCall();
                emergencyCall.showWindow();

            }
        });
        JButton button3 = new JButton("HELP");
        frame.getContentPane().add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(true);
                Help help = new Help();
                Help.showWindow();

            }
        });
        JButton button4 = new JButton("COMMENT");
        frame.getContentPane().add(button4);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(true);
                Comment comment = new Comment();
                comment.showWindow();

            }
        });
        JButton button5 = new JButton("TOUCH TO START");
        frame.getContentPane().add(button5);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(true);
                Start start = new Start();
                start.showWindow();

            }
        });
        frame.add(button1, BorderLayout.NORTH);
        button1.setForeground(Color.YELLOW);
        button1.setBackground(Color.BLACK);
        frame.add(button2, BorderLayout.SOUTH);
        button2.setForeground(Color.YELLOW);
        button2.setBackground(Color.BLACK);
        frame.add(button3, BorderLayout.EAST);
        button3.setForeground(Color.YELLOW);
        button3.setBackground(Color.BLACK);
        frame.add(button4, BorderLayout.WEST);
        button4.setForeground(Color.YELLOW);
        button4.setBackground(Color.BLACK);
        frame.add(button5, BorderLayout.CENTER);
        button5.setForeground(Color.YELLOW);
        button5.setBackground(Color.BLACK);
        Font f = new Font(" ", Font.BOLD, 20);
        button1.setFont(f);
        button2.setFont(f);
        button3.setFont(f);
        button4.setFont(f);
        button5.setFont(f);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("New Frame");
    }
}

