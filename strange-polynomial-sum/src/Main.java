import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Write a number to the Task 1: ");
        int userNumber = getUserInput();
        if (userNumber < 1) {
            System.exit(2);
        } else {
            System.out.println("Result: " + calculatingWithExponent(userNumber));
        }
        System.out.println("Write a number to the Task 2: ");
        userNumber = getUserInput();
        if (userNumber < 1) {
            System.exit(2);
        } else {
            System.out.println("Result: " + calculatingWithExponent2(userNumber));
        }
    }

    public static int getUserInput() {
        Scanner scr = new Scanner(System.in);
        return scr.nextInt();
    }

    public static int calculatingWithExponent(int userNumber) {
        int exponent = 1;
        int result = 0;
        for (int i = 1; i <= userNumber; i++) {
            if (exponent > 4) {
                exponent = 1;
            }
            result += (int) Math.pow(i, exponent);
            exponent++;
        }
        return result;
    }

    public static int calculatingWithExponent2(int userNumber) {
        int exponent = 1;
        int result = 0;
        for (int i = 1; i <= userNumber; i++) {
            int temporaryNumber = 1;
            if (exponent > 3) {
                exponent = 1;
            }
            if (i % 2 == 0) {
                for (int j = 1; j <= exponent; j++) {
                    temporaryNumber *= i;
                }
                result -= temporaryNumber;
                exponent++;
            } else if (i % 5 == 0) {
                for (int j = 1; j <= exponent; j++) {
                    temporaryNumber *= i;
                }
                result += (temporaryNumber * 2);
                exponent++;
            } else {
                for (int j = 1; j <= exponent; j++) {
                    temporaryNumber *= i;
                }
                result += temporaryNumber;
                exponent++;
            }
        }
        return result * userNumber;
    }
}