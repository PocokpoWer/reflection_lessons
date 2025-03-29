import java.util.ArrayList;
import java.util.List;

public class Main {
    public static boolean isPrime(int number) {
        if (number == 2 || number == 3 || number == 5) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
            return false;
        }
        for (int i = 7; i < Math.sqrt(number); i += 4) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return number > 1;
    }

    public static List<Integer> createPrimeList(int number) {
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static List<Integer> printProductOfPrimes(int number) {
        List<Integer> productOfPrimes = new ArrayList<>();
        int i = 0;
        while (number != 1) {
            int currentNumber = createPrimeList(number).get(i);
            if (number % currentNumber == 0) {
                productOfPrimes.add(currentNumber);
                number /= currentNumber;
            } else {
                i++;
            }
        }
        return productOfPrimes;
    }

    public static void main(String[] args) {
        System.out.println(printProductOfPrimes(130));
    }
}