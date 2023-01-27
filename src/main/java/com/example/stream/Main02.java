package com.example.stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("John", "Niran", 'M', LocalDate.of(2000, 06, 03), 5000),
                new Employee("James", "Carter", 'M', LocalDate.of(1990, 02, 28), 3000),
                new Employee("Katy", "Nis", 'F', LocalDate.of(1980, 06, 03), 4000),
                new Employee("Natalie", "Road", 'F', LocalDate.of(1970, 06, 03), 2000)
        );

        list.stream()
        .filter(e -> e.getSurname().startsWith("N"))
        .forEach(e -> System.out.println(e.getName() + " " + e.getSurname()));

        list.stream()
        .filter(e -> e.getBirthDay().isBefore(LocalDate.now().minusYears(30)))
        .filter(e -> e.getBirthDay().isAfter(LocalDate.now().minusYears(45)))
        .forEach(e -> System.out.println(e.getName() + " " + e.getSurname()));

        list.stream()
        .filter(e -> e.getSex().equals('F'))
        .filter(e -> e.getSalary() < 3500)
        .forEach(e -> e.setSalary(e.getSalary() * 1.1));
    }
}
