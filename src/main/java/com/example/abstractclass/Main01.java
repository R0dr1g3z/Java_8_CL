package com.example.abstractclass;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(250, "Audi", "RS8"));
        vehicles.add(new Train(400, "Speeding", 300));
        for (Vehicle v : vehicles){
            System.out.println(v.toString());
        }
    }
}
