import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainTest {
    // Task 11:
    @Test
    void shouldIsPalindromeTrue() {
        assertTrue(Main.isPalindrome("Level"));
    }

    @Test
    void shouldIsPalindromeFalse() {
        assertFalse(Main.isPalindrome("hello"));
    }

    @Test
    void shouldCountPalindromeElements() {
        String[][][] arrayOfTask11 = {
                {
                        {"madam", "level"}, {"civic", "dog"}
                },
                {
                        {"rotator", "deified"}, {"jump", "banana"}
                },
                {
                        {"refer", "noon"}, {"radar", "mother"}
                }
        };
        assertEquals(8, Main.countPalindromeElements(arrayOfTask11));
    }

    // Task 12:
    @Test
    void shouldCountOneRowElement() {
        String[][][] arrayOfTask12 = {
                {
                        {"cherry", "car"},
                        {"dog", "elephant", "fish", "computer", "cat"}
                },
                {
                        {"grape", "house", "island"},
                        {}
                }
        };
        int[] expected = {2, 5, 3, 0};
        assertArrayEquals(expected, Main.countOneRowElement(arrayOfTask12));
    }

    // Task 13:
    @Test
    void shouldConcatenateAllString() {
        String[][][] arrayOfTask13 = {
                {
                        {"orange", "b", "number", "a"},
                        {"dog", "mouse", "fish", "computer", "cat"}
                },
                {
                        {"vegetarian", "f", "shop"},
                        {"t", "paragliding"}
                }
        };
        String actual = Main.concatenateAllString(arrayOfTask13);
        String expected = "orangenumberdogmousefishcomputercatvegetarianshopparagliding";
        assertEquals(expected, actual);
    }

    // Task 14:
    @Test
    void shouldSumMaximumStringLength() {
        String[][][] arrayOfTask14 = {
                {
                        {"hi", "sun", "galaxy"},
                        {"apple", "kiwi", "pineapple"}
                },
                {
                        {"zebra", "lion"},
                        {"elephant", "dolphin"}
                },
                {
                        {"ok", "x"},
                        {"yes", "no"}
                }
        };
        assertEquals(9, Main.sumMaximumStringLength(arrayOfTask14));
    }

    // Task 15:
    @Test
    void shouldIsTrueIFStringEndSTrue() {
        String[][][] arrayOfTask15 = {
                {
                        {"cats", "dog", "rabbit"},
                        {"birds", "plane", "bus"}
                },
                {
                        {"trees", "leaf", "branches"},
                        {"books", "pen", "notes"}
                },
                {
                        {"ball", "bat", "gloves"},
                        {"shoes", "socks", "shirt"}
                }
        };
        assertTrue(Main.isTrueIFStringEndS(arrayOfTask15));
    }

    @Test
    void shouldIsTrueIFStringEndSFalse() {
        String[][][] arrayOfTask15 = {
                {
                        {"cats", "dog", "rabbit"},
                        {"birds", "plane", "bus"}
                },
                {
                        {"pizza", "leaf", "children"},
                        {"books", "pen", "notes"}
                },
                {
                        {"ball", "bat", "gloves"},
                        {"shoes", "socks", "shirt"}
                }
        };
        assertFalse(Main.isTrueIFStringEndS(arrayOfTask15));
    }
}
