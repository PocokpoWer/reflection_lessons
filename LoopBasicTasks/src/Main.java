import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1:
        System.out.println("Task 1:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Paper Dragon ");
        }
        System.out.println("\n");
        // Task 2:
        System.out.println("Task 2:");
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + ",");
        }
        System.out.println("\n");
        // Task 3:
        System.out.println("Task 3:");
        System.out.println("Numbers divisible by two: ");
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println("\n");
        // Task 4:
        System.out.println("Task 4:");
        System.out.println("Numbers not divisible by two: ");
        for (int i = 1; i <= 500; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println("\n");
        // Task 5:
        System.out.println("Task 5:");
        System.out.println("First 10 powers of 2: ");
        int powerValue = 2;
        for (int i = 0; i < 10; i++) {
            System.out.print(powerValue + "^" + i + "=" + (int) Math.pow(powerValue, i) + ", ");
        }
        System.out.println("\n");
        // Task 6:
        System.out.println("Task 6:");
        System.out.println("Numbers from 565.5 to 678.5");
        double numberValue = 565.5;
        for (double i = numberValue; i <= 678.5; i += 0.25) {
            System.out.print(i + ",");
        }
        System.out.println("\n");
        // Task 7:
        System.out.println("Task 7:");
        System.out.println("The multiples of 30 between 600 and 750:");
        int multipleValue = 30;
        for (int i = 600; i <= 750; i++) {
            if (i % multipleValue == 0) {
                System.out.print(i+",");
            }
        }
        System.out.println("\n");
        //Task 8:
        System.out.println("Task 8:");
        System.out.println("Sum of the first 10 natural numbers: ");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.print(sum);
        System.out.println("\n");
        // Task 9:
        System.out.println("Task 9:");
        System.out.println("The average of the first 20 natural numbers:");
        double sumNumber = 0;
        for (int i = 1; i <= 20; i++) {
            sumNumber += i;
        }
        System.out.print(sumNumber / 20);
        System.out.println("\n");
        // Task 10:
        System.out.println("Task 10:");
        System.out.println("The square numbers to the console between 1 and 1000:");
        for (int i = 1; i < 32; i++) {
            System.out.print(i * i + ",");
        }
        System.out.println("\n");
        // Task 11:
        System.out.println("Task 11:");
        System.out.println("The cube numbers between 1 and 1250:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i * i + ",");
        }
        System.out.println("\n");
        // Task 12:
        System.out.println("Task 12:");
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number:");
        boolean isTrue = true;
        int inputNumber = scr.nextInt();
        for (int i = 2; i <= Math.sqrt(inputNumber); i++) {
            if (inputNumber % i == 0) {
                isTrue = false;
            }
        }
        if (isTrue){
            System.out.println("It's a prime number.");
        }else {
            System.out.println("It's not prime number");
        }
    }
}