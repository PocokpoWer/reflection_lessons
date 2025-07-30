import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        System.out.println(removeDuplicates("banana") + "\n");

        System.out.println("Task 2:");
        System.out.println(isAnagram("listen", "silent") + "\n");

        System.out.println("Task 3:");
        List<Integer> listOfTask3 = new ArrayList<>();
        listOfTask3.add(2);
        listOfTask3.add(2);
        listOfTask3.add(3);
        listOfTask3.add(4);
        List<Integer> listOfTask3_2 = new ArrayList<>();
        listOfTask3_2.add(1);
        listOfTask3_2.add(1);
        listOfTask3_2.add(5);
        listOfTask3_2.add(4);
        System.out.println(deleteDuplicate(listOfTask3, listOfTask3_2).stream().toList() + "\n");

        System.out.println("Task 4:");
        List<Integer> listOfTask4 = List.of(2, 2, 3, 8, 5, 5, 7, 7, 1, 1, 1, 10);
        System.out.println(getNumberFrequency(listOfTask4) + "\n");

        System.out.println("Task 5:");
        String wordOfTask5 = "ball";
        System.out.println(isUniqueNumber(wordOfTask5) + "\n");

        System.out.println("Task 6:");
        List<Integer> listOfTask6 = new ArrayList<>();
        listOfTask6.add(5);
        listOfTask6.add(2);
        listOfTask6.add(7);
        listOfTask6.add(3);
        List<Integer> listOfTask6_2 = new ArrayList<>();
        listOfTask6_2.add(1);
        listOfTask6_2.add(4);
        listOfTask6_2.add(6);
        listOfTask6_2.add(9);
        System.out.println(sortNumbers(listOfTask6, listOfTask6_2) + "\n");

        System.out.println("Task 7:");
        List<Integer> listOfTask7 = new ArrayList<>();
        listOfTask7.add(3);
        listOfTask7.add(1);
        listOfTask7.add(4);
        listOfTask7.add(1);
        listOfTask7.add(5);
        listOfTask7.add(9);
        System.out.println(getSecondLargestNumber(listOfTask7) + "\n");

        System.out.println("Task 8:");
        List<Integer> listOfTask8 = List.of(1, 2, 3, 4);
        List<Integer> listOfTask8_2 = List.of(3, 4, 5, 6);
        System.out.println(getCommonElements(listOfTask8, listOfTask8_2));

        System.out.println("Task 9:");
        String wordOfTask9 = "Hello hello world!";
        System.out.println(getFrequencyWord(wordOfTask9));

        System.out.println("Task 10:");
        String sentenceOfTask10 = "The cat and the dog.";
        System.out.println(countWords(sentenceOfTask10));

        System.out.println("Task 11:");
        List<Integer> listOfTask11 = List.of(4, 5, 4, 6, 7, 6);
        System.out.println(getNumbersIsOnce(listOfTask11));

        System.out.println("Task 12:");
        String wordOfTask12 = "\"apple\", \"ant\", \"banana\", \"blue\", \"blues\", \"ceiling\"";
        System.out.println(getFrequentStartLetter(wordOfTask12));

        System.out.println("Task 13:");
        String lettersOfTask13 = "aabbbcdd";
        System.out.println(getFrequentChar(lettersOfTask13));

        System.out.println("Task 14:");
        String wordOfTask14 = "holiday apple banana apple";
        String wordOfTask14_2 = "banana fruit holiday blues";
        System.out.println(getWordIsOnce(wordOfTask14, wordOfTask14_2));

        System.out.println("Task 15:");
        String lettersOfTask15 = "aabcbcdbca";
        System.out.println(countUniqueLetters(lettersOfTask15));

        System.out.println("Task 16:");
        String lettersOfTask16 = "aabbcdeff";
        System.out.println(getNonRepeatingChar(lettersOfTask16));

        System.out.println("Task 17:");
        List<String> listOfTask17 = List.of("act", "cat", "dog", "god", "tac");
        System.out.println(getAnagrams(listOfTask17));

        System.out.println("Task 18:");
        List<String> wordsOfTask18 = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(getFrequentWord(wordsOfTask18));

        System.out.println("Task 19:");
        List<Integer> numbersOfTask19 = List.of(1, 2, 3, 2, 4, 1, 5);
        System.out.println(getDuplicateNumbers(numbersOfTask19));

        System.out.println("Task 20:");
        List<Integer> listOfTask20 = List.of(1, 2, 2, 3);
        List<Integer> listOfTask20_2 = List.of(2, 1, 3, 2);
        System.out.println(isSameElements(listOfTask20, listOfTask20_2));

        System.out.println("Task 21:");
        String stringOfTask21 = "aabbc";
        System.out.println(getChangeLetters(stringOfTask21));

        System.out.println("Task 22:");
        List<Integer> numbersOfTask22 = List.of(1, 2, 2, 3, 4, 4, 5);
        System.out.println(getNumbersOnce(numbersOfTask22));

        System.out.println("Task 23:");
        List<Integer> listOfTask23 = List.of(1, 2, 2, 3, 3, 3);
        System.out.println(getGroupNumbers(listOfTask23));

        System.out.println("Task 24:");
        Map<String, Integer> mapOfTask24 = Map.of("a", 1, "b", 2, "c", 1);
        System.out.println(getNewMap(mapOfTask24));

        System.out.println("Extra tasks");
        System.out.println("Tasks 1:");
        List<String> pages = new ArrayList<>();
        pages.add("home");
        pages.add("contact");
        pages.add("about");
        pages.add("contact");
        System.out.println(getWebsiteVisited(pages));

        System.out.println("Task: 2");
        List<String> nameList = new ArrayList<>();
        nameList.add("Tibor");
        nameList.add("Aladár");
        nameList.add("Béla");
        nameList.add("Cecíl");
        nameList.add("Géza");
        System.out.println(getNameList(nameList).subSet("c", "c" + Character.MAX_VALUE));

        System.out.println("Task 3:");
        List<String> namesOfTask3 = List.of("Tibor", "Gábor", "Ilona", "Zoli");
        List<Integer> namesOfTask3_2 = List.of(10, 12, 8, 5);
        System.out.println(getNamesAndScores(namesOfTask3, namesOfTask3_2));

        System.out.println("Task 4:");
        List<String> namesOfCities = new ArrayList<>();
        namesOfCities.add("Szigetszentmiklós");
        namesOfCities.add("Tököl");
        namesOfCities.add("Halásztelek");
        namesOfCities.add("Komárom");
        List<Integer> temperatureOfCities = new ArrayList<>();
        temperatureOfCities.add(24);
        temperatureOfCities.add(20);
        temperatureOfCities.add(18);
        temperatureOfCities.add(22);
        System.out.println(getCitiesTemperature(namesOfCities, temperatureOfCities));

        System.out.println("Task 5:");
        List<String> sentenceOfTask5 = List.of(
                "I love #java and #coding",
                "#coding is fun",
                "#java is powerful",
                "#openai is cool",
                "#coding rocks");
        System.out.println(countHashtag(sentenceOfTask5));

        System.out.println("Task 6:");
        List<String> tagsOfTask6 = List.of("motor", "car", "soup", "motor");
        System.out.println(getTags(tagsOfTask6));

        System.out.println("Task 7:");
        List<String> studentOfTask7 = List.of("Károly", "Tímea", "Géza", "Károly", "Géza");
        System.out.println(getStudentList(studentOfTask7));

        System.out.println("Task 8:");
        List<String> namesOfTask8 = List.of("Charlie", "Alice", "Bob", "Alice");
        List<String> phonesOfTask8 = List.of("+36301234567", "+36201234567", "+36101234567", "+36209999999");
        System.out.println(getContactList(namesOfTask8, phonesOfTask8));

        System.out.println("Task 9:");
        List<String> customersOfTask9 = List.of("Irma", "David", "Géza", "József");
        List<Integer> pointsOfTask9 = List.of(20, 23, 43, 12);
        System.out.println(getCustomerPoint(customersOfTask9, pointsOfTask9));

        System.out.println("Task 10:");
        List<String> products = List.of("Banán", "Narancs", "Répa", "Virsli");
        List<Integer> quantity = List.of(3, 7, 1, 5);
        System.out.println(getCustomerPoint(products, quantity));
    }

    // Task 1:
    public static String removeDuplicates(String input) {
        Set<Character> letters = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            letters.add(input.charAt(i));
        }
        for (char ch : letters) {
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

    // Task 2:
    public static boolean isAnagram(String inputOne, String inputTwo) {
        Map<Character, Integer> charCountInputOne = new LinkedHashMap<>();
        Map<Character, Integer> charCountInputTwo = new LinkedHashMap<>();
        for (char ch : inputOne.toCharArray()) {
            charCountInputOne.put(ch, charCountInputOne.getOrDefault(ch, 0) + 1);
        }
        for (char ch : inputTwo.toCharArray()) {
            charCountInputTwo.put(ch, charCountInputTwo.getOrDefault(ch, 0) + 1);
        }
        return charCountInputOne.equals(charCountInputTwo);
    }

    // Task 3:
    public static Set<Integer> deleteDuplicate(List<Integer> list1, List<Integer> list2) {
        Set<Integer> sortNumbers = new TreeSet<>();
        sortNumbers.addAll(list1);
        sortNumbers.addAll(list2);
        return sortNumbers;
    }

    // Task 4:
    public static Map<Integer, Integer> getNumberFrequency(List<Integer> list) {
        Map<Integer, Integer> countNumbers = new HashMap<>();
        for (Integer number : list) {
            countNumbers.put(number, countNumbers.getOrDefault(number, 0) + 1);
        }
        return countNumbers;
    }

    // Task 5:
    public static boolean isUniqueNumber(String input) {
        Map<Character, Integer> letters = new HashMap<>();
        for (Character ch : input.toCharArray()) {
            letters.put(ch, letters.getOrDefault(ch, 0) + 1);
            if (letters.get(ch) > 1) {
                return false;
            }
        }
        return true;
    }

    // Task 6:
    public static List<Integer> sortNumbers(List<Integer> list1, List<Integer> list2) {
        List<Integer> sortedList = new LinkedList<>();
        sortedList.addAll(list1);
        sortedList.addAll(list2);
        Collections.sort(sortedList);
        return sortedList;
    }

    // Task 7:
    public static int getSecondLargestNumber(List<Integer> list) {
        int secondLargestNumber = 0;
        Collections.sort(list);
        int latestNumber = list.getLast();
        for (int number : list) {
            if (number <= latestNumber - 1) {
                secondLargestNumber = number;
            }
        }
        return secondLargestNumber;
    }

    // Task 8:
    public static List<Integer> getCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> commonElements = new ArrayList<>();
        Map<Integer, Integer> countFrequency = new HashMap<>();
        for (int number : list1) {
            countFrequency.put(number, countFrequency.getOrDefault(number, 0) + 1);
        }
        for (int number : list2) {
            countFrequency.put(number, countFrequency.getOrDefault(number, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                commonElements.add(entry.getKey());
            }
        }
        return commonElements;
    }

    // Task 9:
    public static String getFrequencyWord(String input) {
        Map<String, Integer> wordsFrequency = new HashMap<>();
        String result = null;
        String[] splitWord = input.replaceAll("[!]", "").toLowerCase().split(" ");
        for (String word : splitWord) {
            wordsFrequency.put(word, wordsFrequency.getOrDefault(word, 0) + 1);
        }
        int max = 0;
        for (Map.Entry<String, Integer> entry : wordsFrequency.entrySet()) {
            if (result == null || entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey().toString();
            }
        }
        return result;
    }

    // Task 10:
    public static int countWords(String input) {
        Set<String> words = new HashSet<>();
        String[] wordSplit = input.toLowerCase().split(" ");
        for (String word : wordSplit) {
            words.add(word);
        }
        return words.size();
    }

    // Task 11:
    public static List<Integer> getNumbersIsOnce(List<Integer> list) {
        Map<Integer, Integer> numbersFrequency = new HashMap<>();
        List<Integer> numbers = new ArrayList<>();

        for (int number : list) {
            numbersFrequency.put(number, numbersFrequency.getOrDefault(number, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : numbersFrequency.entrySet()) {
            if (entry.getValue() == 1) {
                numbers.add(entry.getKey());
            }
        }
        return numbers;
    }

    // Task 12:
    public static char getFrequentStartLetter(String input) {
        Map<Character, Integer> lettersFrequent = new HashMap<>();
        int frequent = 0;
        char frequentLetter = '\u0000';
        String[] wordsSplit = input.replaceAll("\"", "").split(", ");
        for (String word : wordsSplit) {
            lettersFrequent.put(word.charAt(0), lettersFrequent.getOrDefault(word.charAt(0), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : lettersFrequent.entrySet()) {
            if (entry.getValue() > frequent) {
                frequent = entry.getValue();
                frequentLetter = entry.getKey();
            }
        }
        return frequentLetter;
    }

    // Task 13:
    public static char getFrequentChar(String input) {
        Map<Character, Integer> frequentChars = new HashMap<>();
        int count = 0;
        char frequentChar = '\u0000';
        for (int i = 0; i < input.length(); i++) {
            frequentChars.put(input.charAt(i), frequentChars.getOrDefault(input.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : frequentChars.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                frequentChar = entry.getKey();
            }
        }
        return frequentChar;
    }

    // Task 14:
    public static List<String> getWordIsOnce(String input1, String input2) {
        Map<String, Integer> mergeWords = new HashMap<>();
        List<String> wordResult = new ArrayList<>();
        String[] wordsSplit = input1.split(" ");
        String[] wordsSplit2 = input2.split(" ");
        for (String word : wordsSplit) {
            mergeWords.put(word, mergeWords.getOrDefault(word, 0) + 1);
        }
        for (String word : wordsSplit2) {
            mergeWords.put(word, mergeWords.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : mergeWords.entrySet()) {
            if (entry.getValue() == 1) {
                wordResult.add(entry.getKey());
            }
        }
        Collections.sort(wordResult);
        return wordResult;
    }

    // Task 15:
    public static int countUniqueLetters(String input) {
        Set<Character> letters = new HashSet<>();
        for (char ch : input.toCharArray()) {
            letters.add(ch);
        }
        return letters.size();
    }

    // Task 16:
    public static char getNonRepeatingChar(String input) {
        Map<Character, Integer> countLetter = new HashMap<>();
        char letter = '\u0000';
        for (char ch : input.toCharArray()) {
            countLetter.put(ch, countLetter.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : countLetter.entrySet()) {
            if (entry.getValue() == 1) {
                letter = entry.getKey();
                break;
            }
        }
        return letter;
    }

    // Task 17:
    public static List<List<String>> getAnagrams(List<String> words) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!anagramGroups.containsKey(key)) {
                anagramGroups.put(key, new ArrayList<>());
            }
            anagramGroups.get(key).add(word);
        }
        return new ArrayList<>(anagramGroups.values());
    }

    // Task 18:
    public static String getFrequentWord(List<String> list) {
        Map<String, Integer> wordsFrequent = new HashMap<>();
        for (String word : list) {
            wordsFrequent.put(word, wordsFrequent.getOrDefault(word, 0) + 1);
        }
        int max = 0;
        String frequentWord = "";
        for (Map.Entry<String, Integer> entry : wordsFrequent.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                frequentWord = entry.getKey();
            }
        }
        return frequentWord;
    }

    // Task 19;
    public static List<Integer> getDuplicateNumbers(List<Integer> list) {
        Map<Integer, Integer> numbersFrequent = new HashMap<>();
        List<Integer> duplicatedNumbers = new ArrayList<>();
        for (Integer number : list) {
            numbersFrequent.put(number, numbersFrequent.getOrDefault(number, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : numbersFrequent.entrySet()) {
            if (entry.getValue() > 1) {
                duplicatedNumbers.add(entry.getKey());
            }
        }
        return duplicatedNumbers;
    }

    // Task 20:
    public static boolean isSameElements(List<Integer> list1, List<Integer> list2) {
        Map<Integer, Integer> list1Frequent = new HashMap<>();
        Map<Integer, Integer> list2Frequent = new HashMap<>();
        for (int number : list1) {
            list1Frequent.put(number, list1Frequent.getOrDefault(number, 0) + 1);
        }
        for (int number : list2) {
            list2Frequent.put(number, list2Frequent.getOrDefault(number, 0) + 1);
        }
        return list1Frequent.equals(list2Frequent) ? true : false;
    }

    // Task 21:
    public static int getChangeLetters(String input) {
        int mergeFrequent = 0;
        int maxFrequent = 0;
        Map<Character, Integer> letterFrequent = new HashMap<>();
        for (char ch : input.toCharArray()) {
            letterFrequent.put(ch, letterFrequent.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : letterFrequent.entrySet()) {
            mergeFrequent += entry.getValue();
            if (entry.getValue() > maxFrequent) {
                maxFrequent = entry.getValue();
            }
        }
        return mergeFrequent - maxFrequent;
    }

    // Task 22:
    public static List<Integer> getNumbersOnce(List<Integer> list) {
        Map<Integer, Integer> numbersFrequent = new HashMap<>();
        List<Integer> numbers = new ArrayList<>();
        for (int number : list) {
            numbersFrequent.put(number, numbersFrequent.getOrDefault(number, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : numbersFrequent.entrySet()) {
            if (entry.getValue() == 1) {
                numbers.add(entry.getKey());
            }
        }
        return numbers;
    }

    // Task 23:
    public static Map<Integer, Integer> getGroupNumbers(List<Integer> list) {
        Map<Integer, Integer> numbersFrequent = new HashMap<>();
        for (int number : list) {
            numbersFrequent.put(number, numbersFrequent.getOrDefault(number, 0) + 1);
        }
        return numbersFrequent;
    }

    // Task 24:
    public static Map<Integer, List<String>> getNewMap(Map<String, Integer> list) {
        Map<Integer, List<String>> invert = new HashMap<>();
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            if (!invert.containsKey(entry.getValue())) {
                invert.put(entry.getValue(), new ArrayList<>());
            }
            invert.get(entry.getValue()).add(entry.getKey());
        }
        return invert;
    }

    // Extra Tasks:
    // Task 1:
    public static Set<String> getWebsiteVisited(List<String> list) {
        Set<String> website = new LinkedHashSet<>();
        for (String page : list) {
            website.add(page);
        }
        return website;
    }

    // Task 2:
    public static TreeSet<String> getNameList(List<String> list) {
        TreeSet<String> names = new TreeSet<>();
        for (String name : list) {
            names.add(name);
        }
        return names;
    }

    // Task 3:
    public static Map<String, Integer> getNamesAndScores(List<String> list1, List<Integer> list2) {
        Map<String, Integer> playersAndScores = new TreeMap<>();
        for (int i = 0; i < list1.size(); i++) {
            playersAndScores.put(list1.get(i), list2.get(i));
        }
        return playersAndScores;
    }

    // Task 4:
    public static Map<String, Integer> getCitiesTemperature(List<String> list1, List<Integer> list2) {
        Map<String, Integer> citiesTemperature = new LinkedHashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            citiesTemperature.put(list1.get(i), list2.get(i));
        }
        return citiesTemperature;
    }

    // Task 5:
    public static Map<String, Integer> countHashtag(List<String> input) {
        Map<String, Integer> hashtags = new LinkedHashMap<>();
        for (String post : input) {
            for (String word : post.split("\\s+")) {
                if (word.startsWith("#")) {
                    hashtags.put(word, hashtags.getOrDefault(word, 0) + 1);
                }
            }
        }
        return hashtags;
    }

    // Task 6:
    public static Set<String> getTags(List<String> input) {
        Set<String> tags = new TreeSet<>();
        tags.addAll(input);
        return tags;
    }

    // Task 7:
    public static Set<String> getStudentList(List<String> list) {
        Set<String> students = new LinkedHashSet<>();
        students.addAll(list);
        return students;
    }

    // Task 8:
    public static Map<String, String> getContactList(List<String> list1, List<String> list2) {
        Map<String, String> contactList = new TreeMap<>();
        for (int i = 0; i < list1.size(); i++) {
            contactList.put(list1.get(i), list2.get(i));
        }
        return contactList;
    }

    // Task 9:
    public static Map<String, Integer> getCustomerPoint(List<String> list1, List<Integer> list2) {
        Map<String, Integer> customersPoint = new LinkedHashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            customersPoint.put(list1.get(i), list2.get(i));
        }
        return customersPoint;
    }

    // Task 10:
    public static Map<String, Integer> getProductsQuantity(List<String> list1, List<Integer> list2) {
        Map<String, Integer> products = new TreeMap<>();
        for (int i = 0; i < list1.size(); i++) {
            products.put(list1.get(i), list2.get(i));
        }
        return products;
    }
}