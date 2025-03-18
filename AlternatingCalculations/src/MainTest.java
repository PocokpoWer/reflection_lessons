import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MainTest {
    @Test
        // Task 1:
    void shouldReturnSumAndMinusThirdNumber() {
        int[] arrayOfTask1 = {3, 5, 2, 7, 4, 8, 1, 6, 9};
        Assertions.assertEquals(7, Main.sumAndMinusThirdNumber(arrayOfTask1));
    }

    @Test
        // Task 2:
    void shouldReturnMultiAndDivisionNumbers() {
        int[] arrayOfTask2 = {2, 3, 6, 4, 2, 8, 3, 7, 9};
        Assertions.assertEquals(2.3333333333333335, Main.multiAndDivisionNumbers(arrayOfTask2));
    }

    @Test
        // Task 3:
    void shouldReturnSumEvenMinusOddNumbers() {
        int[] arrayOfTask3 = {10, 5, 3, 2, 8, 6};
        Assertions.assertEquals(8, Main.sumEvenMinusOddNumbers(arrayOfTask3));
    }

    @Test
        // Task 4:
    void shouldReturnSumNumbersSkipFourthElement() {
        int[] arrayOfTask4 = {2, 5, 8, 3, 6, 7, 9, 4, 1};
        Assertions.assertEquals(38, Main.sumNumbersSkipFourthElement(arrayOfTask4));
    }

    @Test
        // Task 5:
    void shouldReturnPowerAndDivisionNumbers() {
        int[] arrayOfTask5 = {2, 3, 4, 2, 5, 2, 8, 3};
        Assertions.assertEquals(0.0244140625, Main.powerAndDivisionNumbers(arrayOfTask5));
    }

    // Task 6:
    @Test
    void shouldReturnSumAndPowerNumbers() {
        int[] arrayOfTask6 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertEquals(63, Main.sumAndPowerNumbers(arrayOfTask6));
    }

    @Test
        // Task 7:
    void shouldReturnSumNumberMultiplesOf3Skip() {
        int[] arrayOfTask7 = {5, 9, 7, 6, 2, 12, 8};
        Assertions.assertEquals(22, Main.sumNumberMultiplesOf3Skip(arrayOfTask7));
    }

    @Test
        // Task 8:
    void shouldReturnSumNumbersPrimeSquared() {
        int[] arrayOfTask8 = {3, 4, 5, 6};
        Assertions.assertEquals(44, Main.sumNumbersPrimeSquared(arrayOfTask8));
    }

    @Test
        // Task 9:
    void shouldReturnCountEvenAndOddNumbers() {
        int[] arrayOfTask9 = {2, 7, 4, 9, 6, 3, 8};
        Assertions.assertArrayEquals(new int[]{4, 3}, Main.countEvenAndOddNumbers(arrayOfTask9));
    }

    @Test
        // Task 10:
    void shouldReturnSumAndNegNumbersIgnored() {
        int[] arrayOfTask10 = {-3, 4, -1, 7, -2, 8};
        Assertions.assertEquals(19, Main.sumAndNegNumbersIgnored(arrayOfTask10));
    }

    @Test
        // Task 11:
    void shouldReturnProdPositiveDivNegativeNumbers() {
        int[] arrayOfTask11 = {2, 3, -5, 4, -2};
        Assertions.assertEquals(2.4, Main.prodPositiveDivNegativeNumbers(arrayOfTask11));
    }

    @Test
    void shouldReturnFalseOrTrue() {
        Assertions.assertTrue(Main.isPrime(3));
    }
}
