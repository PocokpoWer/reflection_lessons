import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    int[] arrayTest = new int[]{2000, 250, 300, 50, 250};
    int[] arrayTest2 = new int[]{2850};

    @Test
    void shouldReturnTooHigh() {
        Assertions.assertEquals(-1, Main.doExaminePercent(81));
    }

    @Test
    void shouldReturnMinusOneTooLow() {
        Assertions.assertEquals(-1, Main.doExaminePercent(9));
    }

    @Test
    void shouldReturnPercent() {
        Assertions.assertEquals(25, Main.doExaminePercent(25));
    }

    @Test
    void shouldReturnZero() {
        Assertions.assertEquals(-1, Main.doExaminePercent(0));
    }

    @Test
    void shouldReturnMinusOneBecauseTooHigh() {
        Assertions.assertEquals(-1, Main.calculateTip(Main.calculateSum(arrayTest), Main.doExaminePercent(81)));
    }

    @Test
    void shouldReturnTipCalc() {
        Assertions.assertEquals(712, Main.calculateTip(Main.calculateSum(arrayTest), Main.doExaminePercent(25)));
    }

    @Test
    void shouldReturnTipCalcMinusOneBecauseTooLow() {
        Assertions.assertEquals(-1, Main.calculateTip(Main.calculateSum(arrayTest), Main.doExaminePercent(8)));
    }

    @Test
    void shouldReturnTipCalcZero() {
        Assertions.assertEquals(-1, Main.calculateTip(Main.calculateSum(arrayTest), Main.doExaminePercent(0)));
    }

    @Test
    void shouldReturnArraySum() {
        Assertions.assertArrayEquals(arrayTest2, Main.calculateSum(arrayTest));
    }
}
