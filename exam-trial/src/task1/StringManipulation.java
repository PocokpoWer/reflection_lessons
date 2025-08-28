package task1;

public class StringManipulation {
    public static String getString(String input) {
        String result = "";
        String[] wordSplit = input.split(" ");
        for (String word : wordSplit) {
            if (word.length() > 3) {
                String temporaryWord = "";
                for (int i = 0; i < word.length(); i++) {
                    word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                }
            }
            result += word + " ";
        }
        return result.trim();
    }
}
