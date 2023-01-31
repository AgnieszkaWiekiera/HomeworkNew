package lekcja10.zadanie3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UrlValidatorTest {

    @Test
    void isUrlCorrect() {
        String url = "http://www.onet.pl";
        boolean isUrl = UrlValidator.isValidUrl(url);
        Assertions.assertTrue(isUrl);
    }

    @Test
    void isUrl2Correct() {
        String url2 = "https://mail.google.com";
        boolean isUrl = UrlValidator.isValidUrl(url2);
        Assertions.assertTrue(isUrl);
    }

    @Test
    void isUrl3Correct() {
        String url3 = "http://wiadmosci.onet.pl";
        boolean isUrl = UrlValidator.isValidUrl(url3);
        Assertions.assertTrue(isUrl);
    }

    @Test
    void isUrlInccorect() {
        String url3 = "httttp://wiadmosci.onet.pl";
        boolean isUrl = UrlValidator.isValidUrl(url3);
        Assertions.assertFalse(isUrl);
    }
}