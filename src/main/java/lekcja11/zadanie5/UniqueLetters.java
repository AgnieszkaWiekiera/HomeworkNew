package lekcja11.zadanie5;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueLetters {
    public static Set<Character> uniqueLettersFinder(List<String> someWords){
        Set<Character> uniqueLetters = someWords.stream()
                .map(someWord -> someWord.toUpperCase())
                .flatMap(someWord -> someWord.chars().mapToObj(c ->(char)c))
                .collect(Collectors.toSet());
        return uniqueLetters;
    }

    public static void main(String[] args) {
        List<String> crossword = Arrays.asList("motorboat", "church", "prom", "travel", "airplane", "book");
        UniqueLetters uniqueLetters = new UniqueLetters();
        System.out.println(UniqueLetters.uniqueLettersFinder(crossword));
    }
}
