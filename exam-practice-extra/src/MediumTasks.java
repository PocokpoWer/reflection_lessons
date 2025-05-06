public class MediumTasks {
    public static void main(String[] args) {
        System.out.println("Task 3:");
        int[] arrayOfTaskThree = {1, 2, 3, 4};
        System.out.println(sumAndProdWithPattern(arrayOfTaskThree));
        System.out.println();

        System.out.println("Task 4:");
        int[] arrayOfTaskFour = {1, 2, 3, 4};
        System.out.println(sumNumbers(arrayOfTaskFour));
    }

    // Task 3: Write a method that applies a repeating multiplier
    // pattern of 1, 2, -1, -2 to the array and returns the total sum.
    // Test your code properly.
    //Example:
    //Input: [1, 2, 3, 4] → Output: 1*1 + 2*2 + 3*(-1) + 4*(-2) = 1 + 4 -3 -8 = -6
    public static int sumAndProdWithPattern(int[] array) {
        int[] prodNumbers = {1, 2, -1, -2};
        int index = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i] * prodNumbers[index++];
            if (index == 4) {
                index = 0;
            }
        }
        return result;
    }

    // Task 4: Write a method that multiplies odd-indexed
    // elements by 2, sums them and subtracts even-indexed
    // elements from it. Test your code properly.
    //Example:
    //Input: [1, 2, 3, 4] → Output: 2*2 + 2*4 - (1 + 3) = 4 + 8 - 4 = 8
    public static int sumNumbers(int[] array) {
        int result = 0;
        int temporary = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1)
                result += array[i] * 2;
            if (i % 2 == 0 || i == 0) {
                temporary += array[i];
            }
        }
        return result - temporary;
    }
}
