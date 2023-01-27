package com.example.lambda;

public class Main03 {
    public static void main(String[] args) {
        MathInter<Double> power = n -> Math.pow(n, 2);
        MathInter<Double> square = n -> Math.sqrt(n);
        System.out.println(power.calculate(5d));
        System.out.println(square.calculate(9d));
    }
}
