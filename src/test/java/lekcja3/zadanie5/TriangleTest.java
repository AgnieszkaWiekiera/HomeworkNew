package lekcja3.zadanie5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TriangleTest {

    @Test
    void shouldBeTrueForRectangularTriangle() {
        //given
        int sideA = 3;
        int sideB = 4;
        int hyponotenuse = 5;

        //when
        boolean isRectangular = Triangle.isRectangular(3, 4, 5);

        //then
        assertTrue(isRectangular);
    }

    @Test
    void shouldBeFalseForNotRectangular() {
        //given
        int sideA = 13;
        int sideB = 2;
        int hypotenuse = 4;

        //when
        boolean isRectangular = Triangle.isRectangular(13, 2, 4);

        //then
        assertFalse(isRectangular);
    }
}