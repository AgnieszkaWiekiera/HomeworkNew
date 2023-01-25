package lekcja3.zadanie4;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MinutesToSecondsConverterTest {

    @org.junit.jupiter.api.Test
    void shouldconvertMinutesToSeconds() {
        //given
        int seconds = 3;

        //when
        int convertMinutesToSeconds = MinutesToSecondsConverter.convertMinutesToSeconds(3);

        //then
        Assertions.assertEquals(180, convertMinutesToSeconds);
    }
}