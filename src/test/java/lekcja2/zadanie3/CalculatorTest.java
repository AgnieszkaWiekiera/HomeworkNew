package lekcja2.zadanie3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldAddTwoValues() {
        //given
        double value1 = 4;
        double value2 = 7;

        //when
        double calculate = Calculator.getSum(4,7);

        //then
        Assertions.assertEquals(11,calculate);
    }

    @Test
    void shouldSubtractTwoValues() {
        //given
        double value1 = 12;
        double value2 = 2;

        //when
        double calculate = Calculator.getSubtraction(12,2);

        //then
        Assertions.assertEquals(10,calculate);
    }

    @Test
    void shouldMultiplyTwoValues() {
        //given
        double value1 = 5;
        double value2 = 4;

        //when
        double calculate = Calculator.getMultiplication(5,4);

        //then
        Assertions.assertEquals(20,calculate);
    }

    @Test
    void shouldDivideTwoValues() {
        //given
        double value1 = 18;
        double value2 = 3;

        //when
        double calculate = Calculator.getDivision(18,3);

        //then
        Assertions.assertEquals(6,calculate);
    }
}