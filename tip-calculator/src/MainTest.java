import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void shouldReturnTip() {
        int[] array = new int[]{2000, 250, 300, 50, 250};
        Assertions.assertEquals(0, Main.calculateTip(array, 0));
    }
}
