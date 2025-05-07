import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainTest {
    // Task 1:
    @Test
    void shouldIsNumberTrue() {
        assertTrue(LargeTasks.isValid(21));
    }

    @Test
    void shouldIsNumberTrueTwo() {
        assertTrue(LargeTasks.isValid(999_999));
    }

    @Test
    void shouldIsNumberTrueThree() {
        assertTrue(LargeTasks.isValid(500));
    }

    @Test
    void shouldIsNumberFalse() {
        assertFalse(LargeTasks.isValid(20));
    }

    @Test
    void shouldIsNumberFalseTwo() {
        assertFalse(LargeTasks.isValid(1_000_000));
    }

    @Test
    void shouldIsNumberFalseThree() {
        assertFalse(LargeTasks.isValid(1));
    }

    @Test
    void shouldCountArrayElements() {
        assertEquals(9, LargeTasks.countArrayElements(999_999));
    }

    @Test
    void shouldCountArrayElementsTwo() {
        assertEquals(6, LargeTasks.countArrayElements(721));
    }

    @Test
    void shouldGenerateFactorials() {
        int[] expected = {1, 2, 6, 24, 120, 720};
        assertArrayEquals(expected, LargeTasks.generateFactorials(721));
    }

    @Test
    void shouldSumFactorials() {
        int[] array = {1, 2, 6, 24, 120, 720};
        assertEquals(746, LargeTasks.sumFactorials(array, 721));
    }
}
