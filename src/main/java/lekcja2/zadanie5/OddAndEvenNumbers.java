package lekcja2.zadanie5;

public class OddAndEvenNumbers {

    public static String getEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "parzysta";
        } else {
            return "nieparzysta";
        }
    }
}
