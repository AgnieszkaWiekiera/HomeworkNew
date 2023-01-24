package lekcja6.zadanie3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileCharacterCounter {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            int characterCount = 0;
            int i;
            while ((i = fileInputStream.read()) != -1) {
                characterCount++;
            }
            System.out.println("Liczba znaków w tekście: " + characterCount);
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println("Podczas odczytywania pliku wystąpił błąd.");
            e.printStackTrace();
        }
    }
}