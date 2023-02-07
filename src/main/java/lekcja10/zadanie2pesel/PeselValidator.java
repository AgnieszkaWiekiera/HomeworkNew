package lekcja10.zadanie2pesel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {
    public static boolean isValid(String pesel){
        Pattern pattern = Pattern.compile("^\\d{11}");
        Matcher matcher = pattern.matcher(pesel);
        return matcher.matches();
    }
}
