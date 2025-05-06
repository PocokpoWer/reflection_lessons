import java.util.Arrays;
import java.util.Scanner;

public class LargeTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 2:");
        int userInputOfTaskTwo = scanner.nextInt();
        while (!isNumberOfTwoTask(userInputOfTaskTwo)) {
            userInputOfTaskTwo = scanner.nextInt();
        }
        int[] perfectSquaresNumbers = generatePerfectSquares(userInputOfTaskTwo);
        System.out.println(sumPerfectSquares(perfectSquaresNumbers));

        System.out.println("Task 3:");
        System.out.println("How many element do you ask from the Tribonacci sequence ?");
        int elements = scanner.nextInt();

        System.out.println("Please enter three numbers: ");
        int[] tribonacciNumbers = askNumbers(elements);
        System.out.println(Arrays.toString(generateTribonacciNumbers(tribonacciNumbers)));
        scanner.close();
    }

    // Task 2: Ask the user to enter a number between 50 and 10000.
    // Generate all perfect squares less than that number and return
    // the sum of every 5th one. Include unit tests for input validation
    // and square generation.
    //Examples:
    //Input: 100 → Output: 25, because the list is going to be:
    // [1, 4, 9, 16, 25, 36, 49, 64, 81] and the sum of every 5th value is 25
    //Input: 500 → Output: 750, because the list is going to be:
    // [1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484]
    // and the sum of every 5th value is 25+100+225+400 = 750.
    public static boolean isNumberOfTwoTask(int input) {
        return input > 50 && input < 10_000;
    }

    public static int countPerfectSquaresElements(int number) {
        int counter = 0;
        for (int i = 0; i < number; i++) {
            int result = 0;
            for (int j = 1; j <= i + 1; j++) {
                result = j * j;
            }
            if (result < number) {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

    public static int[] generatePerfectSquares(int number) {
        int[] perfectSquares = new int[countPerfectSquaresElements(number)];
        for (int i = 0; i < number; i++) {
            int result = 0;
            for (int j = 1; j <= i + 1; j++) {
                result = j * j;
            }
            if (result < number) {
                perfectSquares[i] = result;
            } else {
                break;
            }
        }
        return perfectSquares;
    }

    public static int sumPerfectSquares(int[] array) {
        int result = 0;
        for (int i = 4; i < array.length; i += 5) {
            result += array[i];
        }
        return result;
    }

    // Task 3: Ask 3 numbers from the user and create the first 10 elements
    // of the Tribonacci-sequence, starting with those 3 numbers.
    // A Tribonacci-sequence is a sequence where the first 3 elements are given
    // and each subsequent element is the sum of the previous three elements.
    //Write unit tests for your Tribonacci-generation
    //Examples:
    //Input: 0, 0, 1 → Output: 0, 0, 1, 1, 2, 4, 7, 13, 24, 44
    //Input: 1, 1, 1 → Output: 1, 1, 1, 3, 5, 9, 17, 31, 57, 105
    public static int[] askNumbers(int elementNumber) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[elementNumber];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static int[] generateTribonacciNumbers(int[] array) {
        for (int i = 0, j = 1, k = 2, l = 3; l < array.length; i++, j++, k++, l++) {
            array[l] = array[i] + array[j] + array[k];
        }
        return array;
    }
}
