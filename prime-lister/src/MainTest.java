import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void shouldReturnIsPrimeTrue() {
        Assertions.assertTrue(Main.isPrime(83));
    }

    @Test
    void shouldReturnFalse() {
        Assertions.assertFalse(Main.isPrime(82));
    }

    @Test
    void shouldReturnIsTrue() {
        Assertions.assertTrue(Main.isValidBetweenTwoAndTwoBillion(5));
    }

    @Test
    void shouldReturnFalseNumber() {
        Assertions.assertFalse(Main.isValidBetweenTwoAndTwoBillion(1));
    }

}
