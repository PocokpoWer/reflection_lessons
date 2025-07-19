import java.util.*;

public class CfTasks {
    // Task 1:
    public static List<Integer> getIntersectionNumbers(List<Integer> listOne, List<Integer> listTwo) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < listOne.size(); i++) {
            for (int j = 0; j < listTwo.size(); j++) {
                if (listOne.get(i).equals(listTwo.get(j))) {
                    result.add(listTwo.get(j));
                }
            }
        }
        return result;
    }

    // Task 2:
    public static List<String> getWordReverse(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            result.add(stringBuilder.append(word).reverse().toString());
        }
        return result;
    }

    // Task 3:
    public static List<String> getPalindrome(List<String> words) {
        List<String> palindromes = new ArrayList<>();
        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            if (word.equals(stringBuilder.append(word).reverse().toString())) {
                palindromes.add(word);
            }
        }
        return palindromes;
    }

    // Task 4:
    public static String getUniqueLetters(String input) {
        Set<Character> addLetters = new LinkedHashSet<>();
        for (int i = 0; i < input.length(); i++) {
            addLetters.add(input.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : addLetters) {
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

    // Task 5:
    public static List<Integer> getDuplicationNumbers(List<Integer> input) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicatesNumbers = new LinkedHashSet<>();

        for (int number : input) {
            if (!seen.add(number)) {
                duplicatesNumbers.add(number);
            }
        }
        return new ArrayList<>(duplicatesNumbers);
    }

    // Task 6:
    public static int filterDuplicationNumber(List<Integer> list1, List<Integer> list2) {
        int result = 0;
        Set<Integer> sortList1 = new LinkedHashSet<>(list1);
        Set<Integer> sortList2 = new LinkedHashSet<>(list2);
        if (sortList1.size() > sortList2.size()) {
            result = 1;
        } else if (sortList1.size() < sortList2.size()) {
            result = 2;
        }
        return result;
    }
}
