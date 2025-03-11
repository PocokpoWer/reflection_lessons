public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{2000, 250, 300, 50, 250};
        System.out.println(calculateTip(array, 0));
    }

    public static int calculateTip(int[] numbers, int percent) {
        int spentMoney = 0;
        for (int number : numbers) {
            spentMoney += number;
        }
        double tip = percent < 10 && percent > 0 ? spentMoney * ((double) percent / 10) : spentMoney * ((double) percent / 100);
        return percent >= 10 && percent <= 80 || percent == 0 ? (int) tip : -1;
    }
}