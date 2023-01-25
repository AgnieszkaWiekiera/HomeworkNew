package lekcja6.zadanie6;

import java.io.*;

public class TextConvertToUpperCase {
    public static void main(String[] args) {
        String inputFile = "data.txt";
        String outputFile = "output.txt";
        convertToUpperCase(inputFile, outputFile);
    }
    private static void convertToUpperCase(String inputFile, String outputFile) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas konwertowania pliku: " + e.getMessage());
        }
    }
}
