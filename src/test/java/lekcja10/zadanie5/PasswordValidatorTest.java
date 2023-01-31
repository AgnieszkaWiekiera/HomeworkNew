package lekcja10.zadanie5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void isPasswordCorrect() {
        String password = "Historia44";
        boolean isValid = PasswordValidator.isValid(password);
        Assertions.assertTrue(isValid);
    }

    @Test
    void isPasswordIncorrectWithoutNumber() {
        String password = "Historia";
        boolean isValid = PasswordValidator.isValid(password);
        Assertions.assertFalse(isValid);
    }

    @Test
    void isPasswordIncorrectWithoutBigFont() {
        String password = "historia44";
        boolean isValid = PasswordValidator.isValid(password);
        Assertions.assertFalse(isValid);
    }

    @Test
    void isPasswordIncorrectWithActualYear() {
        String password = "Historia23";
        boolean isValid = PasswordValidator.isValid(password);
        Assertions.assertFalse(isValid);
    }

}