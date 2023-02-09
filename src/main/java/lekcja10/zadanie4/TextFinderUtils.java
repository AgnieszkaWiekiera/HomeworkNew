package lekcja10.zadanie4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFinderUtils {

    public static void main(String[] args) {
        String text = "342\n5.34\n756\n1.234e+07\n7.234243E-02\n6.09\n3457\n87\n1.0001\n3\n5";
        printIntegerDecimalAndScientificNotationNumbers(text);
    }

    public static void printIntegerDecimalAndScientificNotationNumbers(String text) {
        Pattern patternInteger = Pattern.compile("\\b\\d+\\b");
        Pattern patternDecimal = Pattern.compile("\\b\\d+\\.\\d+\\b");
        Pattern patternScientificNotation = Pattern.compile("\\b\\d+\\.\\d+[Ee][+-]\\d+\\b");

        Matcher matcherInteger = patternInteger.matcher(text);
        Matcher matcherDecimal = patternDecimal.matcher(text);
        Matcher matcherScientificNotation = patternScientificNotation.matcher(text);

        StringBuilder resultInteger = new StringBuilder();
        StringBuilder resultDecimal = new StringBuilder();
        StringBuilder resultScientificNotation = new StringBuilder();

        while (matcherInteger.find()) {
            resultInteger.append(matcherInteger.group()).append(", ");
        }
        while (matcherDecimal.find()) {
            resultDecimal.append(matcherDecimal.group()).append(", ");
        }
        while (matcherScientificNotation.find()) {
            resultScientificNotation.append(matcherScientificNotation.group()).append(", ");
        }

        if (resultInteger.length() > 0) {
            resultInteger.setLength(resultInteger.length() - 1);
        }
        if (resultDecimal.length() > 0) {
            resultDecimal.setLength(resultDecimal.length() - 1);
        }
        if (resultScientificNotation.length() > 0) {
            resultScientificNotation.setLength(resultScientificNotation.length() - 1);
        }

        System.out.println("Liczby całkowite: " + resultInteger.toString());
        System.out.println("Liczby zmiennoprzecinkowe: " + resultDecimal.toString());
        System.out.println("Liczby w notacji naukowej: " + resultScientificNotation.toString());
    }
}
