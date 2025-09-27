package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanitizerTest {

    @Test
    void sanitize() {
        String test = "a<script>greatMaterial</script>";
        String expected = "agreatMaterial";
        assertEquals(expected, Sanitizer.sanitize(test));
    }
}