package com.example.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new Employee());
        users.add(new Company());
        for (User u : users){
            if (u instanceof Payable){
                new Employee().pay();
            }
        }
    }
}
