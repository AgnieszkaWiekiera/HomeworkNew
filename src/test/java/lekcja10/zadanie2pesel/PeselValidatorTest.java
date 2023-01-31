package lekcja10.zadanie2pesel;

import lekcja10.zadanie2.PeselValidatorGorszy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PeselValidatorTest {

    @Test
    void isPeselCorrect() {
        String pesel = "44051401458";
        boolean isPesel = PeselValidatorGorszy.isPesel(pesel);
        Assertions.assertTrue(isPesel);
    }

    @Test
    void isPeselIncorrectLength() {
        String pesel = "05140145";
        boolean isPesel = PeselValidatorGorszy.isPesel(pesel);
        Assertions.assertFalse(isPesel);
    }

    @Test
    void isPeselIncorrectChar() {
        String pesel = "4b05140145A";
        boolean isPesel = PeselValidatorGorszy.isPesel(pesel);
        Assertions.assertFalse(isPesel);
    }
}