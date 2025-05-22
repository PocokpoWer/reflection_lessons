import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int countMistake = 0;
        do {
            System.out.println("Please write a number between 1 and 5000 again:");
            userInput = scanner.nextInt();
            countMistake++;
        } while (!isValid(userInput) && countMistake < 3);
        int rand1 = (int) (Math.random() * 5000) + 1;
        int rand2 = (int) (Math.random() * 5000) + 1;
        int rand3 = (int) (Math.random() * 5000) + 1;
        while (!isValid(userInput) && countMistake <= 4) {
            System.out.println("If the user fails to provide valid input 3 times,\ngive helpful examples to guide them on how to enter a correct number. \nExamples: " + rand1 + ", " + rand2 + ", " + rand3);
            userInput = scanner.nextInt();
            countMistake++;
        }
        if (countMistake == 5) {
            System.out.println("Bye bye!");
            System.exit(1);
        }
        System.out.println("The requested number: " + userInput);
        System.out.println("The divisors of 18 in descending order: " + getDivisors(userInput));
        if (isPrime(userInput)) {
            System.out.println(userInput + " is prime number.");
        } else {
            System.out.println(userInput + " isn't prime number.");
        }
        int increasePrimeNumber = userInput;
        while (!isPrime(increasePrimeNumber)) {
            increasePrimeNumber++;
        }
        System.out.println("The smallest prime number above " + increasePrimeNumber + " is:");
        System.out.println("The price of " + userInput + " scoops of ice cream is " + userInput * 275 + " HUF.");
        System.out.println("The volume of a cube with a side length of " + userInput + " meters is " + (int) Math.pow(userInput, 3) + " m^3.");
        List<Integer> array = getCubeNumber(userInput);
        System.out.println(isCubeNumber(userInput, array) ? userInput + " is cube number" : userInput + " isn't cube number");
        System.out.println(userInput + " HUF " + (double) userInput / 340 + " Euro");
        System.out.println(userInput == 4993 ? "BINGO!" : "");
    }

    public static boolean isValid(int number) {
        return number >= 1 && number <= 5000;
    }

    public static List<Integer> getDivisors(int number) {
        List<Integer> arrayOfDivisor = new ArrayList<>();
        for (int i = number; i >= 1; i--) {
            if (number % i == 0) {
                arrayOfDivisor.add(i);
            }
        }
        return arrayOfDivisor;
    }

    public static boolean isPrime(int number) {
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

    public static List<Integer> getCubeNumber(int number) {
        List<Integer> cubeNumbers = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            cubeNumbers.add((int) Math.pow(i, 3));
        }
        return cubeNumbers;
    }

    public static boolean isCubeNumber(int number, List<Integer> array) {
        for (Integer integer : array) {
            if (number == integer) {
                return true;
            }
        }
        return false;
    }
}
