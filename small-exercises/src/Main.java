//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        System.out.println(countLetterB("”abc"));
        System.out.println("Task 2:");
        System.out.println(countHellos("fhelloakhdfbkshdbfhellokahsdbfhello"));
    }

    // Task 1: Write a method that takes in a string and returns the occurrence of the 'B' character.
    public static int countLetterB(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'B') {
                counter++;
            }
        }
        return counter;
    }

    // Task 2: Write a method that takes in a string and
    // returns how many times “hello” is repeated in that String.
    // Check how the substring method works to solve this exercise.
    public static int countHellos(String input) {
        int counter = 0;
        for (int i = 0, j = 5; i < input.length() && j <= input.length(); i++, j++) {
            if (input.substring(i, j).equals("hello")) {
                counter++;
            }
        }
        return counter;
    }
}