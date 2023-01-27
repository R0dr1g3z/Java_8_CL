package com.example.date;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class Main01 {
    public static void main(String[] args) {
        Set<String> availableZoneId = ZoneId.getAvailableZoneIds();
        availableZoneId.stream()
        .filter(s -> s.contains("Europe"))
        .map(s -> ZoneId.of(s))
        .forEach(s -> System.out.println(s + ": " + LocalTime.now(s)));
    }
}
