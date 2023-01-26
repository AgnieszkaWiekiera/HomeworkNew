import lekcja7.zadanie2.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static lekcja7.zadanie2.StringUtils.toUpperCase;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"monika", "piotr", "anna", "zuzanna"})
    void shouldConvertToUpperCase(String input) {
        String expected = input.toUpperCase();
        String actual = toUpperCase(input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldThrowExceptionForNullInput() {
        assertThrows(IllegalArgumentException.class, () -> toUpperCase(null));
    }

    @Test
    void shouldThrowExceptionForEmptyInput() {
        assertThrows(IllegalArgumentException.class, () -> toUpperCase(""));
    }
}