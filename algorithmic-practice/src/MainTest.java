import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainTest {
    // Task 1:
    @Test
    void shouldFindGreatestCommonDivisor() {
        assertEquals(30, Main.findGreatestCommonDivisor(120, 150));
    }

    // Task 2:
    @Test
    void shouldCountDigits() {
        assertEquals(4, Main.countDigits(3214));
    }

    @Test
    void shouldSeparateNumbers() {
        int expected = 3623;
        assertEquals(expected, Main.separateNumbers(3263));
    }

    // Task 3:
    @Test
    void shouldChangeNumberReversed() {
        String expected = "a2b1c5a3";
        assertEquals(expected, Main.changeNumberReversed("aabcccccaaa"));
    }

    // Task 4:
    @Test
    void shouldIsPalindromeTrue() {
        assertTrue(Main.isPalindrome("racecar"));
    }

    @Test
    void shouldIsPalindromeFalse() {
        assertFalse(Main.isPalindrome("hello"));
    }
}
