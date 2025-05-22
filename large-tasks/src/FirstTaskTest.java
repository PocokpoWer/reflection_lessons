import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FirstTaskTest {
    @Test
    void shouldIsValidTrue() {
        assertTrue(FirstTask.isValid("hello"));
    }

    @Test
    void shouldIsValidFalse() {
        assertFalse(FirstTask.isValid("no"));
    }

    @Test
    void shouldIsPalindromeTrue() {
        assertTrue(FirstTask.isPalindrome("madam"));
    }

    @Test
    void shouldIsPalindromeFalse() {
        assertFalse(FirstTask.isPalindrome("Hello"));
    }
}
