import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PrimeLister> listers = List.of(
                new NaivePrimeCalculate(),
                new LessNaivePrimeCalculate(),
                new EratosthenesPrimeCalculate());
        for (PrimeLister lister : listers) {
            System.out.println("Primes using: " + lister.getClass());
            System.out.println(lister.listPrimes(120));
            System.out.println();
        }
    }
}