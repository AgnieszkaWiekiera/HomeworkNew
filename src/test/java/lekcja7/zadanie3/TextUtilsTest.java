package lekcja7.zadanie3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static lekcja7.zadanie3.TextUtils.getStringLength;
import static org.junit.jupiter.api.Assertions.*;

class TextUtilsTest {

    @ParameterizedTest
    @MethodSource("stringProvider")
    public void testStringLength(String input, int expected) {
        int result = getStringLength(input);
        assertEquals(expected, result);
    }
    private static Stream<Arguments> stringProvider() {
        return Stream.of(
                Arguments.of("hello", 5),
                Arguments.of("world", 5),
                Arguments.of("java", 4)
        );
    }
    @Test
    void shouldThrowExceptionForEmptyInput() {
        assertThrows(IllegalArgumentException.class, () -> getStringLength(""));
    }
    @Test
    void shouldThrowExceptionForNullInput() {
        assertThrows(IllegalArgumentException.class, () -> getStringLength(null));
    }
}