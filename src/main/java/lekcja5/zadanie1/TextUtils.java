package lekcja5.zadanie1;

public class TextUtils {

    public static String checkText(String text) {
        if(isNotEmpty(text) && isPalindrome(text)) {
            return "Tekst jest palindromem. Długość tekstu: " + textLength(text);
        } else {
            return "Tekst nie jest palindromem. Długość tekstu: " + textLength(text);
        }
    }

    private static boolean isNotEmpty(String text) {
        return text != null && text.length() > 0;
    }

    private static int textLength(String text) {
        return text != null ? text.length() : 0;
    }

    private static boolean isPalindrome(String text) {
        return text.equals(new StringBuilder(text).reverse().toString());
    }
}



