import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task Min/Max:
        int[] numbers = {23, -23, 2, 10, 67, -7, 43, 121, 105, 7, 73, 100};
        int largestElement = numbers[0];
        System.out.println("The numbers of the array: " + Arrays.toString(numbers) + "\n");
        for (int i = 0; i < numbers.length; i++) {
            if (largestElement < numbers[i]) {
                largestElement = numbers[i];
            }
        }
        System.out.println("The largest element of the array: " + largestElement);

        int smallestElement = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (smallestElement > numbers[i]) {
                smallestElement = numbers[i];
            }
        }
        System.out.println("The smallest element of the array: " + smallestElement);

        // Task Counting
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 100) {
                counter++;
            }
        }
        System.out.println(counter + " elements are greater than 100");

        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= -50 && numbers[i] <= 78) {
                counter++;
            }
        }
        System.out.println(counter + " elements are between -50 and 78");

        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter + " elements are divisible by 2");

        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 != 0) {
                counter++;
            }
        }
        System.out.println(counter + " elements are not divisible by 3");

        counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 73) {
                counter++;
            }
        }
        System.out.println(counter + " the number 73 can be found in that array");

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

        isTrue = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 100) {
                isTrue = true;
            }
        }
        if (isTrue) {
            System.out.println("I found a number greater than 100");
        } else {
            System.out.println("I didn't find greater than hundred");
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

        int prod = 1;
        for (int i = 0; i < numbers.length; i++) {
            prod *= numbers[i];
        }
        System.out.println("The prod of the elements in the array: " + prod);

        sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if ((i + 1) % 4 == 0) {
                sum -= numbers[i];
            } else {
                sum += numbers[i];
            }
        }
        System.out.println("Result: " + sum);
    }
}