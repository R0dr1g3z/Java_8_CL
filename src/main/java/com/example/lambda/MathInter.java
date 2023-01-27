package com.example.lambda;

@FunctionalInterface
public interface MathInter<N> {
    N calculate(N n);
}
