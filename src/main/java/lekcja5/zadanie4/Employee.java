package lekcja5.zadanie4;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;

    public Employee(String name, String surname, BigDecimal baseSalary, BigDecimal bonus) {
        this.name = name;
        this.surname = surname;
        this.baseSalary = BigDecimal.ZERO;
        this.bonus = BigDecimal.ZERO;
    }

    public Employee(String name, String surname, int age) {
        this(name, surname, BigDecimal.ZERO, BigDecimal.ZERO);
        this.age = age;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary) {
        this(name, surname,age);
        this.baseSalary = baseSalary == null ? BigDecimal.ZERO : baseSalary;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary, BigDecimal bonus) {
        this(name, surname, age, baseSalary);
        this.bonus = bonus == null ? BigDecimal.ZERO : bonus;
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