package lekcja4.zadanie4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BigFontTest {

    @Test
    void shouldGetBigFont() {
        //given
        String text = "barbara";
        BigFont bigFont = new BigFont();
        //when
        String formatText = bigFont.formatText("barbara");
        //then
        Assertions.assertEquals("BARBARA", formatText);
    }
}