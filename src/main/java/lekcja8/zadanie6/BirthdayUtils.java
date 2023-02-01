package lekcja8.zadanie6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;

public class BirthdayUtils {
    public static void getBirthdayInfo(String birthDateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(birthDateString, formatter);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);

        System.out.println("Wiek: " + age.getYears() + " lat");

        System.out.println("Dzień tygodnia urodzenia: " + birthDate.getDayOfWeek());

        System.out.println("Tydzień roku urodzenia: " + birthDate.get(WeekFields.ISO.weekOfWeekBasedYear()));
    }

    public static void main(String[] args) {
        getBirthdayInfo("1997-08-22");
    }
}
