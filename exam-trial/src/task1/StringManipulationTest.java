package task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringManipulationTest {
    @Test
    public void shouldGetString() {
        String sentence = "the assailant is also reported to have had an e-bike";
        String expected = "the Assailant is Also Reported to Have had an E-bike";
        assertEquals(expected, StringManipulation.getString(sentence));
    }
}
