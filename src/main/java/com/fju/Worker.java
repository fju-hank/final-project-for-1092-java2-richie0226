package com.fju;

import javax.swing.*;

public class Worker implements Runnable {
    private int times;
    public Worker(int times){
        this.times = times;
    }

    @Override
    public void run() {
        for(int i = 0; i < this.times; i++){

            Counter.count++;
        }
    }
    }




