import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 2 and 100000: ");
        int inputNumber = scanner.nextInt();
        while (inputNumber < 2 && inputNumber > 100000) {
            inputNumber = scanner.nextInt();
        }
        int maxDivisors = 0;
        int number = 0;
        for (int i = 1; i <= inputNumber; i++) {
            int countDivisor = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    countDivisor++;
                }
            }
            if (countDivisor > maxDivisors) {
                maxDivisors = countDivisor;
                number = i;
            }
        }
        System.out.println("The greatest divisor: " + number);
    }
}
