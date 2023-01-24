package lekcja4.zadanie2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangularTest {

    @Test
    void shouldCalculateArea() {
        //given
        Rectangular rectangular = new Rectangular(2, 3);
        //when
        double actualArea = rectangular.getArea();
        //then
        Assertions.assertEquals(6, actualArea);
    }

    @Test
    void getPerimeter() {
        //given
        Rectangular rectangular = new Rectangular(3, 4);
        //when
        double actualPerimeter = rectangular.getPerimeter();
        //then
        Assertions.assertEquals(14, actualPerimeter);
    }
}