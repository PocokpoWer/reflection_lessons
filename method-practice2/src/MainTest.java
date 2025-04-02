import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    // Task 3:
    @Test
    void shouldReturnGetThirtyPercentOfNumber() {
        assertEquals(30, Main.getThirtyPercentOfNumber(100));
    }

    // Task 4:
    @Test
    void shouldReturnGetEmptyArray() {
        String[] text = {"Word", "some", "anybody", "doing"};
        String[] expected = {"", "", "", ""};
        assertArrayEquals(expected, Main.getEmptyArray(text));
    }

    // Task 5:
    @Test
    void shouldReturnGetFortyTwoDotTwoPercentOfNumber() {
        assertEquals(42.8, Main.getFortyTwoDotTwoPercentOfNumber(100));
    }

    // Task 6:
    @Test
    void shouldReturnGetDoubleStringLength() {
        assertEquals(20, Main.getDoubleStringLength("FarkasTibi"));
    }

    // Task 7
    @Test
    void shouldReturnCalculateDifferenceTwoNumbers() {
        assertEquals(6, Main.calculateDifferenceTwoNumbers(4, 10));
    }

    // Task 8:
    @Test
    void shouldReturnGetStringSquareRootLength() {
    }

    // Task 9:
    @Test
    void shouldReturnGetFactorialStringLength() {
        assertEquals(720, Main.getFactorialStringLength("Farkas"));
    }

    // Task 10:
    @Test
    void shouldReturnGetNumberDivideByHundred() {
        assertEquals(1, Main.getNumberDivideByHundred(100));
    }

    // Task 11:
    @Test
    void shouldReturnIsPrimeTrue() {
        assertTrue(Main.isPrime(11));
    }

    @Test
    void shouldReturnIsPrimeFalse() {
        assertFalse(Main.isPrime(4));
    }

    @Test
    void shouldReturnGetNumberPrimeNotPrimeDivideFourOrNot() {
        assertEquals(121, Main.getNumberPrimeNotPrimeDivideFourOrNot(11));
    }

    @Test
    void shouldReturnGetNumberPrimeNotPrimeDivideFourOrNot2() {
        assertEquals(8, Main.getNumberPrimeNotPrimeDivideFourOrNot(4));
    }

    @Test
    void shouldReturnGetNumberPrimeNotPrimeDivideFourOrNot3() {
        assertEquals(42, Main.getNumberPrimeNotPrimeDivideFourOrNot(14));
    }

    @Test
    void shouldReturnGetNumberPrimeNotPrimeDivideFourOrNot4() {
        assertEquals(42, Main.getNumberPrimeNotPrimeDivideFourOrNot(14));
    }

    // Task 12:
    @Test
    void shouldReturnCounterArraySize() {
        String[] arrayToTest = {"Word", "some", "anybody", "doing"};
        assertEquals(4, Main.counterArraySize(arrayToTest));
    }

    @Test
    void shouldReturnCalculateStringLength() {
        String[] arrayToTest2 = {"Word", "some", "anybody", "doing"};
        int[] expected = {4, 4, 7, 5};
        assertArrayEquals(expected, Main.calculateStringLength(arrayToTest2));
    }

    // Task 13:
    @Test
    void shouldReturnReduceSZJA() {
        assertEquals(15, Main.reduceSZJA(100));
    }

    @Test
    void shouldReturnReduceTBJ() {
        assertEquals(185, Main.reduceTBJ(1000));
    }

    @Test
    void shouldReturnCalculateNetSalary() {
        int salary = 100_000;
        assertEquals(66500, Main.calculateNetSalary(salary, Main.reduceSZJA(salary), Main.reduceTBJ(salary)));
    }

    // Task 14:
    @Test
    void shouldReturnXorArrayFalse() {
        boolean[] array = {true, true, false};
        assertFalse(Main.xorArray(array));
    }

    @Test
    void shouldReturnXorArrayTrue2() {
        boolean[] array2 = {true, true, true};
        assertTrue(Main.xorArray(array2));
    }

    // Task 15:
    @Test
    void shouldReturnGetOppositeNumber() {
        int[] numbers = {12, 10, -5, 23, 10, 67, 0};
        int[] oppositeNumbers = {-12, -10, 5, -23, -10, -67, 0};
        assertArrayEquals(oppositeNumbers, Main.getOppositeNumber(numbers));
    }


}

