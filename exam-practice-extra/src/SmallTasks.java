import java.util.Scanner;

public class SmallTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Task 3: Write a program that asks for 6 numbers and prints the result of:
        //(sum of the even numbers) - (sum of the odd numbers)
        //Example:
        //Input: 2 3 4 5 6 7 → Output: 12 - 15 = -3
        System.out.println("Task 3:\nPlease write six number: ");
        int[] numbersFromUser = new int[6];
        int evenNumbers = 0;
        int oddNumbers = 0;
        for (int i = 0; i < numbersFromUser.length; i++) {
            numbersFromUser[i] = scanner.nextInt();
            // Because of Big o.
            if (numbersFromUser[i] % 2 == 0) {
                evenNumbers += numbersFromUser[i];
            }
            if (numbersFromUser[i] % 2 == 1) {
                oddNumbers += numbersFromUser[i];
            }
        }
        System.out.println(evenNumbers - oddNumbers + "\n");

        // Task 4: Write a method that takes in an array
        // and returns the maximum difference between any two numbers.
        //Example:
        //Input: [3, -7, 1] → Output: 10 (difference between -7 and 3)
        //Input: [6, 1, 4]--> Output: 5 (difference between 1 and 6)
        int[] arrayOfTaskFour = {3, -7, 1};
        System.out.println(calcDifferent(arrayOfTaskFour));
        scanner.close();
    }

    public static int calcDifferent(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return max - min;
    }
}
