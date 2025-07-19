import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.List;

public class CfTasksTest {
    @Test
    void shouldGetIntersectionNumbers() {
        List<Integer> expected = List.of(5, 98, 7);
        List<Integer> listToTest1 = List.of(3, 5, 10, 98, 7);
        List<Integer> listToTest2 = List.of(12, 98, 987, 7, 5);
        assertEquals(expected, CfTasks.getIntersectionNumbers(listToTest1, listToTest2));
    }

    @Test
    void shouldGetReverse() {
        List<String> word = List.of("aloha", "madam");
        List<String> expected = List.of("ahola", "madam");
        assertEquals(expected, CfTasks.getWordReverse(word));
    }

    @Test
    void shouldGetPalindrome() {
        List<String> words = List.of("hello", "madam", "keksz");
        List<String> expected = List.of("madam");
        assertEquals(expected, CfTasks.getPalindrome(words));
    }

    @Test
    void shouldGetUniqueLetters() {
        String word = "developed";
        String expected = "devlop";
        assertEquals(expected, CfTasks.getUniqueLetters(word));
    }

    @Test
    void shouldGetDuplicationNumbers() {
        List<Integer> listOfTest = List.of(2, 5, 6, 4, 2, 9, 5, 8, 6, 10);
        List<Integer> expected = List.of(2, 5, 6);
        assertEquals(expected, CfTasks.getDuplicationNumbers(listOfTest));
    }

    @Test
    void shouldFilterDuplicationNumber1() {
        List<Integer> listoftest_1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> listoftest_2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(2, CfTasks.filterDuplicationNumber(listoftest_1, listoftest_2));
    }
    @Test
    void shouldFilterDuplicationNumber2() {
        List<Integer> listoftest_1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
        List<Integer> listoftest_2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(1, CfTasks.filterDuplicationNumber(listoftest_1, listoftest_2));
    }
    @Test
    void shouldFilterDuplicationNumber3() {
        List<Integer> listoftest_1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9,10);
        List<Integer> listoftest_2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(0, CfTasks.filterDuplicationNumber(listoftest_1, listoftest_2));
    }
}
