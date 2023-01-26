package com.example.abstractclass;

public class Circle extends Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public int calculateArea() {
        return (int) Math.round(Math.PI * Math.pow(r, 2));
    }

    @Override
    public int calculateCircuit() {
        return (int) Math.round(2 * Math.PI * r);
    }

}
