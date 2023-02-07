package lekcja6.zadanie8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeselValidatorTest {

    @Test
    void shouldGetValidPesel() {
        //given
        String pesel = "66021304678";
        //when
        boolean validatePESEL = PeselValidator.validatePESEL("66021304678");
        //then
        Assertions.assertTrue(validatePESEL);
    }

    @Test
    void shoulGetNotValidPesel(){
        //given
        String pesel = "6602130467";
        //when
        boolean validatePESEL = PeselValidator.validatePESEL("6602130467");
        //then
        Assertions.assertFalse(validatePESEL);
    }

    @Test
    void shoulGetNotValidPeselWithLetter() {
        //given
        String pesel = "6602140456g";
        //when
        boolean validatePESEL = PeselValidator.validatePESEL("6602140456g");
        //then
        Assertions.assertFalse(validatePESEL);
    }
}