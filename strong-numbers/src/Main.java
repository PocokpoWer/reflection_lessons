public class Main {

    public static int countDigits(int number) {
        //Algorithmic complexity: O(n)
        int counter = 0;
        while (number > 0) {
            int temporaryNumber = number % 10;
            number = number / 10;
            counter++;
        }
        return counter;
    }

    public static int[] separateNumbers(int number) {
        //Algorithmic complexity: O(n)
        int index = 0;
        int[] numberArray = new int[countDigits(number)];
        while (number > 0) {
            numberArray[index] = number % 10;
            number /= 10;
            index++;
        }
        return numberArray;
    }

    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int sumNumbers(int[] numbers) {
        //Algorithmic complexity: O(n^2)
        int Result = 0;
        for (int i = 0; i < numbers.length; i++) {
            Result += calculateFactorial(numbers[i]);
        }
        return Result;
    }

    public static void main(String[] args) {
        int number = 40585;
        int result = sumNumbers(separateNumbers(number));
        System.out.println(result == number ? "It's a strong number" : "It isn't a strong number");
    }
}