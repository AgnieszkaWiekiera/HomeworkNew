package lekcja6.zadanie0;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
    public static void writeToFile(String fileName, String data) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(data);
            System.out.println("Utworzono plik " + fileName);
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas tworzenia pliku: " + fileName + " " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        writeToFile("data.txt","Kurs\nJava\nLekcja 6\nPliki\nWyjątki\nPliki\nKoniec pliku\n");
    }
}