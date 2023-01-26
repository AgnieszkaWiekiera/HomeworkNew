package lekcja7.zadanie1;

public class NumberChecker {

    public static boolean isEven(int value){
        return value % 2 == 0;
    }
    public static  int sumOfDigitsOfGivenNumber(int value){
        int sum = 0;
        while (value > 0){
            sum += value % 10;
            value /= 10;
        }
        return sum;
    }
}