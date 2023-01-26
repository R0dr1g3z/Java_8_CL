package com.example.abstractclass;

public class Square extends Shape {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public int calculateArea() {
        return a * a;
    }

    @Override
    public int calculateCircuit() {
        return 4 * a;
    }
}
