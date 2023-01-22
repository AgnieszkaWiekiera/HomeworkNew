package lekcja5.zadanie1;
import java.util.Scanner;
public class Text {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jakiś tekst");
        String text = scanner.nextLine();

        if (text.length() == 0){
            System.out.println("Brak tekstu");
        }
        else {
            int length = text.length();
            System.out.println("Ilość znaków w tekście: " + length);

            boolean isPalindrome = true;
            for (int i = 0; i < length / 2; i++){
                if (text.charAt(i) != text.charAt(length - i - 1)){
                isPalindrome = false;
                break;
                }
            }
            if (isPalindrome){
                System.out.println("To jest palindrom");
            }
            else {
                System.out.println("To nie jest palindrom");
            }
        }
    }
}