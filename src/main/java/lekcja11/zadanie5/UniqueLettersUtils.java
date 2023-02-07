package lekcja11.zadanie5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueLettersUtils {
    public static void printUniqueLetters(List<String> words){
        words.stream()
                .map(String::toUpperCase)
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .distinct()
                .forEach(System.out::println);
    }
}
