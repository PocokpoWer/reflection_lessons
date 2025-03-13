public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{2000, 250, 300, 50, 250};
        System.out.println(calculateTip(array, toExaminePercent(25)));

    }

    public static int toExaminePercent(int percent) {
        return percent >= 10 && percent <= 80 || percent == 0 ? percent : -1;
    }

    public static int calculateTip(int[] numbers, int percent) {
        int spentMoney = 0;
        for (int number : numbers) {
            spentMoney += number;
        }
        return percent == -1 ? -1 : (spentMoney * percent) / 100;
    }
}