package com.fju;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class Comment implements ActionListener {

    JFrame frame;
    JTextField jt;
    JButton jButton;public static void main(String[] args) {
        showWindow();
    }
    public static void showWindow() {
        JFrame frame = new JFrame("Panel");
        frame.setBounds(100,100,500,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        JButton jButton = new JButton("Enter");
        jButton.setBounds(100,40,100,60);
        JLabel label = new JLabel("Prompt:Please enter your comment");
        label.setFont(new Font("Tahoma",Font.PLAIN,25));
        label.setBounds(40,110,500,100);
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }





    public Comment(){

    jt = new JTextField(30);
    jt.setText("Enter your comment...");
    jt.addActionListener(this);
    jt.setFont(new Font("Comic Sans",Font.BOLD,15));
    jt.setForeground(Color.GRAY);
    jt.setBounds(50,70,300,200);


    jButton = new JButton("Enter");
    jButton.setBounds(150,300,100,60);
    jButton.setBackground(new Color(125,125,125));
    jButton.setFont(new Font("Comic Sans",Font.ITALIC,15));
    jButton.setForeground(new Color(250,250,250));
    jButton.setBorder(BorderFactory.createEtchedBorder());
    jButton.setFocusable(false);

    frame = new JFrame("Button Example");
    frame.setSize(new Dimension(420,420));
    frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.add(jt);
    frame.add(jButton);
    frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}
