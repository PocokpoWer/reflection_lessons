package second;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SecondTaskTest {

    @Test
    void shouldMergeTwoDifferentLongLists() {
        List<Integer> list1 = new ArrayList<>(List.of(1, 3, 5, 7, 9));
        List<Integer> list2 = new ArrayList<>(List.of(2, 4, 6, 8, 10, 12, 14, 16));
        List<Integer> expected = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16));
        assertEquals(expected, SecondTask.mergeTwoLists(list1, list2));
    }

    @Test
    void shouldGetEmptyList() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, SecondTask.mergeTwoLists(list1, list2));
    }

    @Test
    void shouldGetMergeListWithNegativeNumbers() {
        List<Integer> list1 = new ArrayList<>(List.of(-1, -3, -5, -7, -9));
        List<Integer> list2 = new ArrayList<>(List.of(-2, -4, -6, -8, -10, -12, -14, -16));
        List<Integer> expected = new ArrayList<>(List.of(-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -12, -14, -16));
        assertEquals(expected, SecondTask.mergeTwoLists(list1, list2));
    }

    @Test
    void shouldGetMergeListWithDuplicates() {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 4, 5, 7, 9));
        List<Integer> list2 = new ArrayList<>(List.of(2, 3, 4, 6, 8, 10));
        List<Integer> expected = new ArrayList<>(List.of(1, 2, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10));
        assertEquals(expected, SecondTask.mergeTwoLists(list1, list2));
    }
}