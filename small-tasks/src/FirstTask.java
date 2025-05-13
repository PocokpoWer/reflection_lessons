public class FirstTask {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1000; i < 2074; i++) {
            if (isPrimNumber(i)) {
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("Between 1000 and 2073 is " + counter + " Prime number");
    }

    public static boolean isPrimNumber(int number) {
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
}
