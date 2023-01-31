package lekcja7.zadanie3;
public class TextUtils {
    public static int getStringLength(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Dane wejściowe nie mogą być zerowe ani puste.");
        }
        return input.length();
    }
}
