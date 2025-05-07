import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    @Test
    void shouldCalcRecamanSequence() {
        List<Integer> sequence = new ArrayList<>();
        int number = Main.calcRecamanSequence(6, sequence);
        List<Integer> expected = List.of(0, 1, 3, 6, 2, 7, 13);
        assertEquals(expected, sequence);
    }

    @Test
    void shouldIsNumberTrue() {
        int[] expected = {0, 1, 3, 6, 2};
        assertTrue(Main.isNumber(expected, 1));
    }

    @Test
    void shouldIsNumberFalse() {
        int[] expected = {0, 1, 3, 6, 2};
        assertFalse(Main.isNumber(expected, 4));
    }

    @Test
    void shouldCalcRecamanSequenceWithForLoop() {
        int[] expected = {0, 1, 3, 6, 2, 7, 13, 20, 12, 21, 11, 22, 10, 23, 9, 24, 8, 25, 43, 62};
        assertArrayEquals(expected, Main.calcRecamanSequenceWithForLoop(20));
    }

}
