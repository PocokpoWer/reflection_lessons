package task1;

public class StringManipulation {
    public static String getString(String input) {
        StringBuilder str = new StringBuilder();
        String[] wordSplit = input.split(" ");
        for (String word : wordSplit) {
            if (word.length() > 3) {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }
            str.append(word).append(" ");
        }
        return str.toString();
    }
}
