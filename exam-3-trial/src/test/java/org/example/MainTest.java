package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void removeDuplications() {
        List<Integer> list = List.of(23, 76, 12, 98, -1, 45, -12, 23, -1);
        List<Integer> expected = List.of(23, 76, 12, 98, -1, 45, -12);
        assertEquals(expected, Main.removeDuplications(list));
    }

    @Test
    void returnRemoveElement() throws NoMajorityElementException {
        String testOfTest = "aaabb";
        char expected = 'a';
        assertEquals(expected, Main.removeElement(testOfTest));
    }

    @Test
    void returnRemoveElement2() throws NoMajorityElementException {
        String testOfTest = "bbbbb";
        char expected = 'b';
        assertEquals(expected, Main.removeElement(testOfTest));
    }

    @Test
    void returnRemoveElement2Exception() throws NoMajorityElementException {
        String testOfTest = "aabbcc";
        NoMajorityElementException ex =
                assertThrows(NoMajorityElementException.class, () -> Main.removeElement(testOfTest));
        assertEquals("No element", ex.getMessage());
    }
}