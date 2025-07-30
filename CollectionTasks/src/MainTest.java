import static org.junit.jupiter.api.Assertions.*;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException;

import java.util.*;

public class MainTest {
    // Task 1:
    @Test
    void shouldRemoveDuplicates() {
        String expected = "abcd";
        assertEquals(expected, Main.removeDuplicates("aabbccd"));
    }

    // Task 2:
    @Test
    void shouldReturnTrueIsAnagram() {
        assertTrue(Main.isAnagram("cheater", "teacher"));
    }

    // Task 3:
    @Test
    void shouldReturnFalseIsAnagram() {
        assertFalse(Main.isAnagram("alma", "dalma"));
    }

    // Task 4:
    @Test
    void shouldDeleteDuplicate() {
        List<Integer> listOfTest1 = new ArrayList<>();
        listOfTest1.add(11);
        listOfTest1.add(11);
        listOfTest1.add(12);
        listOfTest1.add(13);
        List<Integer> listOfTest2 = new ArrayList<>();
        listOfTest2.add(14);
        listOfTest2.add(14);
        listOfTest2.add(17);
        listOfTest2.add(20);
        Set<Integer> expected = new TreeSet<>();
        expected.add(11);
        expected.add(12);
        expected.add(13);
        expected.add(14);
        expected.add(17);
        expected.add(20);
        assertEquals(expected, Main.deleteDuplicate(listOfTest1, listOfTest2));
    }

    // Task 5:
    @Test
    void shouldReturnTrueIsUniqueNumber() {
        assertTrue(Main.isUniqueNumber("orange"));
    }

    @Test
    void shouldReturnFalseIsUniqueNumber() {
        assertFalse(Main.isUniqueNumber("character"));
    }

    // Task 6:
    @Test
    void shouldSortNumbers() {
        List<Integer> listOfTest1 = new ArrayList<>();
        listOfTest1.add(4);
        listOfTest1.add(2);
        listOfTest1.add(6);
        listOfTest1.add(2);
        List<Integer> listOfTest2 = new ArrayList<>();
        listOfTest2.add(5);
        listOfTest2.add(3);
        listOfTest2.add(8);
        List<Integer> expected = List.of(2, 2, 3, 4, 5, 6, 8);
        assertEquals(expected, Main.sortNumbers(listOfTest1, listOfTest2));
    }

    // Task 7:
    @Test
    void shouldGetSecondLargestNumber() {
        List<Integer> listOfTest = new ArrayList<>();
        listOfTest.add(3);
        listOfTest.add(7);
        listOfTest.add(1);
        listOfTest.add(6);
        listOfTest.add(2);
        listOfTest.add(9);
        int expected = 7;
        assertEquals(expected, Main.getSecondLargestNumber(listOfTest));
    }

    // Task 8:
    @Test
    void shouldGetCommonElements() {
        List<Integer> listOfTest = List.of(2, 3, 4, 5, 6);
        List<Integer> listOfTest_2 = List.of(6, 3, 5, 7, 1);
        List<Integer> expected = List.of(3, 5, 6);
        assertEquals(expected, Main.getCommonElements(listOfTest, listOfTest_2));
    }

    // Task 9:
    @Test
    void shouldGetFrequencyWord() {
        String wordsOfTest = "Bazilika motor bazilika templom";
        String expected = "bazilika";
        assertEquals(expected, Main.getFrequencyWord(wordsOfTest));
    }

    // Task 10:
    @Test
    void shouldCountWords() {
        String sentenceOfTest = "Ingyom bingyom tálibe totálibe tálibe";
        int expected = 4;
        assertEquals(expected, Main.countWords(sentenceOfTest));
    }

    // Task 11:
    @Test
    void shouldGetNumbersIsOnce() {
        List<Integer> numbersOfTest = List.of(1, 1, 2, 3, 4, 2, 4, 6);
        List<Integer> expected = List.of(3, 6);
        assertEquals(expected, Main.getNumbersIsOnce(numbersOfTest));
    }

    // Task 12:
    @Test
    void shouldGetFrequentStartLetter() {
        String wordOfTest = "\"car\", \"fly\", \"banana\", \"yellow\", \"jazz\", \"busy\"";
        char expecxted = 'b';
        assertEquals(expecxted, Main.getFrequentStartLetter(wordOfTest));
    }

    // Task 13:
    @Test
    void shouldGetFrequentChar() {
        String lettersOfTest = "gggbbuuuujjjk";
        char expected = 'u';
        assertEquals(expected, Main.getFrequentChar(lettersOfTest));
    }

