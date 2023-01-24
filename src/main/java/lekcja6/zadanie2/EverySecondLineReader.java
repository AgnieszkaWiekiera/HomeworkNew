package lekcja6.zadanie2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EverySecondLineReader {
    private String filePath;

    public EverySecondLineReader(String filePath) {
        this.filePath = filePath;
    }

    public void readEveryOtherLine() throws IOException {
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        int lineNumber = 1;
        while ((st = br.readLine()) != null) {
            if (lineNumber % 2 == 0) {
                System.out.println(st);
            }
            lineNumber++;
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        EverySecondLineReader reader = new EverySecondLineReader("data.txt");
        reader.readEveryOtherLine();
    }
}