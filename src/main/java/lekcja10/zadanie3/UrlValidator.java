package lekcja10.zadanie3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {
    public static boolean isValidUrl(String url) {
        String regex = "((http|https)://)(www.)?"
                + "[a-zA-Z0-9@:%._\\+~#?&//=]"
                + "{2,256}\\.[a-z]"
                + "{2,6}\\b([-a-zA-Z0-9@:%"
                + "._\\+~#?&//=]*)";
        Pattern pattern = Pattern.compile(regex);
        if (url == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String url1 = "http://www.onet.pl";
        if (isValidUrl(url1) == true) {
            System.out.println("Poprawny");
        } else
            System.out.println("Niepoprawny");

        String url2 = "https://mail.google.com";
        if (isValidUrl(url2) == true) {
            System.out.println("Poprawny");
        } else
            System.out.println("Niepoprawny");

        String url3 = "http://wiadmosci.onet.pl";
        if (isValidUrl(url3) == true) {
            System.out.println("Poprawny");
        } else
            System.out.println("Niepoprawny");

        String url4 = "http://onet.pl";
        if (isValidUrl(url4) == true) {
            System.out.println("Poprawny");
        } else
            System.out.println("Niepoprawny");
    }
}