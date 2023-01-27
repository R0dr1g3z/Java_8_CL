package com.example.stream;

import java.time.LocalDate;

public class Employee {
    private String name, surname;
    private Character sex;
    private LocalDate birthDay;
    private double salary;

    public Employee(String name, String surname, Character sex, LocalDate birthDay, double salary) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.birthDay = birthDay;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
