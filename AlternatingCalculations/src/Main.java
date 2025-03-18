public class Main {
    public static void main(String[] args) {

        // Task 1: Alternating Sum with Stepwise Subtraction
        int[] arrayOfTask1 = {3, 5, 2, 7, 4, 8, 1, 6, 9};
        System.out.println("Task 1 result: " + sumAndMinusThirdNumber(arrayOfTask1));

        // Task 2: Alternating Multiplication and Division
        int[] arrayOfTask2 = {2, 3, 6, 4, 2, 8, 3, 7, 9};
        System.out.println("Task 2 result: " + multiAndDivisionNumbers(arrayOfTask2));

        // Task 3: Sum of Even Indexed Numbers Minus Odd Indexed Numbers
        int[] arrayOfTask3 = {10, 5, 3, 2, 8, 6};
        System.out.println("Task 3 result: " + sumEvenMinusOddNumbers(arrayOfTask3));

        // Task 4: Sum of Numbers Skipping Every Fourth Element
        int[] arrayOfTask4 = {2, 5, 8, 3, 6, 7, 9, 4, 1};
        System.out.println("Task 4 result: " + sumNumbersSkipFourthElement(arrayOfTask4));

        // Task 5: Alternating Power and Division
        int[] arrayOfTask5 = {2, 3, 4, 2, 5, 2, 8, 3};
        System.out.println("Task 5 result: " + powerAndDivisionNumbers(arrayOfTask5));

        // Task 6: Sum of Numbers, Doubling Every Third Number
        int[] arrayOfTask6 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Task 6 result: " + sumAndPowerNumbers(arrayOfTask6));

        // Task 7: Sum Where Multiples of 3 Are Skipped
        int[] arrayOfTask7 = {5, 9, 7, 6, 2, 12, 8};
        System.out.println("Task 7 result: " + sumNumberMultiplesOf3Skip(arrayOfTask7));

        // Task 8: Sum Where Prime Numbers Are Squared
        int[] arrayOfTask8 = {3, 4, 5, 6};
        System.out.println("Task 8 result: " + sumNumbersPrimeSquared(arrayOfTask8));

        //Task 9: Count of Even and Odd Numbers
        int[] arrayOfTask9 = {2, 7, 4, 9, 6, 3, 8};
        int[] result = countEvenAndOddNumbers(arrayOfTask9);
        System.out.println("Task 9 result: " + "Even numbers: " + result[0] + " Odd Numbers: " + result[1]);
        // Task 10: Sum Where Negative Numbers Are Ignored
        int[] arrayOfTask10 = {-3, 4, -1, 7, -2, 8};
        System.out.println("Task 10 result: " + sumAndNegNumbersIgnored(arrayOfTask10));

        //Task 11: Product of Positive Numbers Divided by Negative Numbers
        int[] arrayOfTask11 = {2, 3, -5, 4, -2};
        System.out.println("Task 11 result: " + prodPositiveDivNegativeNumbers(arrayOfTask11));
    }

    public static int sumAndMinusThirdNumber(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 3 == 0) {
                sum -= array[i];
            } else {
                sum += array[i];
            }
        }
        return sum;
    }

    public static double multiAndDivisionNumbers(int[] array) {
        double multiDivison = 1;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 3 == 0) {
                multiDivison /= array[i];
            } else {
                multiDivison *= array[i];
            }
        }
        return multiDivison;
    }

    public static int sumEvenMinusOddNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum -= array[i];
            } else {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int sumNumbersSkipFourthElement(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 4 == 0) {
                continue;
            } else {
                sum += array[i];
            }
        }
        return sum;
    }

    public static double powerAndDivisionNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 != 0) {
                System.out.println("Error: The array must contain an even number of elements.");
                System.exit(0);
            }
        }
        int j = 0;
        double[] collector = new double[array.length / 2];
        for (int i = 0; i < array.length; i += 2) {
            collector[j] = (int) Math.pow(array[i], array[i + 1]);
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
        return result;
    }

    public static int sumAndPowerNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 3 == 0) {
                sum += array[i] * 2;
            } else {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int sumNumberMultiplesOf3Skip(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                continue;
            }
            sum += array[i];
        }
        return sum;
    }

    public static int sumNumbersPrimeSquared(int[] array) {
        int sum = 0;
        boolean isPrime = false;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                sum += (int) Math.pow(array[i], 2);
            } else {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int[] countEvenAndOddNumbers(int[] array) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return new int[]{evenCount, oddCount};
    }

    public static int sumAndNegNumbersIgnored(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static double prodPositiveDivNegativeNumbers(int[] array) {
        int positiveNumbers = 1;
        int negativeNumbers = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveNumbers *= array[i];
            } else {
                negativeNumbers *= array[i];
            }
        }
        return (double) positiveNumbers / negativeNumbers;
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