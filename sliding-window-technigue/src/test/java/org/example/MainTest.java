package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void findMaxSumSubarray() {
        int[] arrayOfTask1 = {4, 2, 1, 7, 8, 1, 2, 8, 1};
        int k = 3;
        int expected = 16;
        assertEquals(expected, Main.findMaxSumSubarray(arrayOfTask1, k));
    }

    @Test
    void findSmallestSubarrayWithSum() {
        int[] arrayOfTask2 = {1, 4, 45, 6, 10, 19};
        int s = 51;
        int expected = 2;
        assertEquals(expected, Main.findSmallestSubarrayWithSum(arrayOfTask2, s));
    }

    @Test
    void findLongestUniqueSubstring() {
        int expected = 7;
        assertEquals(expected, Main.findLongestUniqueSubstring("geeksforgeeks"));
    }
}