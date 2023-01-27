package com.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main01 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("String");
        list.add(5);
        list.add(true);
        Predicate<Object> predicate = s -> s instanceof String;
        for (Object o : list){
            if (predicate.test(o)){
                System.out.println(o);
            }
        }
    }
}
