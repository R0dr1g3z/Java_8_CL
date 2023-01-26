package com.example.designpatterns.facade;

public class Transfer {
    public void transferMoney(String user1, String user2, int value) {
        System.out.println("Transfer " + value + " from " + user1 + " to " + user2);
    }
}
