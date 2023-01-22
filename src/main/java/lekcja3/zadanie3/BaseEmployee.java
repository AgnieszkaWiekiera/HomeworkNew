package lekcja3.zadanie3;

public abstract class BaseEmployee {
    private static final int baseSalary = 3000;
    private final String name;
    private final String surname;
    private final int salary;
    private final int yearOfEmployment;
    private static final int actualYear = 2023;

    public BaseEmployee(String name, String surname, int salary, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.yearOfEmployment = yearOfEmployment;
    }
    public BaseEmployee(String name, String surname, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
        this.salary = baseSalary;
    }
    public int getWorkYears(){
        return actualYear - yearOfEmployment;
    }
    public int getSalary(){
        return this.salary;
    }
    public abstract int calculateMonthlySalary();
}
