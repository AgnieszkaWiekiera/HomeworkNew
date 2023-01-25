package lekcja6.zadanie2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EverySecondLineReader {

    public static void read(String name) {
        try (BufferedReader reader = new BufferedReader(new FileReader(name))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (lineNumber % 2 == 0) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Podczas odczytu pliku wystąpił błąd: " + e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
       read("data.txt");
    }
}