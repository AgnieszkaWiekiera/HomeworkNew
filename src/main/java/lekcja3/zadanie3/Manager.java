package lekcja3.zadanie3;

public class Manager extends BaseEmployee {
    private static final int BASE_SALARY = 5000;
    private static final int BASE_BONUS = 500;
    private int bonus = 500;


    public Manager(String name, String surname, int yearOfEmployment, int salary, int bonus) {
        super(name, surname, yearOfEmployment, salary);
        this.bonus = BASE_BONUS;
    }

    public Manager(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment, BASE_SALARY);
        this.bonus = BASE_BONUS;
    }

    @Override
    public int calculateMonthlySalary() {
        return this.getSalary() + bonus;
    }

    void setManagerBonus(int newBonus) {
        this.bonus = newBonus;
    }
}


