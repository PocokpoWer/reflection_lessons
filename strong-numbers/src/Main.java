public class Main {

    public static int countingDigits(int number) {
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
        int[] numberArray = new int[countingDigits(number)];
        while (number > 0) {
            numberArray[index] = number % 10;
            number = number / 10;
            index++;
        }
        return numberArray;
    }

    public static int multiAndSumNumbers(int[] numbers) {
        //Algorithmic complexity: O(n^2)
        int sumSeperateNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            int temporaryNumber = 1;
            int arrayNumber = numbers[i];
            for (int j = 1; j <= arrayNumber; j++) {
                temporaryNumber *= j;
            }
            sumSeperateNumber += temporaryNumber;
        }
        return sumSeperateNumber;
    }

    public static void main(String[] args) {
        int number = 40585;
        int result = multiAndSumNumbers(separateNumbers(number));
        System.out.println(result == number ? "It's a strong number" : "It isn't a strong number");
    }
}
