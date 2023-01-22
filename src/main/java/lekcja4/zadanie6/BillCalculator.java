package lekcja4.zadanie6;

public class BillCalculator {
    public static double calculate(double billValue, float serviceCharge){
        return billValue + serviceCharge;
    }
    public static double calculate (double billValue, float serviceCharge, double discount){
        return billValue * (1 - discount) + serviceCharge;
    }
    public static double calculate (double billValue, float serviceCharge, short takeoutBoxCharge){
        return billValue + serviceCharge + takeoutBoxCharge;
    }
}
