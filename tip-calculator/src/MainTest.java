import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    int[] array = new int[]{2000, 250, 300, 50, 250};

    @Test
    void shouldReturnTooHigh() {
        Assertions.assertEquals(-1, Main.toExaminePercent(81));
    }

    @Test
    void shouldReturnMinusOneTooLow() {
        Assertions.assertEquals(-1, Main.toExaminePercent(9));
    }

    @Test
    void shouldReturnPercent() {
        Assertions.assertEquals(25, Main.toExaminePercent(25));
    }

    @Test
    void shouldReturnZero() {
        Assertions.assertEquals(0, Main.toExaminePercent(0));
    }

    @Test
    void shouldReturnMinusOneBecauseTooHigh() {
        Assertions.assertEquals(-1, Main.calculateTip(array, Main.toExaminePercent(81)));
    }

    @Test
    void shouldReturnTipCalc() {
        Assertions.assertEquals(712, Main.calculateTip(array, Main.toExaminePercent(25)));
    }

    @Test
    void shouldReturnTipCalcMinusOneBecauseTooLow() {
        Assertions.assertEquals(-1, Main.calculateTip(array, Main.toExaminePercent(8)));
    }

    @Test
    void shouldReturnTipCalcZero() {
        Assertions.assertEquals(0, Main.calculateTip(array, Main.toExaminePercent(0)));
    }
}
