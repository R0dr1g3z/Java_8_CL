package com.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main02 {
    public static void main(String[] args) {
        Predicate<Object> predicate = n -> n instanceof Number;
        List<Object> list = new ArrayList<>();
        list.add(56);
        list.add(55.55);
        list.add("1234");
        list.add(false);
        for (Object o : list){
            if (predicate.test(o)){
                System.out.println(o);
            }
        }
    }
}
