package lekcja3.zadanie3;

public class TicketSeller extends BaseEmployee{
    public TicketSeller(String name, String surname, int salary, int yearOfEmployment) {
        super(name, surname, salary, yearOfEmployment);
    }

    public TicketSeller(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment);
    }

    @Override
    public int calculateMonthlySalary() {
        return getSalary();
    }
}
