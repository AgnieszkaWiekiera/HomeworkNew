package lekcja5.zadanie1;


public class TextUtils {

    public static String checkText(String text) {
        if(text.length() > 0) {
            if(isPalindrome(text)) {
                return "Tekst jest palindromem. Długość tekstu: " + text.length();
            } else {
                return "Tekst nie jest palindromem. Długość tekstu: " + text.length();
            }
        } else {
            return "Text is empty.";
        }
    }

    public static boolean isPalindrome(String text) {
        return text.equals(new StringBuilder(text).reverse().toString());
    }
}



