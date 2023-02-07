package lekcja6.zadanie1;
import java.io.FileWriter;
import java.io.IOException;

public class FileMaking {
    public static void makeNewFile(String[] args) {
        String data = "Kurs\nJava\nLekcja 6\nPliki\nWyjątki\nPliki\nKoniec pliku\n";
        try (FileWriter fileWriter = new FileWriter("data.txt")) {
            fileWriter.write(data);
            System.out.println("Utworzono plik data.txt.");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas tworzenia pliku data.txt: " + e.getMessage());
        }
    }
}