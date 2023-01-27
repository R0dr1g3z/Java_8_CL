package com.example.date;

import java.time.LocalDate;
import java.time.Month;

public class Main02 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2019, Month.DECEMBER, 24);
        for (int i = 1; i <= 10; i++) {
            System.out.println(date.getDayOfWeek());
            date = date.plusYears(i);
        }
    }
}
