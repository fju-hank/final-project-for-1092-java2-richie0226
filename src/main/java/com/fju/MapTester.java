package com.fju;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("001", "王小明");
        students.put("005", "王莊輝");
        students.put("007", "王名杰");
        students.put("009", "王建中");
        String name = students.get("001");
        System.out.println(name);
    }
}
