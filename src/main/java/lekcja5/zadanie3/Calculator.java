package lekcja5.zadanie3;

public class Calculator {
    private ArthmeticOperation operation;
    public Calculator(ArthmeticOperation operation){
        this.operation = operation;
    }
    public double calculate(double value1, double value2){
        return operation.calculate(value1, value2);
    }
}