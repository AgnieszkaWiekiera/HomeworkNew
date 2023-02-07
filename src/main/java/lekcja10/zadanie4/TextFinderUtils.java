package lekcja10.zadanie4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFinderUtils {


    public static void main(String[] args) {
        String text = "342\n5.34\n756\n1.234e+07\n7.234243E-02\n6.09\n3457\n87\n1.0001\n3\n5";
        printIntegerNumbers(text);
        printDecimalNumbers(text);
        printScientificNotationNumbers(text);
    }

    public static String printIntegerNumbers(String text) {
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(text);
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            result.append(matcher.group()).append(",");
        }

        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        System.out.println("Liczby całkowite: " + result.toString());
        return result.toString();
    }

    public static String printDecimalNumbers(String text) {
        Pattern pattern = Pattern.compile("\\b\\d+\\.\\d+\\b");
        Matcher matcher = pattern.matcher(text);
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            result.append(matcher.group()).append(",");
        }

        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        System.out.println("Liczby zmiennoprzecinkowe: " + result.toString());
        return result.toString();
    }

    public static String printScientificNotationNumbers(String text) {
        Pattern pattern = Pattern.compile("\\b\\d+\\.\\d+[Ee][+-]\\d+\\b");
        Matcher matcher = pattern.matcher(text);
        StringBuilder result = new StringBuilder();

        while (matcher.find()) {
            result.append(matcher.group()).append(",");
        }

        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        System.out.println("Liczby w notacji naukowej: " + result.toString());
        return result.toString();
    }
}
