package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main04 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Garden", "Stranger", "Game", "Ananas", "Jumping", "Trace", "James");

        list.stream()
                .forEach(s -> System.out.println(s.length()));

        List<String> listSorted = list.stream()
                .sorted()
                .collect(Collectors.toList());

        list.stream()
                .filter(s -> s.toLowerCase().contains("m"))
                .forEach(System.out::println);

        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }
}
