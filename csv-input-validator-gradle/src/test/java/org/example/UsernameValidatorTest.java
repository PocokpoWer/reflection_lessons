package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsernameValidatorTest {
    @Test
    void shouldIsValidTrue() {
        UsernameValidator usernameValidator = new UsernameValidator();
        String testString = "FarkasTibor";
        assertTrue(usernameValidator.isValid(testString));
    }

    @Test
    void shouldIsValidFalse() {
        UsernameValidator usernameValidator = new UsernameValidator();
        String testString = "Farkas123_Tibor";
        assertFalse(usernameValidator.isValid(testString));
    }

}