    // Task 14:
    @Test
    void shouldGetWordIsOnce() {
        String wordOfTest = "beaches orange beaches apple";
        String wordOfTest_2 = "orange paragliding apple car";
        List<String> expected = List.of("car", "paragliding");
        assertEquals(expected, Main.getWordIsOnce(wordOfTest, wordOfTest_2));
    }

    // Task 15:
    @Test
    void shouldCountUniqueLetters() {
        String lettersOfTest = "llleeeeppffuutttt";
        int expected = 6;
        assertEquals(expected, Main.countUniqueLetters(lettersOfTest));
    }

    // Task 16:
    @Test
    void shouldGetNonRepeatingChar() {
        String lettersOfTest = "nnnuutrrreeegggg";
        char expected = 't';
        assertEquals(expected, Main.getNonRepeatingChar(lettersOfTest));
    }

    // Task 17:
    @Test
    public void shouldGetAnagrams() {
        List<String> listOfTest = List.of("act", "cat", "dog", "god", "tac");
        List<List<String>> result = Main.getAnagrams(listOfTest);
        Set<Set<String>> expected = Set.of(
                Set.of("act", "cat", "tac"),
                Set.of("dog", "god")
        );
        Set<Set<String>> actual = new HashSet<>();
        for (List<String> group : result) {
            actual.add(new HashSet<>(group));
        }
        assertEquals(expected, actual);
    }

    // Task 18:
    @Test
    void shouldGetFrequentWord() {
        List<String> wordOfTest = List.of("orange", "motor", "orange", "car", "car", "orange");
        String expected = "orange";
        assertEquals(expected, Main.getFrequentWord(wordOfTest));
    }

    // Task 19:
    @Test
    void shouldGetDuplicateNumbers() {
        List<Integer> numbersOfTest = List.of(7, 8, 5, 4, 12, 2, 5, 8);
        List<Integer> expected = List.of(5, 8);
        assertEquals(expected, Main.getDuplicateNumbers(numbersOfTest));
    }

    // Task 20:
    @Test
    void shouldIsElements() {
        List<Integer> listOfTest = List.of(7, 8, 7, 9);
        List<Integer> listOfTest2 = List.of(8, 9, 7, 7);
        assertTrue(Main.isSameElements(listOfTest, listOfTest2));
    }

    @Test
    void shouldIsElementsFalse() {
        List<Integer> listOfTest = List.of(7, 8, 7, 9);
        List<Integer> listOfTest2 = List.of(8, 10, 3, 7);
        assertFalse(Main.isSameElements(listOfTest, listOfTest2));
    }

    // Task 21:
    @Test
    void shouldGetChangeLetters() {
        String lettersOfTest = "hhjjjkkweeee";
        int expected = 8;
        assertEquals(expected, Main.getChangeLetters(lettersOfTest));
    }

    // Task 22:
    @Test
    void shouldGetNumbersOnce() {
        List<Integer> listOfTest = List.of(4, 5, 7, 5, 4, 1, 2, 5, 8);
        List<Integer> expected = List.of(1, 2, 7, 8);
        assertEquals(expected, Main.getNumbersIsOnce(listOfTest));
    }

    // Task 23:
    @Test
    void shouldGetGroupNumbers() {
        List<Integer> listOfTest = List.of(2, 2, 2, 6, 6, 7, 7, 7, 7, 7);
        Map<Integer, Integer> expected = Map.of(2, 3, 6, 2, 7, 5);
        assertEquals(expected, Main.getGroupNumbers(listOfTest));
    }

    // Task 24:
    @Test
    void shouldGetNewMap() {
        Map<String, Integer> mapOfTest = Map.of("b", 3, "z", 3, "j", 2, "d", 2);
        Map<Integer, List<String>> expected = Map.of(3, List.of("b", "z"), 2, List.of("j", "d"));
    }

    // Extra tasks:
    // Task 1:
    @Test
    void shouldGetWebsiteVisited() {
        List<String> pagesOfTest = new ArrayList<>();
        pagesOfTest.add("about");
        pagesOfTest.add("news");
        pagesOfTest.add("sport");
        pagesOfTest.add("news");
        Set<String> expected = new LinkedHashSet<>();
        expected.add("about");
        expected.add("news");
        expected.add("sport");
        assertEquals(expected, Main.getWebsiteVisited(pagesOfTest));
    }

