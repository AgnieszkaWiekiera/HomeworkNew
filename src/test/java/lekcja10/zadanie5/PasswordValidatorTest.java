package lekcja10.zadanie5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void shouldPasswordBeCorrect() {
        String password = "Historia44";
        boolean isValid = PasswordValidator.isValid(password);
        Assertions.assertTrue(isValid);
    }

    @Test
    void shouldPasswordBeIncorrectWithoutNumber() {
        String password = "Historia";
        boolean isValid = PasswordValidator.isValid(password);
        Assertions.assertFalse(isValid);
    }

    @Test
    void shouldPasswordBeIncorrectWithoutBigFont() {
        String password = "historia44";
        boolean isValid = PasswordValidator.isValid(password);
        Assertions.assertFalse(isValid);
    }

    @Test
    void shouldPasswordBeIncorrectWithActualYear() {
        String password = "Historia23";
        boolean isValid = PasswordValidator.isValid(password);
        Assertions.assertFalse(isValid);
    }

    @Test
    void shouldPasswordBeIncorrectWithLessCharts() {
        String password = "Hist44";
        boolean isValid = PasswordValidator.isValid(password);
        Assertions.assertFalse(isValid);
    }
}