package com.fju;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Car  {
    String id;
    String lastname;
    private Date enter;

    public Car(String id, String lastname) {
        this.id = id;
        this.lastname = lastname;
        enter = new Date();
    }
    public Car(String id, String lastname, String time) {
        this.id = id;
        //"07:30"
        Calendar now = Calendar.getInstance();
        String[] tokens = time.split(":");
        System.out.println("ID: " + id);
        System.out.println("Lastname: " + lastname);
        System.out.println("Get in at " + tokens[0] + ":" + tokens[1]);
        System.out.println();
        now.set(Calendar.HOUR_OF_DAY, Integer.parseInt(tokens[0]));
        now.set(Calendar.MINUTE, Integer.parseInt(tokens[1]));
        enter = now.getTime();

    }

    public Car() {
    }

    public Date getEnter() {
        return enter;
    }
}