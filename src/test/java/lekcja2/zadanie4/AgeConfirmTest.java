package lekcja2.zadanie4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeConfirmTest {

    @Test
    void shouldBeAdult() {
        //given
        int userAge = 20;
        //when
        String printPermission = AgeConfirm.printPermission(20);
        //then
        Assertions.assertEquals("Pełnoletni", printPermission);
    }

    @Test
    void shouldNotBeAdult() {
        //given
        int userAge = 8;
        //when
        String printPermission = AgeConfirm.printPermission(8);
        //then
        Assertions.assertEquals("Niepełnoletni", printPermission);
    }

    @Test
    void shouldGetMistake() {
        //given
        int userAge = -8;
        //when
        String printPermission = AgeConfirm.printPermission(-8);
        //then
        Assertions.assertEquals("Błąd", printPermission);
    }
}