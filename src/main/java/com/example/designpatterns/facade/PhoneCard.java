package com.example.designpatterns.facade;

public class PhoneCard {
    public void recharge(int phone, int value) {
        System.out.println("Charge " + phone + " by value " + value + "$");
    }
}
