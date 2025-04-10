import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MainTest {
    //Task 1:
    @Test
    void shouldCalculateAverage() {
        int[] arrayOfTask1 = {10, 6, 5, 5};
        assertEquals(8, Main.calculateAverage(arrayOfTask1));
    }

    //Task 2:
    @Test
    void shouldCalculateArraySize() {
        int[] arrayOfTask2 = {9, 5, 10, 22, 3};
        assertEquals(3, Main.calculateArraySize(arrayOfTask2));
    }

    @Test
    void shouldGetNumbersSquare() {
        int[] arrayOfTask2 = {9, 2, 5, 3, 10, 8};
        int[] expected = {81, 25, 9};
        assertArrayEquals(expected, Main.getNumbersSquare(arrayOfTask2));
    }

    //Task 3:
    @Test
    void shouldCalculateArraySizeWithA() {
        String[] arrayOfTask3 = {"antal", "Katalin", "Joseph", "Annamária", "Antónia"};
        assertEquals(3, Main.calculateArraySizeWithA(arrayOfTask3));
    }

    @Test
    void shouldFindLetterWithA() {
        String[] arrayOfTask3 = {"Adél", "Anna", "Gábor", "Aladár", "antal"};
        int[] expected = {0, 1, 3, 4};
        assertArrayEquals(expected, Main.findLetterWithA(arrayOfTask3));
    }

    //Task 5:
    @Test
    void shouldIsDuplicatesTrue() {
        int[] arrayOfTask5 = {2, 5, 5, 10, 3, 6};
        assertTrue(Main.isDuplicates(arrayOfTask5));
    }

    @Test
    void shouldIsDuplicatesFalse() {
        int[] arrayOfTask5 = {2, 5, 10, 3, 6};
        assertFalse(Main.isDuplicates(arrayOfTask5));
    }

    //Task 6:
    @Test
    void shouldGetVowelsNumber() {
        String[][] arrayOfTask6 = {{"Tibi", "Joseph"}, {"Katalin", "Fish"}};
        assertEquals(8, Main.getVowelsNumber(arrayOfTask6));
    }

    //Task 7:
    @Test
    void shouldGetLongestStringNumber() {
        String[][] arrayOfTask7 = {
                {"Orange", "delicates", "ups"},
                {"dog", "fox", "tyrannosaurus"},
                {"rain", "jupiter"}
        };
        assertEquals(29, Main.getLongestStringNumber(arrayOfTask7));
    }

    //Task 8:
    @Test
    void shouldCalculate2DArraySize() {
        String[][] arrayOfTask8 = {{"hello", "something", "yes", "architect"}, {"music", "pizza", "song"}};
        assertEquals(7, Main.calculate2DArraySize(arrayOfTask8));
    }

    //Task 10:
    @Test
    void shouldCalculateAverageStringLength() {
        String[][] arrayOfTask10 = {
                {"hello", "world"},
                {"Java", "is", "fun"}
        };
        assertEquals(3.8, Main.calculateAverageStringLength(arrayOfTask10));
    }
}
