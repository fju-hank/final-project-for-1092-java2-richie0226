package com.fju;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Title {
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
    }

}

