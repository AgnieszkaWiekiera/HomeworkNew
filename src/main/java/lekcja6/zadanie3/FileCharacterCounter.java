package lekcja6.zadanie3;

import java.io.*;

public class FileCharacterCounter {
    public static void count(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            int characters = 0;
            while (bufferedReader.readLine() != null) {
                characters += bufferedReader.readLine().length();
            }
            System.out.println("Liczba znaków w pliku: " + characters);
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytu pliku: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        count("data.txt");
    }
}