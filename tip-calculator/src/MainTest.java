import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    int[] arrayTest = new int[]{2000, 250, 300, 50, 250};

    @Test
    void shouldReturnTooHigh() {
        Assertions.assertEquals(-1, Main.ExaminePercent(81));
    }

    @Test
    void shouldReturnMinusOneTooLow() {
        Assertions.assertEquals(-1, Main.ExaminePercent(9));
    }

    @Test
    void shouldReturnPercent() {
        Assertions.assertEquals(25, Main.ExaminePercent(25));
    }

    @Test
    void shouldReturnZero() {
        Assertions.assertEquals(-1, Main.ExaminePercent(0));
    }

    @Test
    void shouldReturnMinusOneBecauseTooHigh() {
        Assertions.assertEquals(-1, Main.calculateTip(new int[]{Main.calculateSum(arrayTest)}, Main.ExaminePercent(81)));
    }

    @Test
    void shouldReturnTipCalc() {
        Assertions.assertEquals(712, Main.calculateTip(new int[]{Main.calculateSum(arrayTest)}, Main.ExaminePercent(25)));
    }

    @Test
    void shouldReturnTipCalcMinusOneBecauseTooLow() {
        Assertions.assertEquals(-1, Main.calculateTip(new int[]{Main.calculateSum(arrayTest)}, Main.ExaminePercent(8)));
    }

    @Test
    void shouldReturnTipCalcZero() {
        Assertions.assertEquals(-1, Main.calculateTip(new int[]{Main.calculateSum(arrayTest)}, Main.ExaminePercent(0)));
    }

    @Test
    void shouldReturnArraySum() {
        Assertions.assertEquals(2850, Main.calculateSum(arrayTest));
    }
}
