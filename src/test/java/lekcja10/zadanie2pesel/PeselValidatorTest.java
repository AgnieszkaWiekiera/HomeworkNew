package lekcja10.zadanie2pesel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PeselValidatorTest {

    @Test
    void isPeselCorrect() {
        String pesel = "44051401458";
        boolean isPesel = PeselValidator.isPesel(pesel);
        Assertions.assertTrue(isPesel);
    }

    @Test
    void isPeselIncorrectLength() {
        String pesel = "05140145";
        boolean isPesel = PeselValidator.isPesel(pesel);
        Assertions.assertFalse(isPesel);
    }

    @Test
    void isPeselIncorrectChar() {
        String pesel = "4b05140145A";
        boolean isPesel = PeselValidator.isPesel(pesel);
        Assertions.assertFalse(isPesel);
    }
}