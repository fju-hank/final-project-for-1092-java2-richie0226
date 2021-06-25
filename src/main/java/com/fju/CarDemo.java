package com.fju;

import javax.swing.*;

public class CarDemo {
    private JPanel mainPanel;
    private JTextField textField;
    private JButton button1;
    private JPanel  northPanel;
    String name;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CarDemo().mainPanel);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}