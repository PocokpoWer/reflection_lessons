import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void shouldReturnCalculatingWithExponentResult() {
        Assertions.assertEquals(4768, Main.calculatingWithExponent(8));
    }

    @Test
    void shouldReturnCalculatingWithExponent2Result() {
        Assertions.assertEquals(-876, Main.calculatingWithExponent2(6));
    }
}
