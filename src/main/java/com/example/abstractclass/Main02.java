package com.example.abstractclass;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5, 2));
        shapes.add(new Square(5));
        shapes.add(new Circle(7));
        for (Shape s : shapes){
            System.out.println(String.format("Area: %s Circuit: %s", s.calculateArea(), s.calculateCircuit()));
        }
    }
}
