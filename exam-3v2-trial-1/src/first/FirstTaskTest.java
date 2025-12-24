package first;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FirstTaskTest {
    @Test
    void shouldGetNegativeList() {
        List<Integer> list = new ArrayList<>(List.of(-1, 2, -10, -15, -20, -6, -5, 9));
        List<Integer> expected = List.of(-1, 2, -6, -5, 9);
        assertEquals(expected, FirstTask.getListWithThreshold(list, -9));
    }

    @Test
    void shouldGetEmptyList() {
        List<Integer> list = new ArrayList<>();
        List<Integer> expected = List.of();
        assertEquals(expected, FirstTask.getListWithThreshold(list, 10));
    }

    @Test
    void shouldGetHigherThresholdList() {
        List<Integer> list = new ArrayList<>(List.of(12, 2, 10, 15, 20, 6, 5, 9));
        List<Integer> expected = List.of();
        assertEquals(expected, FirstTask.getListWithThreshold(list, 100));
    }

    @Test
    void shouldGetLowerThresholdList() {
        List<Integer> list = new ArrayList<>(List.of(12, 2, 10, 15, 20, 6, 5, 9));
        List<Integer> expected = List.of(12, 2, 10, 15, 20, 6, 5, 9);
        assertEquals(expected, FirstTask.getListWithThreshold(list, -100));
    }

    @Test
    void shouldGetListWithDuplicates() {
        List<Integer> list = new ArrayList<>(List.of(12, 2, 10, 15, 20, 6, 5, 9, 12));
        List<Integer> expected = List.of(12, 10, 15, 20, 12);
        assertEquals(expected, FirstTask.getListWithThreshold(list, 10));
    }
}