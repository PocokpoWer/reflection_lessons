public class Main {
    public static void main(String[] args) {
        collatzSequence(6);
        System.out.println();
        System.out.println(exponentiation(2, 5));
    }

    public static void collatzSequence(int number) {
        System.out.print(number);
        if (number != 1) {
            System.out.print(", ");
            if (number % 2 == 0) {
                collatzSequence(number / 2);
            } else {
                collatzSequence(3 * number + 1);
            }
        }
    }

    public static int exponentiation(int number, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return number * exponentiation(number, exponent - 1);
    }
}