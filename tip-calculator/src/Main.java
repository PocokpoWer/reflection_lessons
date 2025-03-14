public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{2000, 250, 300, 50, 250};
        System.out.println(calculateTip(examinePercent(25), calculateSum(array)));

    }

    public static int examinePercent(int percent) {
        return percent >= 10 && percent <= 80 ? percent : -1;
    }

    public static int calculateSum(int... array) {
        int spentMoney = 0;
        for (int number : array) {
            spentMoney += number;
        }
        return spentMoney;
    }

    public static int calculateTip(int percent, int... numbers) {

        return percent == -1 ? -1 : (numbers[0] * percent) / 100;
    }
}