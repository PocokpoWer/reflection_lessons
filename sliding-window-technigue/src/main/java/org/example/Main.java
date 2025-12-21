package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        int[] arrayOfTask1 = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(findMaxSumSubarray(arrayOfTask1, k));

        System.out.println("Task 2:");
        int[] arrayOfTask2 = {2, 1, 5, 2, 3, 2};
        int s = 7;
        System.out.println(findSmallestSubarrayWithSum(arrayOfTask2, s));

        System.out.println("Task 3:");
        String arrayOfTask3 = "abcabcbb";
        System.out.println(findLongestUniqueSubstring(arrayOfTask3));
    }

    // Task 1:
    public static int findMaxSumSubarray(int[] array, int k) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            sum += array[i];
        }
        maxSum = sum;
        for (int i = k; i < array.length; i++) {
            sum += array[i] - array[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    // Task2:
    public static int findSmallestSubarrayWithSum(int[] array, int s) {
        int n = array.length;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += array[right];
            while (sum >= s) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= array[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : (minLen);
    }

    // Task 3:
    public static int findLongestUniqueSubstring(String input) {
        int countLetter = 0;
        Set<Character> seen = new HashSet<>();
        int left = 0, right = 0;
        while (right < input.length()) {
            char rightChar = input.charAt(right);
            if (!seen.contains(rightChar)) {
                seen.add(rightChar);
                right++;
                countLetter = Math.max(countLetter, right - left);
            } else {
                seen.remove(input.charAt(left));
                left++;
            }
        }
        return countLetter;
    }
}