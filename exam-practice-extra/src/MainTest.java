import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainTest {
    // Task 2:
    @Test
    void shouldIsNumberOfTwoTaskTrue() {
        assertTrue(LargeTasks.isNumberOfTwoTask(51));
    }

    @Test
    void shouldIsNumberOfTwoTaskTrueTwo() {
        assertTrue(LargeTasks.isNumberOfTwoTask(9_999));
    }

    @Test
    void shouldIsNumberOfTwoTaskFalse() {
        assertFalse(LargeTasks.isNumberOfTwoTask(50));
    }

    @Test
    void shouldIsNumberOfTwoTaskFalseTwo() {
        assertFalse(LargeTasks.isNumberOfTwoTask(10));
    }

    @Test
    void shouldIsNumberOfTwoTaskFalseThree() {
        assertFalse(LargeTasks.isNumberOfTwoTask(10_000));
    }

    @Test
    void shouldCountPerfectSquaresElements() {
        assertEquals(9, LargeTasks.countPerfectSquaresElements(82));
    }

    @Test
    void shouldCountPerfectSquaresElementsTwo() {
        assertEquals(0, LargeTasks.countPerfectSquaresElements(0));
    }

    @Test
    void shouldGeneratePerfectSquares() {
        int[] expected = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121};
        assertArrayEquals(expected, LargeTasks.generatePerfectSquares(144));
    }

    @Test
    void shouldSumPerfectSquares() {
        int[] array = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121};
        assertEquals(125, LargeTasks.sumPerfectSquares(array));
    }

    // Task 3:
    @Test
    void shouldGenerateTribonacciNumbers() {
        int[] expected = {1, 1, 1, 3, 5, 9, 17, 31, 57, 105};
        int[] array = {1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, LargeTasks.generateTribonacciNumbers(array));
    }
}
