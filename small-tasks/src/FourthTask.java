public class FourthTask {
    public static void main(String[] args) {
        int eightFactorial = getFactorials(8);
        for (int i = 15003; i <= 1416221; i++) {
            if (i % 5 == 0 && i % 3 != 0 && i > eightFactorial && countDivisor(i) <= 12 && getLastNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static int getFactorials(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int countDivisor(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean getLastNumber(int number) {
        return number % 10 != 0;
    }
}
