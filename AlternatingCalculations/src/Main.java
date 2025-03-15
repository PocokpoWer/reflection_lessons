public class Main {
    public static void main(String[] args) {

        // Task 1: Alternating Sum with Stepwise Subtraction
        int[] arrayOfTask1 = {3, 5, 2, 7, 4, 8, 1, 6, 9};
        int sum = 0;
        for (int i = 0; i < arrayOfTask1.length; i++) {
            if ((i + 1) % 3 == 0) {
                sum -= arrayOfTask1[i];
            } else {
                sum += arrayOfTask1[i];
            }
        }
        System.out.println("Task 1 result: " + sum);

        // Task 2: Alternating Multiplication and Division
        int[] arrayOfTask2 = {2, 3, 6, 4, 2, 8, 3, 7, 9};
        double multiDivison = 1;
        for (int i = 0; i < arrayOfTask2.length; i++) {
            if ((i + 1) % 3 == 0) {
                multiDivison /= arrayOfTask2[i];
            } else {
                multiDivison *= arrayOfTask2[i];
            }
        }
        System.out.println("Task 2 result: " + multiDivison);

        // Task 3: Sum of Even Indexed Numbers Minus Odd Indexed Numbers
        int[] arrayOfTask3 = {10, 5, 3, 2, 8, 6};
        sum = 0;
        for (int i = 0; i < arrayOfTask3.length; i++) {
            if (i % 2 != 0) {
                sum -= arrayOfTask3[i];
            } else {
                sum += arrayOfTask3[i];
            }
        }
        System.out.println("Task 3 result: " + sum);

        // Task 4: Sum of Numbers Skipping Every Fourth Element
        int[] arrayOfTask4 = {2, 5, 8, 3, 6, 7, 9, 4, 1};
        sum = 0;
        for (int i = 0; i < arrayOfTask4.length; i++) {
            if ((i + 1) % 4 == 0) {
                continue;
            } else {
                sum += arrayOfTask4[i];
            }
        }
        System.out.println("Task 4 result: " + sum);

        // Task 5: Alternating Power and Division
        int[] arrayOfTask5 = {2, 3, 4, 2, 5, 2, 8, 3};
        for (int i = 0; i < arrayOfTask5.length; i++) {
            if (arrayOfTask5.length % 2 != 0) {
                System.out.println("Error: The array must contain an even number of elements.");
                System.exit(0);
            }
        }
        int j = 0;
        double[] collector = new double[arrayOfTask5.length / 2];
        for (int i = 0; i < arrayOfTask5.length; i += 2) {
            collector[j] = (int) Math.pow(arrayOfTask5[i], arrayOfTask5[i + 1]);
            j++;
        }
        j = 0;
        double[] collector2 = new double[collector.length / 2];
        for (int i = 0; i < collector.length; i += 2) {
            collector2[j] = collector[i] / collector[i + 1];
            j++;
        }
        double result = 1.0;
        for (int i = 0; i < collector2.length; i++) {
            result *= collector2[i];
        }
        System.out.println("Task 5 result: " + result);

        // Task 6: Sum of Numbers, Doubling Every Third Number
        int[] arrayOfTask6 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        sum = 0;
        for (int i = 0; i < arrayOfTask6.length; i++) {
            if ((i + 1) % 3 == 0) {
                sum += arrayOfTask6[i] * 2;
            } else {
                sum += arrayOfTask6[i];
            }
        }
        System.out.println("Task 6 result: " + sum);

        // Task 7: Sum Where Multiples of 3 Are Skipped
        int[] arrayOfTask7 = {5, 9, 7, 6, 2, 12, 8};
        sum = 0;
        for (int i = 0; i < arrayOfTask7.length; i++) {
            if (arrayOfTask7[i] % 3 == 0) {
                continue;
            }
            sum += arrayOfTask7[i];
        }
        System.out.println("Task 7 result: " + sum);

        // Task 8: Sum Where Prime Numbers Are Squared
        int[] arrayOfTask8 = {3, 4, 5, 6};
        sum = 0;
        boolean isPrime = false;
        for (int i = 0; i < arrayOfTask8.length; i++) {
            if (isPrime(arrayOfTask8[i])) {
                sum += (int) Math.pow(arrayOfTask8[i], 2);
            } else {
                sum += arrayOfTask8[i];
            }
        }
        System.out.println("Task 8 result: " + sum);

        //Task 9: Count of Even and Odd Numbers
        int[] arrayOfTask9 = {2, 7, 4, 9, 6, 3, 8};
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arrayOfTask9.length; i++) {
            if (arrayOfTask9[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Task 9 result: Even number: " + evenCount + " Odd Number: " + oddCount);

        // Task 10: Sum Where Negative Numbers Are Ignored
        int[] arrayOfTask10 = {-3, 4, -1, 7, -2, 8};
        sum = 0;
        for (int i = 0; i < arrayOfTask10.length; i++) {
            if (arrayOfTask10[i] > 0) {
                sum += arrayOfTask10[i];
            }
        }
        System.out.println("Task 10 result: " + sum);

        //Task 11: Product of Positive Numbers Divided by Negative Numbers
        int[] arrayOfTask11 = {2, 3, -5, 4, -2};
        int positiveNumbers = 1;
        int negativeNumbers = 1;
        for (int i = 0; i < arrayOfTask11.length; i++) {
            if (arrayOfTask11[i] >= 0) {
                positiveNumbers *= arrayOfTask11[i];
            } else {
                negativeNumbers *= arrayOfTask11[i];
            }
        }
        System.out.println("Task 11 result: " + (double) positiveNumbers / negativeNumbers);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }
}