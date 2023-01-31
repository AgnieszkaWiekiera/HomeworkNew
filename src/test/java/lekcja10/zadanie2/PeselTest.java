package lekcja10.zadanie2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PeselTest {

    @Test
    void isPeselCorrect() {
        String pesel = "44051401458";
        boolean isPesel = Pesel.isPesel(pesel);
        Assertions.assertTrue(isPesel);
    }

    @Test
    void isPeselIncorrectLength() {
        String pesel = "05140145";
        boolean isPesel = Pesel.isPesel(pesel);
        Assertions.assertFalse(isPesel);
    }

    @Test
    void isPeselIncorrectChar() {
        String pesel = "4b05140145A";
        boolean isPesel = Pesel.isPesel(pesel);
        Assertions.assertFalse(isPesel);
    }
}