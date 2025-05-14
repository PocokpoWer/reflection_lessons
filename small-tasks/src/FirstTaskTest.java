import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FirstTaskTest {
    @Test
    void shouldIsPrimeTrue() {
        assertTrue(FirstTask.isPrimNumber(13));
    }

    @Test
    void shouldIsPrimeFalse() {
        assertFalse(FirstTask.isPrimNumber(1));
    }

    @Test
    void shouldIsPrimeFalseTwo() {
        assertFalse(FirstTask.isPrimNumber(8));
    }
}
