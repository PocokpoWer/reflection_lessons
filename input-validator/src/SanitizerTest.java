import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SanitizerTest {
    @Test
    public void shouldSanitize(){
        String expected = "atest";
        assertEquals(expected,Sanitizer.sanitize("a<b>test</b>"));
    }
}
