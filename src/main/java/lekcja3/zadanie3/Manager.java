package lekcja3.zadanie3;

public class Manager extends BaseEmployee {
    private static final int baseSalary = 5000;
    private static final int baseBonus = 500;
    private int bonus = 500;

    public Manager(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment, baseSalary);
        this.bonus = baseBonus;
    }

    public Manager(String name, String surname, int salary, int yearOfEmployment) {
        super(name, surname, salary, yearOfEmployment);
        this.bonus = baseBonus;
    }

    @Override
    public int calculateMonthlySalary() {
        return this.getSalary() + bonus;
    }

    void setManagerBonus(int newBonus) {
        this.bonus = newBonus;
    }
}


