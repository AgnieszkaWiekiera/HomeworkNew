package lekcja2.zadanie6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class daysOfTheWeekTest {

    @Test
    void shouldReturnMonday() {
        //given
        int day = 1;
        //when
        String dayNumber = daysOfTheWeek.printDayOfWeek(1);
        //then
        Assertions.assertEquals("Monday", dayNumber);
    }

    @Test
    void shouldReturnTuesday() {
        //given
        int day = 2;
        //when
        String dayNumber = daysOfTheWeek.printDayOfWeek(2);
        //then
        Assertions.assertEquals("Tuesday", dayNumber);
    }

    @Test
    void shouldReturnWednesday() {
        //given
        int day = 3;
        //when
        String dayNumber = daysOfTheWeek.printDayOfWeek(3);
        //then
        Assertions.assertEquals("Wednesday", dayNumber);
    }

    @Test
    void shouldReturnThursday() {
        //given
        int day = 4;
        //when
        String dayNumber = daysOfTheWeek.printDayOfWeek(4);
        //then
        Assertions.assertEquals("Thursday", dayNumber);
    }

    @Test
    void shouldReturnFriday() {
        //given
        int day = 5;
        //when
        String dayNumber = daysOfTheWeek.printDayOfWeek(5);
        //then
        Assertions.assertEquals("Friday", dayNumber);
    }

    @Test
    void shouldReturnWeekendBySaturday() {
        //given
        int day = 6;
        //when
        String dayNumber = daysOfTheWeek.printDayOfWeek(6);
        //then
        Assertions.assertEquals("Weekend", dayNumber);
    }

    @Test
    void shouldReturnWeekendBySunday() {
        //given
        int day = 7;
        //when
        String dayNumber = daysOfTheWeek.printDayOfWeek(7);
        //then
        Assertions.assertEquals("Weekend", dayNumber);
    }

    @Test
    void shouldReturnThereIsNoSuchADay() {
        //given
        int day = 11;
        //when
        String dayNumber = daysOfTheWeek.printDayOfWeek(11);
        //then
        Assertions.assertEquals("There is no such a day!", dayNumber);
    }
}