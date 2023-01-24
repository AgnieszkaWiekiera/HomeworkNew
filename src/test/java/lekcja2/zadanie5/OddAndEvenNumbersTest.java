package lekcja2.zadanie5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddAndEvenNumbersTest {

    @Test
    void shouldGetTrueEven() {
        //given
        int number = 8;
        //when
        boolean isEven = OddAndEvenNumbers.isEven(8);
        //then
        Assertions.assertTrue(isEven);
    }

    @Test
    void shouldGetFalseEven() {
        //given
        int number = 77;
        //when
        boolean isEven = OddAndEvenNumbers.isEven(77);
        //then
        Assertions.assertFalse(isEven);
    }

    @Test
    void shouldGetTrueOdd() {
        //given
        int number = 43;
        //when
        boolean isOdd = OddAndEvenNumbers.isOdd(43);
        //then
        Assertions.assertTrue(isOdd);
    }

    @Test
    void shouldGetFalseOdd() {
        //given
        int number = 12;
        //when
        boolean isOdd = OddAndEvenNumbers.isOdd(12);
        //then
        Assertions.assertFalse(isOdd);
    }
}