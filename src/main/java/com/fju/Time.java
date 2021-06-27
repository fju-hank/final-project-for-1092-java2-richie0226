package com.fju;

import javax.swing.*;
import java.awt.*;
import java.util.*; //要使用到 Calendar 等...
public class Time {
    static Label lab=new Label();
    static Calendar calendar = new GregorianCalendar();  //建立一個 Calendar
    public static void main(String [] args) {
        showWindow();
        Time time = new Time();
        time.showCurrentTime();
    }

    public static void showWindow() {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 500, 400);// 設定視窗的長為500、寬為400個像素// 設定視窗的位置
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);                 // 取消視窗的版面設定
        frame.setBackground(Color.YELLOW);  // 設定黃色的背景
        lab.setBounds(100, 100, 300, 200);      // 設定標籤的位置
        lab.setBackground(Color.WHITE);    // 設定標籤的顏色
        frame.add(lab);                          // 將標籤物件lab加入視窗中
        Font f = new Font(" ", Font.BOLD, 30);
        lab.setFont(f);
        frame.setVisible(true); // 將視窗顯示出來
    }

        public void setTime ()  //設定系統時間
        {
            calendar.setTimeInMillis(System.currentTimeMillis());
        }

        public int getYear ()  //取得年
        {
            return calendar.get(Calendar.YEAR);
        }

        public int getMonth ()  //取得月
        {
            return (calendar.get(Calendar.MONTH) + 1);
        }

        public int getDate ()  //取得日
        {
            return calendar.get(Calendar.DATE);
        }

        public int getHour ()  //取得小時
        {
            return calendar.get(Calendar.HOUR_OF_DAY);
        }

        public int getMinute ()  //取得分鐘
        {
            return calendar.get(Calendar.MINUTE);
        }

        public int getSecond ()  //取得秒數
        {
            return calendar.get(Calendar.SECOND);
        }

        public void showCurrentTime ()  //顯示目前時間
        {
            while (true) {
                setTime();
                lab.setText(getYear() + "/" + getMonth() + "/" +
                        getDate() + "/" + getHour() + ":" +
                        getMinute() + ":" + getSecond());

            }
        }



}
