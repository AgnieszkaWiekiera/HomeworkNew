package lekcja7.zadanie2;

public class StringUtils {
    public static String toUpperCase(String input){
        if (input == null || input.isEmpty()){
            throw new IllegalArgumentException("Dane wejściowe nie mogą być zerowe ani puste.");
        }
        return input.toUpperCase();
    }
}
