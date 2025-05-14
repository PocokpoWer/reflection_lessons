import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) {
        int[] array = {1, 6, 2, 6, 4, 6, 5};
        System.out.println("The mode of the array: " + getMode(array));

        int[] arrayOfTaskThree = {4, 2, 1, 9};
        System.out.println(getMedian(arrayOfTaskThree));

        int[] arrayOfTask3 = {2, 4, 7, 2, 5, 8, 3, 1};
        int mode = getMode(arrayOfTask3);
        double median = getMedian(arrayOfTask3);
        System.out.println(calcPower(mode, median));
    }

    public static int getMode(int[] array) {
        int number = 0;
        int[] count = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (array[k] == array[i]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }
            int counter = 0;
            int element = array[i];
            for (int j = 0; j < array.length; j++) {
                if (element == array[j]) {
                    counter++;
                }
            }
            if (counter > count[number]) {
                number = i;
            }
            count[i] = counter;
        }
        return array[number];
    }

    public static double getMedian(int[] array) {
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            return (double) (array[array.length / 2 - 1] + array[(array.length / 2)]) / 2;
        }
        return array[(array.length / 2)];
    }

    public static int calcPower(int a, double b) {
        return (int) Math.pow(a, b);
    }
}
