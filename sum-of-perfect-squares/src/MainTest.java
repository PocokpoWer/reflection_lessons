import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void shouldReturnSumNumbers() {
        Assertions.assertEquals(1, Main.sumWithSquareNumbers(1));
    }

    @Test
    void shouldReturnSumNumbers2() {
        Assertions.assertEquals(55, Main.sumWithSquareNumbers(5));
    }

    @Test
    void shouldReturnSumNumbers3() {
        Assertions.assertEquals(140, Main.sumWithSquareNumbers(7));
    }
}
