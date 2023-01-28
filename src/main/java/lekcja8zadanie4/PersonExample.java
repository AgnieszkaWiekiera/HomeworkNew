package lekcja8zadanie4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonExample {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>(Comparator.comparing(Person::getHeight));
        people.add(new Person("John", "Brown", 1994, 170, 75));
        people.add(new Person("Karen", "Smith", 2001, 160, 60));
        people.add(new Person("Bob", "Marley", 1990, 180, 85));
        people.add(new Person("Lord", "Vader", 1985, 165, 55));

        System.out.println("Od najniższej do najwyższej:");
        people.forEach(System.out::println);

        Set<Person> people2 = new TreeSet<>(Comparator.comparing(Person::getWeight).reversed());
        people2.addAll(people);
        System.out.println("\nOd najcięższej do najlżejszej:");
        people2.forEach(System.out::println);

        Set<Person> people3 = new TreeSet<>(Comparator.comparing(Person::getBirthYear));
        people3.addAll(people);
        System.out.println("\nOd najmłodszej do najstarszej:");
        people3.forEach(System.out::println);
    }
}