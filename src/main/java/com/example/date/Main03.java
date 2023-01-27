package com.example.date;

import java.time.LocalTime;
import java.util.Map;

public class Main03 {
    public static void main(String[] args) {
        Map<String, LocalTime> map = MapTime.getMapTime();
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
