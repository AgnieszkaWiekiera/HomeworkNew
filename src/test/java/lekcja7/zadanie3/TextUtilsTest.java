package lekcja7.zadanie3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static lekcja7.zadanie3.TextUtils.getStringLength;

class TextUtilsTest {

    @ParameterizedTest
    @MethodSource("stringProvider")
    public void testStringLength(String input, int expected) {
        int textLength = getStringLength(input);
        Assertions.assertEquals(expected, textLength);
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
        Assertions.assertThrows(IllegalArgumentException.class, () -> getStringLength(""));
    }
    @Test
    void shouldThrowExceptionForNullInput() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> getStringLength(null));
    }
}