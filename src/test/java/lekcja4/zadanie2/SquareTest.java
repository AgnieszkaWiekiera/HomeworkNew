package lekcja4.zadanie2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void shouldCalculateArea() {
        //given
        Square square = new Square(2);
        //when
        double actualArea = square.getArea();
        //then
        Assertions.assertEquals(4, actualArea);
    }

    @Test
    void shouldCalculatePerimeter() {
        //given
        Square square = new Square(3);
        //when
        double actualPerimeter = square.getPerimeter();
        //then
        Assertions.assertEquals(12, actualPerimeter);
    }
}