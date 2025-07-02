import java.util.ArrayList;
import java.util.List;

public class NaivePrimeCalculate implements PrimeLister {

    @Override
    public List<Integer> listPrimes(int upperLimit) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= upperLimit; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }
}
