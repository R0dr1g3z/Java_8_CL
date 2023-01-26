package com.example.designpatterns.facade;

public class BankAccount {
    public void deposit(int value) {
        System.out.println("Deposit " + value + "$");
    }
    public void payout(int value){
        System.out.println("Payout " + value + "$");
    }
}
