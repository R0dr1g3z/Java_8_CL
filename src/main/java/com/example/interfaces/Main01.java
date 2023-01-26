package com.example.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        List<Moveable> moveableList = new ArrayList<>();
        moveableList.add(new Cat());
        moveableList.add(new Car());
        moveableList.add(new Person());
        for (Moveable m : moveableList){
            m.start();
        }
    }
}
