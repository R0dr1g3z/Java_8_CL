package com.example.date;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapTime {
    public static Map<String, LocalTime> getMapTime() {
        Set<String> zones = ZoneId.getAvailableZoneIds();
        return zones.stream()
                .collect(Collectors.toMap(s -> s, s -> LocalTime.now(ZoneId.of(s))));
    }
}
