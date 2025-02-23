import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task Min/Max:
        int[] numbers = {23, 23, 2, 10, 67, 7, 43, 121, 105, 7, 73, 100};
        int temporaryValue = numbers[0];
        System.out.println("Numbers of the array: " + Arrays.toString(numbers) + "\n");
        for (int i = 0; i < numbers.length; i++) {
            if (temporaryValue < numbers[i]) {
                temporaryValue = numbers[i];
            }
        }
        System.out.println("The largest element of the array: " + temporaryValue);

        for (int i = 0; i < numbers.length; i++) {
            if (temporaryValue > numbers[i]) {
                temporaryValue = numbers[i];
            }
        }
        System.out.println("The smallest element of the array: " + temporaryValue);
        // Task Counting
        int elementCounter1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 100) {
                elementCounter1++;
            }
        }
        System.out.println(elementCounter1 + " elements are greater than 100");
        int elementCounter2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= -50 && numbers[i] <= 78) {
                elementCounter2++;
            }
        }
        System.out.println(elementCounter2 + " elements are between -50 and 78");
        int elementCounter3 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                elementCounter3++;
            }
        }
        System.out.println(elementCounter3 + " elements are divisible by 2");
        int elementCounter4 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 != 0) {
                elementCounter4++;
            }
        }
        System.out.println(elementCounter4 + " elements are not divisible by 3");
        int elementCounter5 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 73) {
                elementCounter5++;
            }
        }
        System.out.println(elementCounter5 + " the number 73 can be found in that array");
        // Task Search
        boolean isTrue = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 100) {
                isTrue = true;
            }
        }
        if (isTrue) {
            System.out.println("Hundred can be found in this array");
        } else {
            System.out.println("I didn't find hundred in this array ");
        }

        boolean isTrue2 = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 100) {
                isTrue2 = true;
            }
        }
        if (isTrue2) {
            System.out.println("I found number is greater than hundred in this array");
        } else {
            System.out.println("I didn't find greater than hundred in this array ");
        }

        int indexOfSeven = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 7) {
                indexOfSeven = i;
                break;
            }
        }
        System.out.println(indexOfSeven > 0 ? "First occurrence of 7 in the array: " + indexOfSeven + ". index" : "-1");
        //Task Sum/prod
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum of the elements in the array: " + sum);

        int sum2 = 1;
        for (int i = 0; i < numbers.length; i++) {
            sum2 *= numbers[i];
        }
        System.out.println("The prod of the elements in the array: " + sum2);

        int sum3 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((i + 1) % 4 == 0) {
                sum3 -= numbers[i];
            } else {
                sum3 += numbers[i];
            }
        }
        System.out.println("Result: " + sum3);
    }
}