import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> collatzSequence = new ArrayList<>();
        int userInput;
        do {
            System.out.println("Please enter a number between 3 and 12500:");
            userInput = scanner.nextInt();
        }
        while (!isValid(userInput));
        collatzSequence.add(userInput);
        while (userInput != 1) {
            if (userInput % 2 == 0) {
                collatzSequence.add(userInput /= 2);
            } else {
                collatzSequence.add(userInput = (userInput * 3) + 1);
            }
        }
        System.out.println(collatzSequence);
        int collatzProd = 1;
        for (Integer integer : collatzSequence) {
            collatzProd *= integer;
        }
        System.out.println(collatzProd == 5120 ? "You've discovered the magic number: 5120.\n" +
                "Collatz must be proud of your curiosity. Keep exploring — math hides wonders everywhere!" : "");
        int[] arrayLengthProd = new int[10];
        arrayLengthProd[0] = collatzSequence.size();
        for (int i = 0, j = 1; j < 10; i++, j++) {
            arrayLengthProd[j] = arrayLengthProd[i] * 2;
        }
        System.out.println(Arrays.toString(arrayLengthProd));
        System.out.println(arrayLengthProd[9] > 10_000 ? arrayLengthProd[9] + " is greatest like 10 000" : arrayLengthProd[9] + " isn't greatest like 10 000");
        System.out.println("Thank you for choosing us. Bye bye!");
    }

    public static boolean isValid(int number) {
        return number > 3 && number < 12500;
    }
}
