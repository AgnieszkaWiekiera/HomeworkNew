package lekcja6.zadanie5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class printFileInReverseOrder {
    public static void main(String[] args){
        String pathToFile = "data.txt";
        printFileContentReverse(pathToFile);
    }

    private static void printFileContentReverse(String pathToFile) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile))) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            for (int i = lines.size() - 1; i >= 0; i--) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytu pliku: " + e.getMessage());
        }
    }
}