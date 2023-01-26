package com.example.abstractclass;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculateArea() {
        return a * b;
    }

    @Override
    public int calculateCircuit() {
        return 2 * a + 2 * b;
    }
}
