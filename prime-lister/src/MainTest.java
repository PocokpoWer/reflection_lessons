import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void shouldReturnIsPrimeTrue() {
        Assertions.assertTrue(Main.isPrime(83));
    }

    @Test
    void shouldReturnIsPrimeTrue2() {
        Assertions.assertTrue(Main.isPrime(228595153));
    }

    @Test
    void shouldReturnIsPrimeFalse() {
        Assertions.assertFalse(Main.isPrime(4));
    }

    @Test
    void shouldReturnIsPrimeFalse2() {
        Assertions.assertFalse(Main.isPrime(1987234765));
    }

    @Test
    void shouldReturnIsPrimeFalse3() {
        Assertions.assertFalse(Main.isPrime(0));
    }

    @Test
    void shouldReturnIsValidBetweenTwoAndTwoBillionTrue() {
        Assertions.assertTrue(Main.isValidBetweenTwoAndTwoBillion(5));
    }

    @Test
    void shouldReturnIsValidBetweenTwoAndTwoBillionTrue2() {
        Assertions.assertTrue(Main.isValidBetweenTwoAndTwoBillion(1934765789));
    }

    @Test
    void shouldReturnIsValidBetweenTwoAndTwoBillionFalse() {
        Assertions.assertFalse(Main.isValidBetweenTwoAndTwoBillion(1));
    }

    @Test
    void shouldReturnIsValidBetweenTwoAndTwoBillionFalse2() {
        Assertions.assertFalse(Main.isValidBetweenTwoAndTwoBillion(-23234252));
    }

}
