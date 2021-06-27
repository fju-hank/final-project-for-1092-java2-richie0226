package com.fju;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {


        System.out.println("Welcome,Please enter your information");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose car\'s id: ");
        System.out.println("(1)abc-123 (2)xyz-123 (3)ghi-123 ");
        int id = Integer.parseInt(scanner.next());
        System.out.println("Please choose car\'s lastname: ");
        System.out.println("(1)Kris (2)Bob (3)Chen ");
        int lastname = Integer.parseInt(scanner.next());
        System.out.println("Please choose car\'s time: ");
        System.out.println("(1)6:45 (2)7:30 (3)10:30 ");
        int time = Integer.parseInt(scanner.next());
        System.out.println("ID: " + id + ", Lastname: " + lastname + ", Time: " + time);
    }
}