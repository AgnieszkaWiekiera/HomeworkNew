package lekcja10.zadanie1;

public class Person {
    private String name;
    private String phoneNumber;
    private String address;

    public Person(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Imię i Nazwisko: " + name + ", Numer telefonu: " + phoneNumber + ", Adres: " + address;
    }
}
