import java.util.Arrays;
import java.util.Scanner;

public class SmallTasks {
    public static void main(String[] args) {
        // Task 1: Write a program that asks 5 numbers from
        // the user and prints to the console whether
        // they are perfect squares AND even numbers or not.

        // Example: 5 6 25 36 10 -> false false false true false
        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[5];
        boolean[] numbers = new boolean[5];
        System.out.println("Task 1:\nPlease write five number: ");
        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < userNumbers.length; i++) {
            double squareNumber = Math.sqrt(userNumbers[i]);
            if (squareNumber % 1 == 0 && squareNumber % 2 == 0) {
                numbers[i] = true;
            }
        }
        System.out.println(Arrays.toString(numbers) + "\n");

        //Task 2: Write a program that asks the user
        // to enter 6 numbers, then prints the square root
        // of the difference between the largest and smallest number.
        //Example:
        //Input: 5 12 3 6 8 9 → Output: √(12 - 3) = 3.0
        int[] userInput = new int[6];
        System.out.println("Task 2:\nPlease write six number: ");
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = scanner.nextInt();
        }
        int min = userInput[0];
        int max = userInput[0];
        for (int j : userInput) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        double result = Math.sqrt(max - min);
        System.out.println(result + "\n");

        scanner.close();
    }
}
