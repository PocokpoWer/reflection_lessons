package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentValidatorTest {

    @Test
    void shouldIsValidTrue() {
        CommentValidator commentValidator = new CommentValidator();
        String testString = "Test SeNTeNcE?!.-_$";
        assertTrue(commentValidator.isValid(testString));
    }

    @Test
    void shouldIsValidFalse() {
        CommentValidator commentValidator = new CommentValidator();
        String testString = "Test SeNTeNcE?!.-_$ß÷#ä";
        assertFalse(commentValidator.isValid(testString));
    }
}