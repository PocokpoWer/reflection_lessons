import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMistake = 0;
        int userInput;
        do {
            System.out.println("Please enter a number between 5 and 15 000:");
            userInput = scanner.nextInt();
            countMistake++;
        } while (!isValid(userInput) && countMistake < 3);
        while (!isValid(userInput) && countMistake <= 5) {
            System.out.println("Invalid input. Please enter a number between 5 and 15000 (inclusive). For example: 5, 120, 9999.");
            userInput = scanner.nextInt();
            countMistake++;
        }
        while (!isValid(userInput) && countMistake <= 9) {
            System.out.println("You've entered an invalid number too many times.\nPlease enter a valid number between 5 and 15000.\nExamples of valid inputs: 5, 123, 5000, 14999, 15000.");
            userInput = scanner.nextInt();
            countMistake++;
        }
        if (countMistake == 10) {
            System.out.println("Bye bye!");
            System.exit(1);
        }
        double reciprocalSum = 0;
        double piSquaredOver6 = Math.PI * Math.PI / 6;
        for (double i = 1; i <= userInput; i++) {
            reciprocalSum += 1 / (i * i);
        }
        System.out.println("User-specified value: " + reciprocalSum);
        System.out.println("Endless value: " + piSquaredOver6);
        double difference = piSquaredOver6 - reciprocalSum;
        System.out.println("Difference : " + difference);

        double userDiff = Math.abs(reciprocalSum - piSquaredOver6);
        double minDiff = Double.MAX_VALUE;
        double maxDiff = 0;

        for (int i = 5; i <= 15000; i++) {
            double sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += 1.0 / (j * j);
            }
            double diff = Math.abs(sum - piSquaredOver6);

            if (diff < minDiff) {
                minDiff = diff;
            }

            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }

        double epsilon = 1e-10;

        if (Math.abs(userDiff - minDiff) < epsilon) {
            System.out.println("The result you calculated is the closest to the correct value.");
        } else if (Math.abs(userDiff - maxDiff) < epsilon) {
            System.out.println("The result you calculated is the farthest from the correct value.");
        } else {
            System.out.println("The result you calculated is neither the closest nor the farthest from the correct value.");
        }

        List<Integer> divisorNumbers = new ArrayList<>();
        for (int i = userInput; i > 0; i--) {
            if (i % 2000 == 0) {
                divisorNumbers.add(i);
            }
        }
        if (divisorNumbers.isEmpty()) {
            System.out.println("Bye bye");
        } else {
            System.out.println("Bye bye!");
            System.out.println("These values between number and 0 divisible by 2000:\n" + divisorNumbers);
        }
    }

    public static boolean isValid(int number) {
        return number >= 5 && number <= 15_000;
    }
}
