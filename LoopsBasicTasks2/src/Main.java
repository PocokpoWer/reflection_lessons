import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1:
        System.out.println("Task 1:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
        System.out.println();
        // Task 2:
        System.out.println("Task 2:");
        int multipleValue = 5;
        for (int i = 5; i <= 100; i += 5) {
            System.out.print(i + ",");
        }
        System.out.println("\n");
        // Task 3:
        System.out.println("Task 3:");
        double multipleValue2 = 0.38;
        for (double i = 0.38; i <= 1162; i += 0.38) {
            System.out.print(i + ",");
        }
        System.out.println("\n");
        // Task 4:
        System.out.println("Task 4:");
        for (int i = 100; i >= 1; i--) {
            System.out.print(i + ",");
        }
        System.out.println("\n");
        // Task 5:
        System.out.println("Task 5:");
        int number = 100;
        for (int i = 1; i <= number; i++) {
            boolean isTrue = i != 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isTrue = false;
                }
            }
            if (isTrue) {
                System.out.print(i + ",");
            }
        }
        System.out.println("\n");
        // Task 6:
        System.out.println("Task 6:");
        for (int i = -50; i <= 50; i++) {
            System.out.print(i + ",");
        }
        System.out.println("\n");
        // Task 7:
        System.out.println("Task 7:");
        for (int i = 0; i < 200; i += 7) {
            if (i > 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println("\n");
        // Task 8:
        System.out.println("Task 8:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println("\n");
        // Task 9:
        System.out.println("Task 9:");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println();
        // Task 10:
        System.out.println("Task 10:");
        int multiply = 1;
        for (int i = 1; i <= 10; i++) {
            multiply *= i;
        }
        System.out.println(multiply);
        System.out.println();
        // Task 11:
        System.out.println("Task 11:");
        for (int i = 1000; i >= 500; i -= 10) {
            System.out.print(i + ",");
        }
        System.out.println("\n");
        // Task 12:
        System.out.println("Task 12:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(Math.sqrt(i) + ",");
        }
        System.out.println("\n");
        // Task 13:
        System.out.println("Task 13:");
        for (int i = 1; i <= 500; i++) {
            if (i % 3 != 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println("\n");
        // Task 14:
        System.out.println("Task 14:");
        for (int i = 1; i <= 200; i++) {
            if (i % 2 != 0 && i % 5 != 0) {
                System.out.print(i + ",");
            }
        }

        System.out.println("\n");
        // Task 15:
        System.out.println("Task 15:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i * i * i + ",");
        }
        System.out.println("\n");
        // Task 16:
        System.out.println("Task 16:");
        Scanner scr = new Scanner(System.in);
        int[] array = new int[1];
        System.out.println("Please enter a number: ");
        int userNumber = scr.nextInt();
        boolean isSame = true;
        for (int i = 1; i <= userNumber; i++) {
            array[0] = i * i;
            if (array[0] != userNumber) {
                isSame = false;
            } else {
                isSame = true;
                break;
            }
        }
        if (isSame) {
            System.out.println("It's a perfect square number.");
        } else {
            System.out.println("It's not a prefect square number.");
        }
        System.out.println();
        // Task 17:
        System.out.println("Task 17:");
        int numberLargestPrime = 500;
        int[] array2 = new int[1];
        for (int i = 1; i <= numberLargestPrime; i++) {
            boolean isTrue = i != 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isTrue = false;
                }
            }
            if (isTrue) {
                array2[0] = i;
            }
        }
        System.out.println("The largest prime number: " + array2[0]);
        System.out.println();
        //Task 18:
        System.out.println("Task 18:");
        int sumOfSquareNumber = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquareNumber += i * i;
        }
        System.out.println("The sum of all square numbers from 1 to 100: " + sumOfSquareNumber);
    }
}