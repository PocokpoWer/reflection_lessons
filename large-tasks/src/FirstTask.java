import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your name:");
        String userName = scanner.nextLine();
        System.out.println("Welcome " + userName + "!");
        String userWord;
        int countMistake = 1;
        do {
            System.out.println("Please write a word:");
            userWord = scanner.nextLine();
            countMistake++;
        } while (!isValid(userWord) && countMistake <= 5);
        while (!isValid(userWord) && countMistake <= 7) {
            System.out.println("You've entered invalid input 5 times.\nTo help you, here are some examples:\n'hello', 'underestimate', '123abc' ");
            userWord = scanner.nextLine();
            countMistake++;
        }
        if (countMistake == 8) {
            System.out.println("Bye bye!");
            System.exit(1);
        }
        if (isPalindrome(userWord)) {
            System.out.println(userWord + " a palindrome.");
            String[] easterEggs = {"madam", "racecar"};
            if (userWord.equals(easterEggs[0]) || userWord.equals(easterEggs[1])) {
                System.out.println("You found the secret word! Nice job!");
            }
        } else {
            System.out.println("It isn't a palindrome.");
            double countVowel = 0;
            for (int i = 0; i < userWord.length(); i++) {
                if (userWord.charAt(i) == 'a' || userWord.charAt(i) == 'e' || userWord.charAt(i) == 'a' || userWord.charAt(i) == 'i' || userWord.charAt(i) == 'o' || userWord.charAt(i) == 'u') {
                    countVowel++;
                }
            }
            if (countVowel != 0) {
                System.out.println("It has " + (int) countVowel + " vowel(s).");
            }
            int vowelPercent = (int) ((countVowel / userWord.length()) * 100);
            int consonant = 100 - vowelPercent;
            System.out.println(vowelPercent + "% vowel and " + consonant + "% consonant");
        }
    }

    public static boolean isValid(String word) {
        return word.length() <= 15 && word.length() >= 3;
    }

    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return reversed.equals(word);
    }
}
