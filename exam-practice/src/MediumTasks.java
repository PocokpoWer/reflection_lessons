public class MediumTasks {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        boolean[][][][] arrayOfTaskOne = {
                {
                        {
                                {true, true}
                        },
                        {
                                {true}
                        }
                }
        };
        System.out.println(sumBooleanArray(arrayOfTaskOne));
        System.out.println();

        System.out.println("Task 2:");
        int[] arrayOfTaskTwo = {2, 4, 6};
        System.out.println(sumAndProdNumbers(arrayOfTaskTwo));
        System.out.println();
    }

    // Task 1: Write a method that receives a 4D array of booleans
    // and returns whether all values are true.
    //Example:
    //Input: [[[[true, true]], [[true]]]] → Output: true
    //Input: [[[[true, false]], [[true]]]] → Output: false
    public static boolean sumBooleanArray(boolean[][][][] array) {
        for (boolean[][][] threeD : array) {
            for (boolean[][] twoD : threeD) {
                for (boolean[] oneD : twoD) {
                    for (boolean element : oneD) {
                        if (!element)
                            return false;

                    }
                }
            }
        }
        return true;
    }

    // Task 2: Write a method that multiplies each element in
    // an array with its index and returns the total sum. Test your code properly
    //Example:
    //Input: [2, 4, 6] → Output: 0*2 + 1*4 + 2*6 = 0 + 4 + 12 = 16
    public static int sumAndProdNumbers(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += i * array[i];
        }
        return result;
    }
}
