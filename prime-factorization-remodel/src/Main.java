import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> printProductOfPrimes(int number) {
        List<Integer> productOfPrimes = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                productOfPrimes.add(i);
                number /= i;
            }
        }
        return productOfPrimes;
    }

    public static void main(String[] args) {
        System.out.println(printProductOfPrimes(100));
    }
}