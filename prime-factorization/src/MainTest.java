import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 11, 19})
    void shouldReturnIsPrimeTrue(int number) {
        assertTrue(Main.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 6, 12, 18})
    void shouldReturnIsPrimeFalse(int number) {
        assertFalse(Main.isPrime(number));
    }

    @Test
    void shouldReturnPrimeAdd() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11);
        assertEquals((expected), Main.primeAdd(11));
    }
    @Test
    void shouldReturnPrimeAdd2() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 49, 53, 59, 61, 67, 71, 73, 79, 83);
        assertEquals((expected), Main.primeAdd(83));
    }

    @Test
    void shouldReturnPrintProductOfPrimes() {
        List<Integer> expected = Arrays.asList(2, 2, 5, 5);
        assertEquals((expected), Main.printProductOfPrimes(100));
    }
    @Test
    void shouldReturnPrintProductOfPrimes2() {
        List<Integer> expected = Arrays.asList(19);
        assertEquals((expected), Main.printProductOfPrimes(19));
    }
}
