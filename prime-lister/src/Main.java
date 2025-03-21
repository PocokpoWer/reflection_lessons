import java.util.Scanner;

public class Main {
    public static boolean isPrime(int number) {
        if (number == 2 || number == 3 || number == 5) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
            return false;
        }
        for (int i = 7; i <= Math.sqrt(number); i += 4) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return number > 1;
    }

    public static void printPrimeNumber(int userInput) {
        if (userInput == -1) {
            System.exit(2);
        }
        System.out.print(userInput >= 2 ? "2 " : "");
        for (int i = 3; i <= userInput; i += 4) {
            if (isPrime(i) && isPrime(i + 2) && i + 2 <= userInput) {
                System.out.print(i + " " + (i + 2) + " ");
            } else if (isPrime(i)) {
                System.out.print(i + " ");
            } else if (isPrime((i + 2)) && i + 2 <= userInput) {
                System.out.print((i + 2) + " ");
            }
        }
    }

    public static void printSquareNumber(int userInput) {
        if (userInput == -1) {
            System.exit(2);
        }
        for (int i = 1; i <= userInput; i++) {
            int temporaryNumber = i * i;
            if (temporaryNumber <= userInput) {
                System.out.print(temporaryNumber + " ");
            } else {
                break;
            }
        }
    }

    public static boolean isValidBetweenTwoAndTwoBillion(int number) {
        return number >= 2 && number <= 2_000_000_000;
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int numberFromUser;
        int attempts = 0;
        while (attempts < 5) {
            System.out.println("Write a number: ");
            numberFromUser = scanner.nextInt();
            if (!isValidBetweenTwoAndTwoBillion(numberFromUser)) {
                attempts++;
            } else {
                return numberFromUser;
            }
            scanner.close();
        }
        return -1;
    }

    public static void main(String[] args) {
        printPrimeNumber(getNumberFromUser());
        System.out.println();
        printSquareNumber(getNumberFromUser());
    }
}