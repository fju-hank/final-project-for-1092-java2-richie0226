package com.fju;
import javax.swing.*;
import java.awt.*;
import java.awt.desktop.OpenFilesHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel  {
    static final int WIDTH = 600;
    private JButton button1;

    public static void main(String[] args) {
        showWindow();
    }

    public static void showWindow(){
        JFrame frame = new JFrame("PANEL");
        frame.setSize(WIDTH, 400);
        frame.setLocation(1000, 200);
        JButton button1 = new JButton("TIME");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.setVisible(false);
                Clock clock = new Clock();
                clock.showWindow();

            }
        });
        JButton button2 = new JButton("EMERGENCY CALL");
        JButton button3 = new JButton("HELP");
        JButton button4 = new JButton("COMMENT");
        JButton button5 = new JButton("TOUCH TO START");
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
        Font f=new Font(" ",Font.BOLD,20);
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
