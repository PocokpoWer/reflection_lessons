import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeCalculateTest {
    @Test
    public void shouldListPrimes() {
        NaivePrimeCalculate naivePrimeCalculate = new NaivePrimeCalculate();
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(11);
        expected.add(13);
        expected.add(17);
        expected.add(19);
        expected.add(23);
        expected.add(29);
        expected.add(31);
        int limit = 35;
        assertEquals(expected, naivePrimeCalculate.listPrimes(limit));
    }
}
