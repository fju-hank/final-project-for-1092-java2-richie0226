package com.fju;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start implements ActionListener {
    public static void main(String[] args) {
        showWindow();
    }
    public static void showWindow(){}
    JFrame jFrame;
    JButton jButton;
    JPasswordField jPasswordField;
    JLabel jLabel;
    public Start(){

        jPasswordField = new JPasswordField(15);
        jPasswordField.setText("");
        jPasswordField.addActionListener(this);
        jPasswordField.setFont(new Font("Comic Sans",Font.BOLD,15));
        jPasswordField.setForeground(Color.GRAY);
        jPasswordField.setBounds(50,70,300,200);


        jButton = new JButton("Enter");
        jButton.setBounds(150,300,100,60);
        jButton.addActionListener(this);
        jButton.setBackground(new Color(125,125,125));
        jButton.setFont(new Font("Comic Sans",Font.ITALIC,15));
        jButton.setForeground(new Color(250,250,250));
        jButton.setBorder(BorderFactory.createEtchedBorder());
        jButton.setFocusable(false);

        jFrame = new JFrame("Button Example");
        jFrame.setSize(new Dimension(420,420));
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.add(jPasswordField);
        jFrame.add(jButton);
        jFrame.setVisible(true);

        JLabel label = new JLabel("Please enter your ID:");
        label.setFont(new Font("Tahoma",Font.PLAIN,15));
        label.setBounds(60,10,500,100);
        jFrame.getContentPane().add(label);
        jFrame.setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==jPasswordField || e.getSource() == jButton){
            System.out.println(jPasswordField.getText());
            jPasswordField.setText("");
        }

    }
}
