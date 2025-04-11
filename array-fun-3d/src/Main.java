import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 11: ");
        String[][][] arrayOfTask11 = {
                {
                        {"hello", "level"}, {"apple", "dog"}
                },
                {
                        {"madam", "racecar"}, {"jump", "banane"}
                },
                {
                        {"refer", "noon"}, {"rotor", "mother"}
                }
        };
        System.out.println(countPalindromeElements(arrayOfTask11));

        System.out.println("Task 12: ");
        String[][][] arrayOfTask12 = {
                {
                        {"apple", "banana", "cherry", "car"},
                        {"dog", "elephant", "fish", "computer", "cat"}
                },
                {
                        {"grape", "house", "island"},
                        {}
                }
        };
        System.out.println(Arrays.toString(countOneRowElement(arrayOfTask12)));

        System.out.println("Task 13: ");
        String[][][] arrayOfTask13 = {
                {
                        {"orange", "b", "number", "a"},
                        {"dog", "mouse", "fish", "computer", "cat"}
                },
                {
                        {"vegetarian", "f", "shop"},
                        {"t", "paragliding"}
                }
        };
        System.out.println(concatenateAllString(arrayOfTask13));
        System.out.println("It's need to my test: " + concatenateAllString(arrayOfTask13).length());

        System.out.println("Task 14:");
        String[][][] arrayOfTask14 = {
                {
                        {"hi", "sun", "galaxy"},
                        {"apple", "kiwi", "pineapple"}
                },
                {
                        {"zebra", "lion"},
                        {"elephant", "dolphin", "hippopotamus"}
                },
                {
                        {"ok", "x", "toolongwordforthistest"},
                        {"yes", "no"}
                }
        };
        System.out.println(sumMaximumStringLength(arrayOfTask14));

        System.out.println("Task 15:");
        String[][][] arrayOfTask15 = {
                {
                        {"cats", "dog", "rabbit"},
                        {"birds", "plane", "bus"}
                },
                {
                        {"trees", "leaf", "branches"},
                        {"books", "pen", "notes"}
                },
                {
                        {"ball", "bat", "gloves"},
                        {"shoes", "socks", "shirt"}
                }
        };
        System.out.println(isTrueIFStringEndS(arrayOfTask15));

    }

    // Task 11: Return the number of strings that are palindromes
    // (same forward and backward - for example: “racecar” is read
    // the same way if you read it from forward and backward).
    public static int countPalindromeElements(String[][][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    StringBuilder temporaryWord = new StringBuilder();
                    for (int l = array[i][j][k].length() - 1; l >= 0; l--) {
                        temporaryWord.append(array[i][j][k].charAt(l));
                    }
                    if (Objects.equals(array[i][j][k], temporaryWord.toString())) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    // Task 12: Return a 1D array of integers representing
    // the number of strings in each sub-subarray (3rd level).
    public static int[] countOneRowElement(String[][][] array) {
        int arraySize = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arraySize++;
            }
        }
        int index = 0;
        int[] result = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int counter = 0;
                for (int k = 0; k < array[i][j].length; k++) {
                    if (!array[i][j][k].isEmpty()) {
                        counter++;
                    }
                }
                result[index++] = counter;
            }
        }
        return result;
    }

    // Task 13: Return the concatenation of all strings,
    // but skip strings shorter than 2 characters.
    public static String concatenateAllString(String[][][] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k].length() >= 2) {
                        result += array[i][j][k];
                    }
                }
            }
        }
        return result;
    }

    // Task 14: Return the maximum length of a string in the entire 3D array.
    public static int sumMaximumStringLength(String[][][] array) {
        int result = array[0][0].length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k].length() > result) {
                        result = array[i][j][k].length();
                    }
                }
            }
        }
        return result;
    }

    //Task 15: Return true if every subarray (3rd level)
    //contains at least one string that ends with "s".
    public static boolean isTrueIFStringEndS(String[][][] array) {
        int arraySize = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arraySize++;
            }
        }

        boolean[] arr = new boolean[arraySize];
        int counter = 0;
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k].toLowerCase().charAt(array[i][j][k].length() - 1) == 's') {
                        arr[counter] = true;
                        counter++;
                        break;
                    }
                }
            }
        }
        for (int i = 1; i < arr.length; i++) {
            result &= arr[i];
        }
        return result;
    }
}