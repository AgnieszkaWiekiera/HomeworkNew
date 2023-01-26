package lekcja6.zadanie9;

public class ValidateDivisibleByThree {
    public static void main(String[] args) {
        int[] values = {6, 42, 63, 64, 105, 106};
        validate(values);
    }
    public static void validate(int[] values) {
        for (int value : values) {
            try {
                if (value % 3 != 0) {
                    throw new IllegalArgumentException("Wartość " + value + " jest niepodzielna przez 3.");
                }
                System.out.println("Wartość " + value + " jest podzielma przez 3.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}