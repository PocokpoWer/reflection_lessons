import java.util.*;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            int userNumber;
            int countMistake = 1;
            do {
                System.out.println("Please write a number between 4 and 25:");
                userNumber = scanner.nextInt();
                countMistake++;
            } while (!isValid(userNumber) && countMistake <= 4);
            int rand1 = (int) (Math.random() * 25) + 4;
            int rand2 = (int) (Math.random() * 25) + 4;
            int rand3 = (int) (Math.random() * 25) + 4;
            while (!isValid(userNumber) && countMistake <= 7) {
                System.out.println("You've entered invalid input 5 times.\nTo help you, here are some examples:\n" + rand1 + ", " + rand2 + ", " + rand3 + " ");
                userNumber = scanner.nextInt();
                countMistake++;
            }
            if (countMistake == 8) {
                System.out.println("Bye bye!");
                System.exit(1);
            }
            int[] tribonacciSequence = new int[userNumber];
            tribonacciSequence[0] = 0;
            tribonacciSequence[1] = 1;
            tribonacciSequence[2] = 2;
            if (userNumber == 12) {
                System.out.println("It's an Easter egg please write two other number: ");
                int userNumber2 = scanner.nextInt();
                int userNumber3 = scanner.nextInt();
                System.out.println(Arrays.toString(getFibonacciSequence(userNumber2, userNumber3)));

            } else if (userNumber == 16) {
                System.out.println("It's an Eastern egg");
                System.out.println(getDivisor(userNumber));
            } else {
                for (int i = 0, j = 1, k = 2, n = 3; n < userNumber; i++, j++, k++, n++) {
                    tribonacciSequence[n] = tribonacciSequence[i] + tribonacciSequence[j] + tribonacciSequence[k];
                }
                System.out.println(Arrays.toString(tribonacciSequence));
            }
            System.out.println("Do you want to run the program again?");
            scanner.nextLine();
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }

    public static boolean isValid(int number) {
        return number <= 25 && number >= 4;
    }

    public static List<Integer> getDivisor(int number) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static int[] getFibonacciSequence(int a, int b) {
        int[] fibonacciSequence = new int[12];
        fibonacciSequence[0] = a;
        fibonacciSequence[1] = b;
        for (int i = 0, j = 1, k = 2; i < 10; i++, j++, k++) {
            fibonacciSequence[k] = fibonacciSequence[i] + fibonacciSequence[j];
        }
        return fibonacciSequence;
    }
}