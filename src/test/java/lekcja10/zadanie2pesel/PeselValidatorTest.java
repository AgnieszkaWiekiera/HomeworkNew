package lekcja10.zadanie2pesel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PeselValidatorTest {

    @Test
    void shoulPeselBeCorrect() {
        //given
        String pesel = "44051401458";
        //when
        boolean isPesel = PeselValidator.isValid(pesel);
        //then
        Assertions.assertTrue(isPesel);
    }

    @Test
    void shouldPeselBeIncorrectLength() {
        //given
        String pesel = "05140145";
        //when
        boolean isPesel = PeselValidator.isValid(pesel);
        //then
        Assertions.assertFalse(isPesel);
    }

    @Test
    void shouldPeselBeIncorrectChar() {
        //given
        String pesel = "4b05140145A";
        //when
        boolean isPesel = PeselValidator.isValid(pesel);
        //then
        Assertions.assertFalse(isPesel);
    }
}