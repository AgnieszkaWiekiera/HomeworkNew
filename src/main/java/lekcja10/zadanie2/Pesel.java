package lekcja10.zadanie2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pesel {
    public static boolean isPesel(String pesel){
        Pattern pattern = Pattern.compile("^\\d{11}$");
        Matcher matcher = pattern.matcher(pesel);
        boolean matches = matcher.matches();
        return  matches;
    }
}
