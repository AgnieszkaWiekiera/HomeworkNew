package lekcja4.zadanie2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SguareTest {

    @Test
    void shouldCalculateArea() {
        //given
        Sguare square = new Sguare(2, 2);
        //when
        double actualArea = square.getArea();
        //then
        Assertions.assertEquals(4, actualArea);
    }

    @Test
    void getPerimeter() {
        //given
        Sguare sguare = new Sguare(3,3);
        //when
        double actualPerimeter = sguare.getPerimeter();
        //then
        Assertions.assertEquals(12, actualPerimeter);
    }
}