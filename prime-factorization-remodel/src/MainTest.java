import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void shouldReturnPrintProductOfPrimes() {
        List<Integer> expected = Arrays.asList(2, 2, 5, 5);
        assertEquals((expected), Main.printProductOfPrimes(100));
    }

    @Test
    void shouldReturnPrintProductOfPrimes2() {
        List<Integer> expected = Arrays.asList(2, 3, 3);
        assertEquals((expected), Main.printProductOfPrimes(18));
    }

    @Test
    void shouldReturnPrintProductOfPrimes3() {
        List<Integer> expected = Arrays.asList(19);
        assertEquals((expected), Main.printProductOfPrimes(19));
    }
}
