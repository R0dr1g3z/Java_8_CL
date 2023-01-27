package com.example.interfacesfunctional;

public class Main01 {
    public static void main(String[] args) {
        MathCheck<Integer> mathCheck = n -> n > 0 && n < 100;
        if (mathCheck.check(5)){
            System.out.println("Work");
        } else if (mathCheck.check(102)){
            System.out.println("Don't pass");
        }
    }
}
