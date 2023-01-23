package lekcja5.zadanie4;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        new Employee(name, surname);
        this.age = age;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary) {
        new Employee(name, surname,age);
        this.baseSalary = baseSalary;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary, BigDecimal bonus) {
        new Employee(name, surname, age, baseSalary);
        this.bonus = bonus;
    }

    public String getEmployeeInfo() {
        return "Employee name : " + name + " " + surname;
    }

    public String getEmployeeDetails() {
        return "Employee details : " +  name + " " + surname + " is " + age;
    }

    public BigDecimal getTotalSalary() {
        return  baseSalary.add(bonus);
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }
}