    // Task 2:
    @Test
    void shouldGetNameList() {
        List<String> listOfTest = new ArrayList<>();
        listOfTest.add("Zoltán");
        listOfTest.add("Aladár");
        listOfTest.add("Tibor");
        listOfTest.add("Cecília");
        listOfTest.add("Rajmund");
        TreeSet<String> expected = new TreeSet<>();
        expected.add("Aladár");
        expected.add("Cecília");
        expected.add("Rajmund");
        expected.add("Tibor");
        expected.add("Zoltán");
        assertEquals(expected, Main.getNameList(listOfTest));
    }

    // Task 3:
    @Test
    void shouldGetNamesAndScores() {
        List<String> namesOfTest = new ArrayList<>();
        namesOfTest.add("Tibor");
        namesOfTest.add("Zoltán");
        namesOfTest.add("Gábor");
        namesOfTest.add("Zsigmond");
        List<Integer> scoresOfTest = new ArrayList<>();
        scoresOfTest.add(5);
        scoresOfTest.add(10);
        scoresOfTest.add(8);
        scoresOfTest.add(2);
        Map<String, Integer> expected = new TreeMap<>();
        expected.put("Zoltán", 10);
        expected.put("Gábor", 8);
        expected.put("Tibor", 5);
        expected.put("Zsigmond", 2);
        assertEquals(expected, Main.getNamesAndScores(namesOfTest, scoresOfTest));
    }

    // Task 4:
    @Test
    void shouldGetCitiesTemperature() {
        List<String> namesOfTest = new ArrayList<>();
        namesOfTest.add("Esztergom");
        namesOfTest.add("Baja");
        namesOfTest.add("Szombathely");
        namesOfTest.add("Eger");
        List<Integer> temperatureOfTest = new ArrayList<>();
        temperatureOfTest.add(26);
        temperatureOfTest.add(10);
        temperatureOfTest.add(15);
        temperatureOfTest.add(30);
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("Esztergom", 26);
        expected.put("Baja", 10);
        expected.put("Szombathely", 15);
        expected.put("Eger", 30);
        assertEquals(expected, Main.getCitiesTemperature(namesOfTest, temperatureOfTest));
    }

    // Task 5:
    @Test
    void shouldCountHashtag() {
        List<String> sentenceOfTest = List.of(
                "#hello world #java",
                "learning #java and #testing",
                "#unittest is important",
                "#java #unittest #unittest",
                "#coding #hello"
        );
        Map<String, Integer> expected = Map.of("#hello", 2, "#java", 3, "#testing", 1, "#unittest", 3, "#coding", 1);
        assertEquals(expected, Main.countHashtag(sentenceOfTest));
    }

    // Task 6:
    @Test
    void shouldGetTags() {
        List<String> tagsOfTest = List.of("java", "blog", "coding", "java");
        Set<String> expected = Set.of("blog", "coding", "java");
        assertEquals(expected, Main.getTags(tagsOfTest));
    }

    // Task 7:
    @Test
    void shouldGetStudentList() {
        List<String> list = List.of("Tibor", "Géza", "Tibor", "Aladár", "Tihamér");
        Set<String> expected = Set.of("Tibor", "Géza", "Aladár", "Tihamér");
        assertEquals(expected, Main.getStudentList(list));
    }

    // Task 8:
    @Test
    void shouldGetContactList() {
        List<String> names = List.of("David", "Anna", "Eva", "Bob", "Anna");
        List<String> phones = List.of("+36305555555", "+36201111111", "+36203333333", "+36104444444", "+36207777777");
        Map<String, String> expected = Map.of(
                "Anna", "+36207777777",
                "Bob", "+36104444444",
                "David", "+36305555555",
                "Eva", "+36203333333"
        );
        assertEquals(expected, Main.getContactList(names, phones));
    }

    // Task 9:
    @Test
    void shouldGetCustomerPoint() {
        List<String> customersOfTest = List.of("Gábor", "Géza", "Aladár", "István");
        List<Integer> pointsOfTest = List.of(50, 80, 35, 10);
        Map<String, Integer> expected = Map.of("Gábor", 50, "Géza", 80, "Aladár", 35, "István", 10);
        assertEquals(expected, Main.getCustomerPoint(customersOfTest, pointsOfTest));
    }

    // Task 10:
    @Test
    void shouldGetProductsQuantity() {
        List<String> productsOfTest = List.of("Csokoládé", "Tojás", "Tej", "Szőlő");
        List<Integer> quantityOfTest = List.of(5, 8, 3, 5);
        Map<String, Integer> expected = Map.of("Csokoládé", 5, "Tojás", 8, "Tej", 3, "Szőlő", 5);
        assertEquals(expected, Main.getProductsQuantity(productsOfTest, quantityOfTest));
    }
}
