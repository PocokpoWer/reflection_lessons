import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 16:");
        String[][][][] arrayOfTask16 = {
                {
                        {
                                {"hello", "world", "Java"},
                                {"apple", "banana", "TREE"}
                        },
                        {
                                {"test", "data", "PYTHON"},
                                {"code", "snippets", "123"}
                        }
                },
                {
                        {
                                {"lower", "CASE", "MixEd"},
                                {"yes", "no", "maybe"}
                        },
                        {
                                {"only", "lowercase", "strings"},
                                {"OKAY", "fine", "great"}
                        }
                }
        };
        System.out.println(countLowerCaseWords(arrayOfTask16));

        System.out.println("Task 17:");
        String[][][][] arrayOfTask17 = {
                {
                        {
                                {"apple", "banana"},
                                {"cherry", "date"}
                        },
                        {
                                {"elephant", "fish"},
                                {"grape", "hippo"}
                        }
                },
                {
                        {
                                {"iguana", "jaguar"},
                                {"koala", "lemur"}
                        },
                        {
                                {"monkey", "narwhal"},
                                {"octopus", "penguin"}
                        }
                }
        };
        System.out.println(Arrays.deepToString(reverseString(arrayOfTask17)));

        System.out.println("Task 18:");
        String[][][][] arrayOfTask18 = {
                {
                        {
                                {"hello", "world"},
                                {"java", "rocks"}
                        },
                        {
                                {"foo", "bar", "baz"}
                        }
                },
                {
                        {
                                {"openai"},
                                {"gpt", "chat"}
                        }
                }
        };
        System.out.println(calculateAllStringAverage(arrayOfTask18));

        System.out.println("Task 19:");
        String[][][][] arrayOfTask19 = {
                {
                        {
                                {"cat", "education"},
                                {"sky", "audio"}
                        },
                        {
                                {"tree", "why"},
                                {"unique", "xylophone"}
                        }
                },
                {
                        {
                                {"run", "queue"},
                                {"box", "algorithm"}
                        },
                        {
                                {"python", "java"},
                                {"umbrella", "oop"}
                        }
                }
        };
        System.out.println(Arrays.deepToString(getStringsWithTwoVowel(arrayOfTask19)));

        System.out.println("Task 20:");
        String[][][][] arrayOfTask20 = {
                {
                        {
                                {"apple", "banana", "kiwi"},
                                {"orange", "pear", "a"}
                        },
                        {
                                {"grape", "plum", "x"},
                                {"melon", "fig", "b"}
                        }
                },
                {
                        {
                                {"mango", "lemon", "abc"},
                                {"lime", "", "zz"}
                        },
                        {
                                {"peach", "berry", "dog"},
                                {"nut", "papaya", "hi"}
                        }
                },
                {
                        {
                                {"pineapple", "cherry", "m"},
                                {"apricot", "q", "raspberry"}
                        },
                        {
                                {"blueberry", "strawberry", "z"},
                                {"banana", "kiwifruit", "r"}
                        }
                }
        };
        System.out.println(Arrays.toString(findShortestString(arrayOfTask20)));
    }

    // Task 16: Return the total count of strings that contain only lowercase letters.
    // Note: you can use Character.isLowerCase() to decide whether a character
    // is lowercase or not.
    public static int countLowerCaseWords(String[][][][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        String word = array[i][j][k][l];
                        String asd = "";
                        if (word != null && !word.isEmpty()) {
                            for (int n = 0; n < word.length(); n++) {
                                if (!Character.isLowerCase(word.charAt(n))) {
                                    break;
                                }
                                asd += word.charAt(n);
                            }
                            if (word.length() == asd.length()) {
                                counter++;
                            }
                        }
                    }
                }
            }
        }
        return counter;
    }

    // Task 17: Return a new 4D array with the same structure, where each string is reversed.
    public static String[][][][] calculateArraySizeOfTask17(String[][][][] array) {
        String[][][][] result = new String[array.length][][][];

        for (int i = 0; i < array.length; i++) {
            result[i] = new String[array[i].length][][];
            for (int j = 0; j < array[i].length; j++) {
                result[i][j] = new String[array[i][j].length][];
                for (int k = 0; k < array[i][j].length; k++) {
                    result[i][j][k] = new String[array[i][j][k].length];
                }
            }
        }

        return result;
    }

    public static String[][][][] reverseString(String[][][][] array) {

        String[][][][] reversed = calculateArraySizeOfTask17(array);
        StringBuilder temporaryWord = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        temporaryWord.append(array[i][j][k][l]);
                        reversed[i][j][k][l] = temporaryWord.reverse().toString();
                        temporaryWord = new StringBuilder();
                    }
                }
            }
        }
        return reversed;
    }

    // Task 18: Return the average length of all strings, rounded down to the nearest integer.
    public static int calculateAllStringAverage(String[][][][] array) {
        int counter = 0;
        int sumAllString = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        sumAllString += array[i][j][k][l].length();
                        counter++;
                    }
                }
            }
        }
        return sumAllString / counter;
    }

    //Task 19: Return a list of all strings that contain more than two vowels.
    //(you don’t have to consider non-English vowels, only a, e, i, o and u).
    public static boolean isVowel(char c) {
        char b = Character.toLowerCase(c);
        return b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u';
    }

    public static int countVowels(String array) {
        int vowels = 0;
        for (int i = 0; i < array.length(); i++) {
            if (isVowel(array.charAt(i))) {
                vowels++;
            }
        }
        return vowels;
    }

    public static int calculateArraySizeOfTask19(String[][][][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        String temporaryWord = array[i][j][k][l];
                        int counterVowel = countVowels(temporaryWord);
                        if (counterVowel > 2) {
                            counter++;
                        }
                    }
                }
            }
        }
        return counter;
    }

    public static String[] getStringsWithTwoVowel(String[][][][] array) {
        int index = 0;
        String[] result = new String[calculateArraySizeOfTask19(array)];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        String temporaryWord = array[i][j][k][l];
                        int counterVowel = countVowels(temporaryWord);
                        if (counterVowel > 2) {
                            result[index++] = temporaryWord;
                        }
                    }
                }
            }
        }
        return result;
    }

    // Task 20: Return the shortest string across all dimensions.
    public static int calculateArraySizeOfTask20(String[][][][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    count++;
                }
            }
        }
        return count;
    }

    public static String[] findShortestString(String[][][][] array) {
        String[] result = new String[calculateArraySizeOfTask20(array)];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    String[] words = array[i][j][k];
                    String temporaryWord = words[0];
                    for (int l = 1; l < words.length; l++) {
                        if (words[l].length() < temporaryWord.length()) {
                            temporaryWord = words[l];
                        }
                    }
                    result[index++] = temporaryWord;
                }
            }
        }
        return result;
    }

}
