import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    // Task 1:
    public static boolean isGreaterThanFifty(int number) {
        return number > 50;
    }

    //Task 2:
    public static int getGreaterNumber(int a, int b) {
        return Math.max(a, b);
    }

    // Task 3:
    public static String decideGreaterNumber(int a, int b) {
        return a > b ? "The First number is greater" : b > a ? "The second number is greater" : "The two numbers are equal";
    }

    // Task 4:
    public static void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    // Task 5:
    public static void doDivison(int input) {
        for (int i = 1; i <= input; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Task 6:
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }

    // Task 7:
    public static boolean doDivisonEachOther(int first, int second) {
        return first % second == 0;
    }

    // Task 8:
    public static boolean isProdEqualTo(int a, int b, int c) {
        return a * b == c;
    }

    // Task 9:
    public static int[] printCubicNumbers(int number) {
        int[] result = new int[number];
        for (int i = 0; i < number; i++) {
            result[i] = (int) Math.pow((i + 1), 3);
        }
        return result;
    }

    // Task 10:
    public static void printToCubicNumbers(int number) {
        int i = 1;
        int cubicNumber = 0;
        while (cubicNumber < number) {
            cubicNumber = (int) Math.pow(i, 3);
            i++;
            System.out.print(cubicNumber + ",");
        }
    }

    // Task 11:
    public static void doSumTwoDifferentNumber(int[] array, int number) {
        int temporaryNumber = 0;
        boolean isTrue = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                temporaryNumber = array[i] + array[j];
                if (temporaryNumber == number) {
                    System.out.println("The number with index " + i + " and " + j + " is equal to the specified value.");
                    isTrue = true;
                }
            }
        }
        if (!isTrue) {
            System.out.println("I didn't find any numbers that are equal to the given value.");
        }
    }

    // Task 12:
    public static void printTextRepeat(String text, int number) {
        if (number < 1) {
            System.out.println("");
        } else {
            for (int i = 0; i < number; i++) {
                System.out.println(text);
            }
        }
    }

    // Task 13:
    public static String concatenateTexts(String[] textArray) {
        StringBuilder text = new StringBuilder();
        for (String s : textArray) {
            text.append(s);
        }
        return text.toString();
    }

    // Task 14:
    public static int doSumAllNumber(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    // Task 15:
    public static int[] sumOneDimension(int[][] array) {
        int sum = 0;
        int[] oneDimension = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            oneDimension[i] = sum;
            sum = 0;
        }
        return oneDimension;
    }

    // Task 16:
    public static int sumDiagonal(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }

    // Task 17:
    public static int sumDiagonalDifference(int[][] array) {
        // Main diagonal
        int sum = sumDiagonal(array);

        // Other diagonal
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i][array.length - 1 - i];
        }
        return sum - sum2;
    }

    public static void main(String[] args) {
    }
}