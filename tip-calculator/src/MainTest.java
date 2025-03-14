import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    int[] arrayTest = new int[]{2000, 250, 300, 50, 250};

    @Test
    void shouldReturnTooHigh() {
        Assertions.assertEquals(-1, Main.examinePercent(81));
    }

    @Test
    void shouldReturnMinusOneTooLow() {
        Assertions.assertEquals(-1, Main.examinePercent(9));
    }

    @Test
    void shouldReturnPercent() {
        Assertions.assertEquals(25, Main.examinePercent(25));
    }

    @Test
    void shouldReturnZero() {
        Assertions.assertEquals(-1, Main.examinePercent(0));
    }

    @Test
    void shouldReturnMinusOneBecauseTooHigh() {
        Assertions.assertEquals(-1, Main.calculateTip(Main.examinePercent(81), Main.calculateSum(arrayTest)));
    }

    @Test
    void shouldReturnTipCalc() {
        Assertions.assertEquals(712, Main.calculateTip(Main.examinePercent(25), Main.calculateSum(arrayTest)));
    }

    @Test
    void shouldReturnTipCalcMinusOneBecauseTooLow() {
        Assertions.assertEquals(-1, Main.calculateTip(Main.examinePercent(8), Main.calculateSum(arrayTest)));
    }

    @Test
    void shouldReturnTipCalcZero() {
        Assertions.assertEquals(-1, Main.calculateTip(Main.examinePercent(0), Main.calculateSum(arrayTest)));
    }

    @Test
    void shouldReturnArraySum() {
        Assertions.assertEquals(2850, Main.calculateSum(arrayTest));
    }
}
