import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class NaivePrimeCalculateTest {
    @Test
    public void shouldListPrimes() {
        NaivePrimeCalculate naivePrimeCalculate = new NaivePrimeCalculate();
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        int limit = 10;
        assertEquals(expected, naivePrimeCalculate.listPrimes(limit));
    }
}
