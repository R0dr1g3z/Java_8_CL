package com.example.date;

import java.time.LocalDate;
import java.time.Period;

public class Main04 {
    public static void main(String[] args) {
        System.out.println(Period.between(LocalDate.EPOCH, LocalDate.now()).getYears());
    }
}
