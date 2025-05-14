import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FourthTaskTest {
    @Test
    void shouldGetFactorials() {
        assertEquals(720, FourthTask.getFactorials(6));
    }

    @Test
    void shouldGetFactorialsTwo() {
        assertEquals(1, FourthTask.getFactorials(1));
    }

    @Test
    void shouldCountDivisor() {
        assertEquals(4, FourthTask.countDivisor(8));
    }

    @Test
    void shouldGetLastNumberTrue() {
        assertTrue(FourthTask.getLastNumber(1415));
    }
    @Test
    void shouldGetLastNumberFalse() {
        assertFalse(FourthTask.getLastNumber(1410));
    }
}
