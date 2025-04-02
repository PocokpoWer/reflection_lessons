import java.util.Arrays;

public class Main {
    // Task 1: Writes your own name to the console
    public static String printName(String name) {
        return name;
    }

    // Task 2: Writes a welcome message to the console
    public static String printWelcome(String name) {
        return "Welcome " + name;
    }

    //Task 3: Gets in a number and returns its 30%
    public static int getThirtyPercentOfNumber(int number) {
        return (int) (number * 0.3);
    }

    // Task 4: Gets in an array of Strings and returns an empty String
    public static String[] getEmptyArray(String[] text) {
        for (int i = 0; i < text.length; i++) {
            text[i] = "";
        }
        return text;
    }

    // Task 5: Gets in a number and returns its 42.8%
    public static double getFortyTwoDotTwoPercentOfNumber(int number) {
        return number * 0.428;
    }

    // Task 6: Gets in a String and returns the double of its length
    public static int getDoubleStringLength(String input) {
        return input.length() * 2;
    }

    // Task 7: Gets in two numbers and returns how much you would need to add to the first number to get the second one
    public static int calculateDifferenceTwoNumbers(int a, int b) {
        return a > b ? a - b : b - a;
    }

    // Task 8: Gets in a String and returns the square root of its length
    public static double getStringSquareRootLength(String input) {
        return Math.sqrt(input.length());
    }

    // Task 9: Gets in a String and returns the factorial of its length
    public static int getFactorialStringLength(String input) {
        int inputLnegthFactorial = 1;
        for (int i = 1; i <= input.length(); i++) {
            inputLnegthFactorial *= i;
        }
        return inputLnegthFactorial;
    }

    // Task 10: Gets in a number and returns 100 divided by that number
    public static int getNumberDivideByHundred(int number) {
        return 100 / number;
    }

    // Task 11: Gets in a number and …
    //a: returns the square of it if it is prime
    //b: returns the double of it if it is not a prime and is divisible by 4
    //c: returns the triple of it if it is not a prime and is not divisible by 4
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }

    public static int getNumberPrimeNotPrimeDivideFourOrNot(int number) {
        if (isPrime(number)) {
            return number * number;
        } else if (!isPrime(number) && number % 4 == 0) {
            return number * 2;
        } else {
            return number * 3;
        }
    }

    // Task 12: Gets in an array of Strings and returns a new array of numbers of each String’s length
    public static int counterArraySize(String[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter++;
        }
        return counter;
    }

    public static int[] calculateStringLength(String[] array) {
        int[] stringLength = new int[counterArraySize(array)];
        for (int i = 0; i < array.length; i++) {
            stringLength[i] = array[i].length();
        }
        return stringLength;
    }

    // Task 13: Gets in a gross salary and calculates the net salary according to the Hungarian rules in the following way:
    // a. deduces 15% as SZJA (personal income tax) and 18.5% as TBJ (social security tax)
    // b. the remaining amount is going to be the net salary
    // c. So if someone earns 100 000 HUF gross per month, their net salary is going to be 66500 HUF
    // d. Use separate methods to calculate SZJA and TBJ.
    public static int reduceSZJA(int grossSalary) {
        return (int) (grossSalary * 0.15);
    }

    public static int reduceTBJ(int grossSalary) {
        return (int) (grossSalary * 0.185);
    }

    public static int calculateNetSalary(int grossSalary, int szja, int tbj) {
        return grossSalary - (szja + tbj);
    }

    // Task 14: Gets in an array of booleans and returns a1 XOR a2 XOR a3 … XOR an
    public static boolean xorArray(boolean[] array) {
        boolean result = false;
        for (boolean value : array) {
            result ^= value;
        }
        return result;
    }

    // Task 15: Gets in an array of numbers and returns a new array with all the negative numbers in from the original array
    public static int[] getOppositeNumber(int[] array) {
        int[] oppositeNumbers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            oppositeNumbers[i] = -(array[i]);
        }
        return oppositeNumbers;
    }

    public static void main(String[] args) {
        System.out.println("Task 1:");
        System.out.println(printName("Farkas Tibor"));

        System.out.println("Task 2:");
        System.out.println(printWelcome("Tibor"));

        System.out.println("Task 3:");
        System.out.println(getThirtyPercentOfNumber(100));

        System.out.println("Task 4:");
        String[] text = {"Word", "some", "anybody", "doing"};
        System.out.println(Arrays.toString(getEmptyArray(text)));

        System.out.println("Task 5:");
        System.out.println(getFortyTwoDotTwoPercentOfNumber(100));

        System.out.println("Task 6:");
        System.out.println(getDoubleStringLength("FarkasTibor"));

        System.out.println("Task 7:");
        System.out.println(calculateDifferenceTwoNumbers(2, 12));

        System.out.println("Task 8:");
        System.out.println(getStringSquareRootLength("Farkas Tibor"));

        System.out.println("Task 9:");
        System.out.println(getFactorialStringLength("Farkas"));

        System.out.println("Task 10:");
        System.out.println(getNumberDivideByHundred(100));

        System.out.println("Task 11:");
        System.out.println(getNumberPrimeNotPrimeDivideFourOrNot(11));

        System.out.println("Task 12:");
        String[] arrayToTest = {"Word", "some", "anybody", "doing"};
        System.out.println(Arrays.toString(calculateStringLength(arrayToTest)));

        System.out.println("Task 13:");
        int salary = 100_000;
        System.out.println(calculateNetSalary(salary, reduceSZJA(salary), reduceTBJ(salary)));

        System.out.println("Task 14:");
        boolean[] array = {true, true, false};
        System.out.println(xorArray(array));

        System.out.println("Task 15:");
        int[] numbers = new int[]{12, 10, -5, 23, 10, 67, 0};
        System.out.println(Arrays.toString(getOppositeNumber(numbers)));
    }
}