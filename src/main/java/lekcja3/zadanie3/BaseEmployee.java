package lekcja3.zadanie3;

public abstract class BaseEmployee {
    private static final int BASE_SALARY = 3000;
    private final String name;
    private final String surname;
    private final int yearOfEmployment;
    private final int salary;
    private static final int actualYear = 2023;

    public BaseEmployee(String name, String surname, int yearOfEmployment, int salary) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
        this.salary = salary;
    }

    public BaseEmployee(String name, String surname, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
        this.salary = BASE_SALARY;
    }

    public int getWorkYears(){
        return actualYear - yearOfEmployment;
    }

    public int getSalary(){
        return this.salary;
    }

    public abstract int calculateMonthlySalary();
}
