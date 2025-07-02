import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LessNaivePrimeCalculateTest {
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
        int limit = 18;
        assertEquals(expected, naivePrimeCalculate.listPrimes(limit));
    }
}
