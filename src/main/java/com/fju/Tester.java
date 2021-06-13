package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int h1=scanner.nextInt();
                int m1=scanner.nextInt();
                int tm1=h1*60+m1;
                int h2=scanner.nextInt();
                int m2=scanner.nextInt();
                int tm2=h2*60+m2;
                int tm=tm2-tm1;
                int money=0;
                if(tm>=240){
                    money=30*4+40*4+(tm-240)/30*60;
                }else if (tm>=120){
                    money=30*4+(tm-120)/30*40;
                }else{
                    money=tm/30*30;
                }
                System.out.println("從"+ h1 +" 點 "+ m1 +"分停到"+ h2 +" 點 "+ m2 +"分,共需繳交的停車費: " + money + " 元");
                scanner.close();

            }

        }
