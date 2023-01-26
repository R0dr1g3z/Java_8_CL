package com.example.interfaces;

public interface Payable {
    default void pay(){
        System.out.println("Paid");
    }
}
