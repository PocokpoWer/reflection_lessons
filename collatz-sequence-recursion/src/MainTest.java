import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void shouldExponentiation(){
        assertEquals(16,Main.exponentiation(4,2));
    }
}
