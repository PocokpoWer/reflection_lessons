import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = scanner.nextInt();
        while (userInput < 2) {
            System.out.println("Please enter a number: ");
            userInput = scanner.nextInt();
        }
        List<Integer> arrayOfTaskFour = getDivisorNumber(userInput);
        int result = 0;
        for (int current : arrayOfTaskFour) {
            if (isPrimNumber(current) && current > result) {
                result = current;
            }
        }
        int greatestDivisor = arrayOfTaskFour.getLast();
        if (result != 0) {
            System.out.println(result);
        } else {
            System.out.println("There are no primes among the numbers.");
            for (int i = greatestDivisor; i <= userInput; i++) {
                if (isPrimNumber(i)) {
                    System.out.println(i);
                    break;
                }
            }
            for (int i = greatestDivisor; i >= 0; i--) {
                if (isPrimNumber(i)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    public static boolean isPrimNumber(int number) {
        if (number == 2 || number == 3 || number == 5) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
            return false;
        }
        for (int i = 7; i < Math.sqrt(number); i += 4) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return number > 1;
    }

    public static List<Integer> getDivisorNumber(int number) {
        List<Integer> divisorNumbers = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisorNumbers.add(i);
            }
        }
        return divisorNumbers;
    }
}
