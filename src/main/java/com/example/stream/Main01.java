package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Kiron", "Andrew", "Anton", "Sonic", "Natalie", "Sonic");

        list.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("A") || s.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        List<String> list2 = list.stream()
                .distinct()
                .limit(5)
                .collect(Collectors.toList());
        list2.forEach(System.out::println);

        String streamString = list.stream()
                .sorted()
                .map(s -> s.substring(0, 3))
                .collect(Collectors.joining(","));
        System.out.println(streamString);
    }
}
