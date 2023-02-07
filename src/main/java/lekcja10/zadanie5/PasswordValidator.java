package lekcja10.zadanie5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean isValid(String password){
        Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*[A-Z])(?!.*?(?:23)).{7,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}