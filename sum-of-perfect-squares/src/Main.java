import java.util.Scanner;

public class Main {
    public static int getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write  number: ");
        int userInput = scanner.nextInt();
        if (userInput < 1) {
            System.err.println("That's number is small.");
            System.exit(2);
        }
        return userInput;
    }

    public static int sumWithSquareNumbers(int number) {
        int sumUserInput = 0;
        for (int i = 1; i <= number; i++) {
            sumUserInput += i * i;
        }
        return sumUserInput;
    }

    public static void main(String[] args) {
        System.out.println(sumWithSquareNumbers(getUserNumber()));
    }
}