package lekcja8.zadanie4b;
import lekcja8.zadanie4b.Person;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonExample {
    public static void main(String[] args) {
        Set<lekcja8.zadanie4b.Person> people = new TreeSet<>(Comparator.comparing(lekcja8.zadanie4b.Person::getHeight));
        people.add(new lekcja8.zadanie4b.Person("John", "Brown", 1994, 170, 75));
        people.add(new lekcja8.zadanie4b.Person("Karen", "Smith", 2001, 160, 60));
        people.add(new lekcja8.zadanie4b.Person("Bob", "Marley", 1990, 180, 85));
        people.add(new lekcja8.zadanie4b.Person("Lord", "Vader", 1985, 165, 55));

        System.out.println("Od najniższej do najwyższej:");
        people.forEach(System.out::println);

        Set<lekcja8.zadanie4b.Person> people2 = new TreeSet<>(Comparator.comparing(Person::getWeight).reversed());
        people2.addAll(people);
        System.out.println("\nOd najcięższej do najlżejszej:");
        people2.forEach(System.out::println);
    }
}