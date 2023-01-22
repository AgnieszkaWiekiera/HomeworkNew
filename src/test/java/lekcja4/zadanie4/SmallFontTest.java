package lekcja4.zadanie4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallFontTest {

    @Test
    void shouldGetSmallFont() {
        //given
        String text = "ToMaSZ";
        SmallFont smallFont = new SmallFont();
        //when
        String formatText = smallFont.formatText("ToMaSZ");
        //then
        Assertions.assertEquals("tomasz", formatText);
    }
}