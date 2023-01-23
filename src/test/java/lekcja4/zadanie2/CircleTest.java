package lekcja4.zadanie2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CircleTest {

    @Test
    void shouldCalculateArea() {
        //given
        Circle circle = new Circle(5);
        //when
        double actualArea = circle.getArea();
        //then
        Assertions.assertEquals(78.5, actualArea);
    }

    @Test
    void shouldCalculatePerimeter() {
        //given
        Circle circle = new Circle(7);
        //when
        double actualPerimeter = circle.getPerimeter();
        //then
        Assertions.assertEquals(43.96, actualPerimeter);
    }
}