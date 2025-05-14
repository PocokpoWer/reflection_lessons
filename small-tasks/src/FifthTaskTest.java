import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FifthTaskTest {
    @Test
    void shouldIsPrimeNumberTrue() {
        assertTrue(FifthTask.isPrimNumber(7));
    }

    @Test
    void shouldIsPrimeNumberFalse() {
        assertFalse(FifthTask.isPrimNumber(1));
    }

    @Test
    void shouldIsPrimeNumberFalseTwo() {
        assertFalse(FifthTask.isPrimNumber(12));
    }

    @Test
    void shouldGetDivisorNumber() {
        List<Integer> expected = List.of(1, 2, 4, 8);
        assertEquals(expected, FifthTask.getDivisorNumber(8));
    }
}
