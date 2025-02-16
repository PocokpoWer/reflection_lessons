import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a text: ");
        String stringInput = scanner.nextLine();
        System.out.println("Write a number: ");
        int loopNumber = scanner.nextInt();

        if (loopNumber <= 0) {
            System.out.println("Error");
        } else {
            for (int i = 0; i < loopNumber; i++) {
                System.out.println(stringInput);
            }
        }
        scanner.close();
    }
}