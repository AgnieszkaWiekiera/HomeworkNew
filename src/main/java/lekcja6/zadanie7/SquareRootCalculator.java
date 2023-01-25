package lekcja6.zadanie7;

public class SquareRootCalculator {
    public static void main(String[] args) {
        double number = -4;
        double result = getSquareRoot(number);
        System.out.println("Pierwiastek z liczzby " + number + " wynosi " + result);
    }
    private static double getSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Nie można wyciągnąć pierwiastka kwadratowego z liczby ujemnej.");
        }
        return Math.sqrt(number);
    }
}
