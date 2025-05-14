import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ThirdTaskTest {
    @Test
    void shouldGetMode() {
        int[] arrayOfTaskThree = {2, 5, 4, 4, 8, 4, 6, 4};
        assertEquals(4, ThirdTask.getMode(arrayOfTaskThree));
    }

    @Test
    void shouldGetModeZero() {
        int[] arrayOfTaskThree = {1, 2, 3, 4, 5, 6};
        assertEquals(1, ThirdTask.getMode(arrayOfTaskThree));
    }

    @Test
    void shouldGetMedian() {
        int[] arrayOfTaskThree = {4, 2, 1, 9};
        assertEquals(3, ThirdTask.getMedian(arrayOfTaskThree));
    }

    @Test
    void shouldGetMedianTwo() {
        int[] arrayOfTaskThree = {4, 1, 8};
        assertEquals(4, ThirdTask.getMedian(arrayOfTaskThree));
    }
}
