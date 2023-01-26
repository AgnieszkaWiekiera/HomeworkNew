package lekcja7.zadanie1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10, 12, 14})
    void shouldVerifyNumberIsEven(int number) {
        Assertions.assertTrue(NumberChecker.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})
    void shouldVerifyNumberIsNotEven(int number) {
        Assertions.assertFalse(NumberChecker.isEven(number));
    }

    @ParameterizedTest
    @CsvSource(value = {"341 , 8", "111 , 3", "121 , 4", "444 , 12"})
    void shouldCalculateSumOfDigitsOfGivenNumber(int number, int expected) {
        int actualInt = NumberChecker.sumOfDigitsOfGivenNumber(number);
        Assertions.assertEquals(expected, actualInt);
    }
}