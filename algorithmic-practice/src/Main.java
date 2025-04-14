import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        System.out.println(findGreatestCommonDivisor(1000, 650));

        System.out.println("Task 2:");
        int number = 5641;
        System.out.println(Arrays.toString(separateNumbers(number)));

        System.out.println("Task 3:");
        System.out.println(changeNumberReversed("aabcccccaaa"));

        System.out.println("Task 4:");
        System.out.println(isPalindrome("racecar"));
    }

    // Task 1: Takes in 2 numbers and returns their greatest common divisor.
    public static int findGreatestCommonDivisor(int a, int b) {
        int result = 0;
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

    // Task 2: Takes in a number and returns a new number that contains
    // the digits of the original number in reversed order.
    // The sign of the number should be preserved.
    public static int countDigits(int number) {
        int counter = 0;
        while (number > 0) {
            int temporaryNumber = number % 10;
            number /= 10;
            counter++;
        }
        return counter;
    }

    public static int[] separateNumbers(int number) {
        int index = 0;
        int[] numberArray = new int[countDigits(number)];
        while (number > 0) {
            numberArray[index] = number % 10;
            number /= 10;
            index++;
        }
        return numberArray;
    }

    // Task 3: Takes in a String like "aabcccccaaa", return a compressed version like "a2b1c5a3".
    public static String changeNumberReversed(String input) {
        StringBuilder str = new StringBuilder();
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                counter++;
            } else {
                str.append(input.charAt(i - 1)).append(counter);
                counter = 1;
            }
        }
        str.append(input.charAt(input.length() - 1)).append(counter);
        return str.toString();
    }

    // Task 4: Takes in a String and returns whether it is palindrome.
    public static boolean isPalindrome(String input) {
        StringBuilder str = new StringBuilder();
        str.append(input);
        return str.reverse().toString().equals(input);
    }
}