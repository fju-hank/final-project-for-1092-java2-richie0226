package com.fju;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Title.txt");
            int data = fileReader.read();
            while (data!= -1) {
                System.out.print((char)data);
                data = fileReader.read();
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int fee = 30;
        Map<String, Car> cars = new HashMap<>();
        Car c1 = new Car("abc-123","Kris", "06:45");
        Car c2 = new Car("xyz-123","Bob", "07:30");
        Car c3 = new Car("ghi-123", "Adam","10:40");
        cars.put(c1.id, c1);
        cars.put(c2.id, c2);
        cars.put(c3.id, c3);
        String id = "abc-123";
        Car car = cars.get(id);
        if (car == null) {
            System.out.println("Car not found");
        } else {
            Date now = new Date();
            long ms = now.getTime() - car.getEnter().getTime();
            long mins = ms/(1000*60);
            System.out.println(mins);
        }


       practice();
    }

    public static void practice() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date d = sdf.parse("07:58");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 24);
        cal.set(Calendar.MINUTE, 30);

        System.out.println(cal.getTime());
        Car c1 = new Car("abc-123","Kris","06:45");
        Car c2 = new Car("xyz-123", "Bob","07:30");
        Car c3 = new Car("ghi-123", "Adam","10:40");
        System.out.println(c1.getEnter());
        System.out.println(c2.getEnter());
        System.out.println(c3.getEnter());
        Date now = new Date();
        System.out.println(now.getTime());
        long dis = now.getTime() - c1.getEnter().getTime();
        System.out.println(dis);



    }
}



