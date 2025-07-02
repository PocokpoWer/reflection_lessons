import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EratosthenesPrimeCalculate implements PrimeLister {
    @Override
    public List<Integer> listPrimes(int upperLimit) {
            boolean[] isPrime = new boolean[upperLimit + 1];
            Arrays.fill(isPrime, true);
            isPrime[0] = isPrime[1] = false;

            for (int i = 2; i * i <= upperLimit; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= upperLimit; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            List<Integer> primes = new ArrayList<>();
            for (int i = 2; i <= upperLimit; i++) {
                if (isPrime[i]) primes.add(i);
            }
            return primes;
    }
}
