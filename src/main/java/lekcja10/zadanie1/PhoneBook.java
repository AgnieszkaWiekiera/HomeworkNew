package lekcja10.zadanie1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Person> book;

    public PhoneBook() {
        book = new HashMap<>();
    }

    public void addPerson(String name, String phoneNumber, String address) {
        Person person = new Person(name, phoneNumber, address);
        book.put(name, person);
    }

    public Person searchByName(String name) throws Exception {
        if (book.containsKey(name)) {
            return book.get(name);
        } else {
            throw new Exception("Wpis nie został znaleziony");
        }
    }

    public void readFromFile(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] contactData = line.split(",");
                addPerson(contactData[0], contactData[1], contactData[2]);
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytywania danych z pliku: " + e.getMessage());
        }
    }
}