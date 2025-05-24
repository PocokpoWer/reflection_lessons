import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FifthTaskTest {
    @Test
    void shouldIsPrimeNumberTrue() {
        assertTrue(FifthTask.isPrimeNumber(7));
    }

    @Test
    void shouldIsPrimeNumberFalse() {
        assertFalse(FifthTask.isPrimeNumber(49));
    }

    @Test
    void shouldIsPrimeNumberFalseTwo() {
        assertFalse(FifthTask.isPrimeNumber(12));
    }

    @Test
    void shouldFindNextPrimeUp() {
        assertEquals(7, FifthTask.findNextPrimeUp(5));
    }

    @Test
    void shouldFindNextPrimeDown() {
        assertEquals(13, FifthTask.findNextPrimeDown(14));
    }
}
