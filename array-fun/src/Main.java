import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        int[] arrayOfTask1 = {4, 4, 5, 3, 3, 4, 4, 2};
        System.out.println(calculateAverage(arrayOfTask1));

        System.out.println("Task 2:");
        int[] arrayOfTask2 = {3, 6, 7, 10, 0};
        System.out.println(Arrays.toString(getNumbersSquare(arrayOfTask2)));

        System.out.println("Task 3:");
        String[] arrayOfTask3 = {"Tibor", "Anna", "Gábor", "Aladár", "antal"};
        System.out.println(Arrays.toString(findLetterWithA(arrayOfTask3)));

        System.out.println("Task 4:");
        String[] arrayOfTask4 = {"Kecske", "Hat", "Madár", "luk"};
        System.out.println(concatenationStrings(arrayOfTask4));

        System.out.println("Task 5:");
        int[] arrayOfTask5 = {2, 4, 4, 5, 7};
        System.out.println(isDuplicates(arrayOfTask5));

        System.out.println("Task 6: ");
        String[][] arrayOfTask6 = {{"Valami", "Akarmi"}, {"Tibor", "Kriszta"}};
        System.out.println(getVowelsNumber(arrayOfTask6));

        System.out.println("Task 7:");
        String[][] arrayOfTask7 = {
                {"apple", "banana", "cherry"},
                {"dog", "elephant", "cat"},
                {"sun", "moon"}
        };
        System.out.println(getLongestStringNumber(arrayOfTask7));

        System.out.println("Task 8:");
        String[][] arrayOfTask8 = {
                {"hello", "world"},
                {"java", "code"},
                {"flatten", "array"}
        };
        System.out.println(Arrays.toString(convert2dArrayTo1D(arrayOfTask8)));

        System.out.println("Task 9:");
        String[][] arrayOfTask9 = {
                {"apple", "banana1", "cherry"},
                {"dog2", "elephant", "cat3"},
                {"sun", "moon4", "star"}
        };
        System.out.println(Arrays.deepToString(isNumberContain(arrayOfTask9)));

        System.out.println("Task 10: ");
        String[][] arrayOfTask10 = {
                {"hello", "world"},
                {"Java", "is", "fun"}
        };
        System.out.println(calculateAverageStringLength(arrayOfTask10));
    }

    // Task 1: Return the average of all even numbers in an array of integers.
    public static double calculateAverage(int[] numbers) {
        int elementCounter = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
                elementCounter++;
            }
        }
        return (double) sum / elementCounter;
    }

    // Task 2: Return a new array with each number squared only if the original number was odd.
    public static int calculateArraySize(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] getNumbersSquare(int[] array) {
        int resultIndex = 0;
        int[] result = new int[calculateArraySize(array)];
        for (int j : array) {
            if (j % 2 != 0 && j != 0) {
                result[resultIndex++] = (int) Math.pow(j, 2);
            }
        }
        return result;
    }

    // Task 3: Return the number of strings that start with the letter "a" or "A".
    public static int calculateArraySizeWithA(String[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == 'a' || array[i].charAt(0) == 'A') {
                counter++;
            }
        }
        return counter;
    }

    public static int[] findLetterWithA(String[] array) {
        int[] numberOfStrings = new int[calculateArraySizeWithA(array)];
        int numberOfStringIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == 'a' || array[i].charAt(0) == 'A') {
                numberOfStrings[numberOfStringIndex] = i;
                numberOfStringIndex++;
            }
        }
        return numberOfStrings;
    }

    // Task 4: Return the concatenation of all strings that are longer than 3 characters.
    public static String concatenationStrings(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < 4 && !array[i].isEmpty()) {
                sb.append(array[i]);
            }
        }
        return sb.toString();
    }

    // Task 5: Return true if the array of integers contains any consecutive duplicates.
    public static boolean isDuplicates(int[] array) {
        boolean isTrue = false;
        for (int i = 1, j = 0; i < array.length; i++, j++) {
            Integer temporaryNumber = array[j];
            if (temporaryNumber.equals(array[i])) {
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }

    // Task 6: Return the total number of vowels in a 2D array of strings.
    // (you don’t have to consider non-English vowels, only a, e, i, o and u).
    public static int getVowelsNumber(String[][] array) {
        int vowelCounter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length(); k++) {
                    if (array[i][j].toLowerCase().charAt(k) == 'a' || array[i][j].charAt(k) == 'e' || array[i][j].charAt(k) == 'i' || array[i][j].charAt(k) == 'o' || array[i][j].charAt(k) == 'u') {
                        vowelCounter++;
                    }
                }
            }
        }
        return vowelCounter;
    }

    // Task 7: Return the sum of the lengths of the longest string from each row (subarray).

    public static int getLongestStringNumber(String[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            int temporaryNumber = array[i][0].length();
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].length() > temporaryNumber) {
                    temporaryNumber = array[i][j].length();
                }
            }
            result += temporaryNumber;
        }
        return result;
    }

    // task 8: Return a one-dimensional (in other words: flattened) array of all strings in uppercase.
    public static int calculate2DArraySize(String[][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                counter++;
            }
        }
        return counter;
    }

    public static String[] convert2dArrayTo1D(String[][] array) {
        String[] flattened = new String[calculate2DArraySize(array)];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                flattened[k++] = array[i][j].toUpperCase();
            }
        }
        return flattened;
    }

    // task 9: Return a new 2D array of booleans where each element
    // is true if the corresponding string contains a digit.
    public static boolean[][] isNumberContain(String[][] array) {
        boolean[][] isNumber = new boolean[array.length][];
        for (int i = 0; i < array.length; i++) {
            isNumber[i] = new boolean[array[i].length];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length(); k++) {
                    char letter = array[i][j].charAt(k);
                    if (Character.isDigit(letter)) {
                        isNumber[i][j] = true;
                    }
                }
            }
        }
        return isNumber;
    }

    // Task 10: Return the average number of characters per string across all elements
    public static double calculateAverageStringLength(String[][] input) {
        int elementCounter = 0;
        int sumStringLengths = 0;
        for (String[] strings : input) {
            for (String string : strings) {
                sumStringLengths += string.length();
                elementCounter++;
            }
        }
        return (double) sumStringLengths / elementCounter;
    }
}