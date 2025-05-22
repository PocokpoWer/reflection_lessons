import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ThirdTaskTest {
    @Test
    void shouldIsValidTrue() {
        assertTrue(ThirdTask.isValid(5));
    }

    @Test
    void shouldIsValidFalse() {
        assertFalse(ThirdTask.isValid(0));
    }

    @Test
    void shouldGetDivisors() {
        List<Integer> expected = List.of(16, 8, 4, 2, 1);
        assertEquals(expected, ThirdTask.getDivisors(16));
    }

    @Test
    void shouldIsPrimeTrue() {
        assertTrue(ThirdTask.isPrime(7));
    }

    @Test
    void shouldIsPrimeFalse() {
        assertFalse(ThirdTask.isPrime(10));
    }

    @Test
    void shouldGetCubeNumber() {
        List<Integer> expected = List.of(1, 8, 27, 64, 125, 216, 343, 512, 729, 1000);
        assertEquals(expected, ThirdTask.getCubeNumber(10));
    }

    @Test
    void shouldIsCubeNumberTrue() {
        List<Integer> array = List.of(1, 8, 27, 64, 125, 216, 343, 512, 729, 1000);
        assertTrue(ThirdTask.isCubeNumber(125, array));
    }

    @Test
    void shouldIsCubeNumberFalse() {
        List<Integer> array = List.of(1, 8, 27, 64, 125, 216, 343, 512, 729, 1000);
        assertFalse(ThirdTask.isCubeNumber(888, array));
    }
}
