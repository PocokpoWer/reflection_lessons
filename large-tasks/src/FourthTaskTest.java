import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FourthTaskTest {
    @Test
    void shouldIsValidTrue() {
        assertTrue(FourthTask.isValid(123));
    }

    @Test
    void shouldIsValidFalse() {
        assertFalse(FourthTask.isValid(1));
    }
}
