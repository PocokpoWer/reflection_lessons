import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FifthTaskTest {
    @Test
    void shouldIsPrimeNumberTrue() {
        assertTrue(FifthTask.isPrimeNumber(7));
    }

    @Test
    void shouldIsPrimeNumberFalse() {
        assertFalse(FifthTask.isPrimeNumber(1));
    }

    @Test
    void shouldIsPrimeNumberFalseTwo() {
        assertFalse(FifthTask.isPrimeNumber(12));
    }

    @Test
    void shouldGetDivisorNumber() {
        List<Integer> expected = List.of(1, 2, 4, 8);
        assertEquals(expected, FifthTask.getDivisorNumber(8));
    }
}
