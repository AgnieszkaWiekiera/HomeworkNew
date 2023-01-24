package lekcja4.zadanie3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RectangleTest {

    @Test
    void shouldGetArea() {
        //given
        Rectangle rectangle = new Rectangle(2, 3);
        //when
        double actualArea = rectangle.getArea();
        //then
        Assertions.assertEquals(6, actualArea);
    }

    @Test
    void shouldGetPerimeter() {
        //given
        Rectangle rectangle = new Rectangle(3, 4);
        //when
        double actualPerimeter = rectangle.getPerimeter();
        //then
        Assertions.assertEquals(14, actualPerimeter);
    }
}