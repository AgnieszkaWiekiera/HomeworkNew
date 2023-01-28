package lekcja8zadanie4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int height;
    private int weight;

    public Person(String firstName, String lastName, int birthYear, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + birthYear + ", " + height + "cm, " + weight + "kg";
    }
}