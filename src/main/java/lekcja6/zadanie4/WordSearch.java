package lekcja6.zadanie4;


import javax.sound.midi.Patch;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordSearch {

    public static void searchForGivenWordInFile(String filePath, String searchWord) {
        try {
            String text = new String(Files.readAllBytes(Paths.get(filePath)));
            System.out.println(text.contains(searchWord));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        searchForGivenWordInFile("/Users/agnieszkawiekiera-kozinska/US i Java/data.txt", "zdrowie");
    }
}