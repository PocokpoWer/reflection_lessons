import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MainTest {
    @ParameterizedTest
    @ValueSource(ints = {111, 212, 145, 405})
    void shouldReturnCountingDigits(int number) {
        assertEquals(3, Main.countingDigits(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void shouldReturnCountingDigits2(int number) {
        assertEquals(1, Main.countingDigits(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1123123, 2758473, 3483925, 4351742})
    void shouldReturnCountingDigits3(int number) {
        assertEquals(7, Main.countingDigits(number));
    }

    @Test
    void shouldReturnSeparateNumbers() {
        assertArrayEquals(new int[]{5, 4, 1}, Main.separateNumbers(145));
    }

    @Test
    void shouldReturnSeparateNumbers2() {
        assertArrayEquals(new int[]{5, 8, 5, 0, 4}, Main.separateNumbers(40585));
    }

    @Test
    void shouldReturnMultiAndSumNumbers() {
        assertEquals(1, Main.multiAndSumNumbers(Main.separateNumbers(1)));
    }

    @Test
    void shouldReturnMultiAndSumNumbers2() {
        assertEquals(145, Main.multiAndSumNumbers(Main.separateNumbers(145)));
    }

    @Test
    void shouldReturnMultiAndSumNumbers3() {
        assertEquals(745, Main.multiAndSumNumbers(Main.separateNumbers(146)));
    }

    @Test
    void shouldReturMultiAndSumNumbers4() {
        assertEquals(40585, Main.multiAndSumNumbers(Main.separateNumbers(40585)));
    }

}
