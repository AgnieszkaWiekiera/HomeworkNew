package lekcja11.zadanie1;

import java.util.stream.IntStream;

public class DividedByThree {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;

        IntStream.rangeClosed(start, end)
                .filter(n -> n % 3 == 0)
                .forEach(System.out::println);
    }
}
