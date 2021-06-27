package com.fju;

import java.util.HashMap;
import java.util.Map;

public class Counter {
    public static int count = 0;
    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();

        Thread thread1 = new Thread(new Worker(1000000));
        Thread thread2 = new Thread(new Worker(1000000));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        long endTime = System.currentTimeMillis();
        System.out.print("Total time: ");
        System.out.println(endTime-startTime+" ms");
        Map<String, String> customers = new HashMap<>();
        customers.put("001", "Kris");
        customers.put("005", "Bob");
        customers.put("007", "Adam");
        customers.put("011", "Sandy");
        String name = customers.get("001");
        String name1 = customers.get("005");
        String name2 = customers.get("007");
        String name3 = customers.get("011");
        System.out.println( "001 = " + name);
        System.out.println( "005 = " + name1);
        System.out.println( "007 = " + name2);
        System.out.println( "011 = " + name3);
    }
}
