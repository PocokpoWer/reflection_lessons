import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            calcRecamanSequence(i, array);
        }
        System.out.println(array);
        System.out.println();
        System.out.println(Arrays.toString(calcRecamanSequenceWithForLoop(20)));
    }

    // Task: Write a recursive algorithm to implement Recamán's sequence.
    // Write a recursive algorithm in a method
    //Understand how each element is calculated from the previously calculated element
    //Don’t forget the base case
    //Please write the algorithmic complexity (big O - in Hungarian: ordó) of your algorithm in a Jira comment

    public static int calcRecamanSequence(int number, List<Integer> array) {
        if (array.size() > number) {
            return array.get(number);
        }

        if (number == 0) {
            array.add(number);
            return 0;
        }

        int prev = calcRecamanSequence(number - 1, array);
        int candidate = prev - number;
        if (candidate > 0 && !array.contains(candidate)) {
            array.add(candidate);
            return candidate;
        } else {
            candidate = prev + number;
            array.add(candidate);
            return candidate;
        }
    }

    // Extra task:
    public static boolean isNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static int[] calcRecamanSequenceWithForLoop(int number) {
        int[] recamanNumbers = new int[number];
        int arrayIndex = 0;
        int j = 0;
        for (int i = 0; i < recamanNumbers.length; i++) {
            int temporaryNumber = j - i;
            if (temporaryNumber < 0 || isNumber(recamanNumbers, temporaryNumber)) {
                recamanNumbers[arrayIndex++] = j + i;
                j = i + j;
            } else {
                recamanNumbers[arrayIndex++] = temporaryNumber;
                j = temporaryNumber;
            }
        }
        return recamanNumbers;
    }

}
