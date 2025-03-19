import java.util.Scanner;

public class Main {
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }

    public static void printPrimeNumber(int userInput) {
        if (userInput == -1) {
            System.exit(2);
        }
        for (int i = 2; i <= userInput; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printSquareNumber(int userInput) {
        if (userInput == -1) {
            System.exit(2);
        }
        for (int i = 1; i <= userInput; i++) {
            System.out.print(i * i + " ");
        }
    }

    public static boolean isValidBetweenTwoAndTwoBillion(int number) {
        return number >= 2 && number <= 2_000_000_000;
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int attempt = 0;
        while (attempt < 5) {
            System.out.println("Write a number: ");
            userInput = scanner.nextInt();
            if (!isValidBetweenTwoAndTwoBillion(userInput)) {
                attempt++;
            } else {
                return userInput;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        printPrimeNumber(getNumberFromUser());
        System.out.println();
        printSquareNumber(getNumberFromUser());
    }
}