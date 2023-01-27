package com.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main04 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("James");
        list.add("John");
        list.add("Katrine");
        Consumer<List<String>> consumer = l -> printNames(l);
        consumer.accept(list);
    }

    public static void printNames(List<String> names){
        names.forEach(n -> System.out.println(n));
    }
}
