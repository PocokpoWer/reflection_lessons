import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    // Task 1:
    public static boolean isGreaterThanFifty(int number) {
        return number > 50;
    }

    //Task 2:
    public static int numberIsGreater(int a, int b) {
        return Math.max(a, b);
    }

    // Task 3:
    public static String whichIsGreater(int a, int b) {
        return a > b ? "The First number is greater" : b > a ? "The second number is greater" : "The two numbers are equal";
    }

    // Task 4:
    public static void writeNumbers() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }

    // Task 5:
    public static void divisonWithFive(int input) {
        for (int i = 1; i <= input; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Task 6:
    public static boolean isPrime(int a) {

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return a == 0 ? false : true;
    }

    // Task 7:
    public static boolean isDivisonEachOther(int first, int second) {
        return first % second == 0;
    }

    // Task 8:
    public static boolean isResultEqual(int a, int b, int c) {
        return a * b == c;
    }

    // Task 9:
    public static int[] cubicNumbers(int number) {
        int[] result = new int[number];
        for (int i = 0; i < number; i++) {
            result[i] = (int) Math.pow((i + 1), 3);
        }
        return result;
    }

    // Task 10:
    public static int[] toCubicNumbers(int number) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < number; i++) {
            result.add((int) Math.pow((i + 1), 3));
            if (result.get(i) == number) {
                break;
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    // Task 11:
    public static boolean hasSumValue(int[] array, int number) {
        int temporaryNumber = 0;
        int firstIndexOfArray = array[0];
        boolean isTrue = false;
        for (int i = 1; i < array.length; i++) {
            temporaryNumber = Integer.sum(firstIndexOfArray, array[i]);
            if (temporaryNumber == number) {
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }

    // Task 12:
    public static void textRepeat(String text, int number) {
        if (number < 1) {
            System.out.println("");
        } else {
            for (int i = 0; i < number; i++) {
                System.out.println(text);
            }
        }
    }

    // Task 13:
    public static String textConcatenates(String[] textArray) {
        String text = "";
        for (int i = 0; i < textArray.length; i++) {
            text += textArray[i];
        }
        return text;
    }

    // Task 14:
    public static int sumAllNumber(int[][] array) {
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
            oneDimension[i] += sum;
            sum = 0;
        }
        return oneDimension;
    }

    // Task 16:
    public static int sumDiagonal(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    // Task 17:
    public static int sumDiagonalDifference(int[][] array) {
        // Main diagonal
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        // Other diagonal
        int increaseIndex = 0;
        int descendingIndex = array[increaseIndex].length - 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                if (i == increaseIndex && j == descendingIndex) {
                    sum2 += array[i][j];
                    descendingIndex--;
                    increaseIndex++;
                }
            }
        }
        return sum - sum2;
    }

    public static void main(String[] args) {
    }
}