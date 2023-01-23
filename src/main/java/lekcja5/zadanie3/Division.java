package lekcja5.zadanie3;

public class Division implements ArthmeticOperation{
    @Override
    public double calculate(double value1, double value2) {
        if (value2 == 0){
            throw new IllegalArgumentException("Dzielenie przez 0 niedozwolone");
        }
        return value1 / value2;
    }
}