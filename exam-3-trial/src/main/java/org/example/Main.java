package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) throws NoMajorityElementException {
        System.out.println("Task 1:");
        List<Integer> listOfTest = List.of(20, 50, 20, 1000000, -2, -50, 7, 10, -2);
        removeDuplications(listOfTest).forEach(System.out::println);

        System.out.println("Task 2:");
        String test = "aaabb";
        System.out.println(removeElement(test));

    }

    // Task 1:
    static List<Integer> removeDuplications(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        list.forEach(number -> {
            if (set.add(number)) {
                result.add(number);
            }
        });
        return result;
    }

    // Task 2:
    static Character removeElement(String input) throws NoMajorityElementException {
        int limit = input.length() / 2;
        Map<Character, Integer> sum = new HashMap<>();
        for (char c : input.toCharArray()) {
            sum.put(c, sum.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : sum.entrySet()) {
            int count = entry.getValue();
            if (count > limit) {
                return entry.getKey();
            }
        }
        throw new NoMajorityElementException("No element");
    }
}