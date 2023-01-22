package lekcja2.zadanie5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddAndEvenNumbersTest {

    @Test
    void shouldGetOdd() {
        //given
        int number = 41;
        //when
        String getEvenOrOdd = OddAndEvenNumbers.getEvenOrOdd(41);
        //then
        Assertions.assertEquals("nieparzysta", getEvenOrOdd);
    }

    @Test
    void shouldGetEven() {
        //given
        int number = 506;
        //when
        String getEvenOrOdd = OddAndEvenNumbers.getEvenOrOdd(506);
        //then
        Assertions.assertEquals("parzysta", getEvenOrOdd);
    }
}