import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

public class SecondTaskTest {
    @Test
    void shouldIsValidTrue() {
        assertTrue(SecondTask.isValid(20));
    }

    @Test
    void shouldIsValidFalse() {
        assertFalse(SecondTask.isValid(3));
    }

    @Test
    void shouldGetDivisor() {
        List<Integer> expected = List.of(1, 2, 4, 8, 16);
        assertEquals(expected, SecondTask.getDivisor(16));
    }

    @Test
    void shouldGetFibonacciSequence() {
        int[] expected = {7, 9, 16, 25, 41, 66, 107, 173, 280, 453, 733, 1186};
        assertArrayEquals(expected, SecondTask.getFibonacciSequence(7, 9));
    }
}
