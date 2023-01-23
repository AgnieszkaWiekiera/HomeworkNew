package lekcja5.zadanie3;

public class Multiplication implements ArthmeticOperation{
    @Override
    public double calculate(double value1, double value2) {
        return value1 * value2;
    }
}