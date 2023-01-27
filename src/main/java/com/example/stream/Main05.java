package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main05 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Garden", "Stranger", "Game", "Ananas", "Jumping", "Trace", "James");

        Map<String, String> map = list.stream()
                .collect(Collectors.toMap(s -> s, s -> new StringBuilder(s).reverse().toString()));
    }
}
