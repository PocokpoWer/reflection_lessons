package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @Test
    void shouldIsValidTrue() {
        EmailValidator emailValidator = new EmailValidator();
        String testString = "farkas.tibor1105@gmail.com";
        assertTrue(emailValidator.isValid(testString));
    }

    @Test
    void shouldIsValidFalse() {
        EmailValidator emailValidator = new EmailValidator();
        String testString = "farkas_tibor1105Đgmail.com";
        assertFalse(emailValidator.isValid(testString));
    }
}