package lekcja4.zadanie3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldGetArea() {
        //given
        Triangle triangle = new Triangle(3,4, 5, 3);
        //when
        double actualArea = triangle.getArea();
        //then
        Assertions.assertEquals(6, actualArea);
    }

    @Test
    void shouldGetPerimeter() {
        //given
        Triangle triangle = new Triangle(3,4, 5, 3);
        //when
        double actualPerimeter = triangle.getPerimeter();
        //then
        Assertions.assertEquals(12, actualPerimeter);
    }
}