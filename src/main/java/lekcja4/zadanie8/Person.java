package lekcja4.zadanie8;

import java.util.Objects;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String idCode;

    public Person(String firstName, String lastName, int age, String idCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.idCode = idCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && firstName.equals(person.firstName) && lastName.equals(person.lastName) && idCode.equals(person.idCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, idCode);
    }
}
