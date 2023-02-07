package lekcja2.zadanie4poprawione;

import lekcja2.zadanie4.AgeConfirmStare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeConfirmTest {

    @Test
    void gshouldBeAdult() {
        //given
        int userAge = 20;
        //when
        String getAgeDescription = AgeConfirmStare.getAgeDescription(20);
        //then
        Assertions.assertEquals("Pełnoletni", getAgeDescription);
    }

    @Test
    void shouldNotBeAdult() {
        //given
        int userAge = 8;
        //when
        String getAgeDescription = AgeConfirmStare.getAgeDescription(8);
        //then
        Assertions.assertEquals("Niepełnoletni", getAgeDescription);
    }

    @Test
    void shouldGetError() {
        //given
        int userAge = -8;
        //when
        String getAgeDescription = AgeConfirmStare.getAgeDescription(-8);
        //then
        Assertions.assertEquals("Błąd", getAgeDescription);
    }
}