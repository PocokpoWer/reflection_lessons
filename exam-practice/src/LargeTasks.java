import java.util.Arrays;
import java.util.Scanner;

public class LargeTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task 1:");
        System.out.println("Enter a number: ");
        int userNumber = scanner.nextInt();
        while (!isValid(userNumber)) {
            userNumber = scanner.nextInt();
        }

        int[] factorialsNumbers = generateFactorials(userNumber);
        System.out.println(sumFactorials(factorialsNumbers, userNumber));
        scanner.close();
    }

    // Task 1: Ask the user for a number between 20 and 1,000,000.
    // Keep asking the user for the number while the value is invalid.
    // Generate the list of factorial values less than the number,
    // and return the sum of every second factorial. Include tests
    // for input and factorial logic. Test all your methods properly.
    public static boolean isValid(int input) {
        return input > 20 && input < 1_000_000;
    }

    public static int countArrayElements(int number) {
        int counter = 0;
        for (int i = 1; i <= 9; i++) { // This nine because the task ask number between 20 and 1_000_000.
            int result = 1;
            for (int j = 1; j <= i; j++) {
                result *= j;
            }
            if (result < number) {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

    public static int[] generateFactorials(int number) {
        int[] factorials = new int[countArrayElements(number)];
        for (int i = 1; i <= factorials.length; i++) {
            int result = 1;
            for (int j = 1; j <= i; j++) {
                result *= j;
            }
            if (result < number) {
                factorials[i - 1] = result;
            } else {
                break;
            }
        }
        return factorials;
    }

    public static int sumFactorials(int[] array, int number) {
        int result = 0;
        for (int i = 1; i < array.length; i += 2) {
            result += array[i];
        }
        return result;
    }
}
