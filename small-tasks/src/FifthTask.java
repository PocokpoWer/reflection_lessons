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
        int divisor = 0;
        int primeDivisor = 0;
        for (int i = 1; i < userInput; i++) {
            if (userInput % i == 0) {
                if (i > divisor) {
                    divisor = i;
                }
                if (isPrimeNumber(i) && i > primeDivisor) {
                    primeDivisor = i;
                }
            }
        }
        if (primeDivisor != 0) {
            System.out.println("Greatest prime divisor: " + primeDivisor);
        } else {
            System.out.println("There are no primes among the numbers.");
            int primeUp = findNextPrimeUp(divisor);
            int primeDown = findNextPrimeDown(divisor);
            System.out.println("Searching upwards, the smallest prime number is: " + primeUp);
            System.out.println("Searching downwards, the largest prime number is: " + primeDown);
        }
    }

    public static boolean isPrimeNumber(int number) {
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

    public static int findNextPrimeUp(int number) {
        int candidate = number + 1;
        while (true) {
            if (isPrimeNumber(candidate)) {
                return candidate;
            }
            candidate++;
        }
    }

    public static int findNextPrimeDown(int number) {
        int candidate = number - 1;
        while (candidate >= 2) {
            if (isPrimeNumber(candidate)) {
                return candidate;
            }
            candidate--;
        }
        return 0;
    }
}
