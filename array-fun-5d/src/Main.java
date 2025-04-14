import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 21:");
        String[][][][][] arrayOfTask21 = {
                {
                        {
                                {
                                        {"apple", "java"},
                                        {"moon", "sky"}
                                },
                                {
                                        {"green", "cloud"},
                                        {"sun", "hello"}
                                }
                        },
                        {
                                {
                                        {"world", "cat"},
                                        {"dog", "rain"}
                                },
                                {
                                        {"bird", "car"},
                                        {"pen", "mouse"}
                                }
                        }
                },
                {
                        {
                                {
                                        {"cup", "milk"},
                                        {"code", "light"}
                                },
                                {
                                        {"dark", "blue"},
                                        {"house", "key"}
                                }
                        },
                        {
                                {
                                        {"note", "leaf"},
                                        {"red", "star"}
                                },
                                {
                                        {"gold", "silver"},
                                        {"book", "chair"}
                                }
                        }
                }
        };
        System.out.println(findArrayIndexWithoutEAndR(arrayOfTask21));

        System.out.println("Task 22:");
        String[][][][][] arrayOfTask22 = {
                {
                        {
                                {
                                        {"hello", "X", "sunshine"},
                                        {"car", "DATA123"}
                                },
                                {
                                        {"tiger", "sky", "BlueSky"},
                                        {"Ant", "Neo16", "GPU"}
                                }
                        },
                        {
                                {
                                        {"", "JVM", "SpaceX"},
                                        {"milkshake", "RAM", "SSD"}
                                },
                                {
                                        {"fox", "owl", "UFO"},
                                        {"Yes", "no", "maybe"}
                                }
                        }
                },
                {
                        {
                                {
                                        {"Java", "Python", "C++", "false"},
                                        {"null", "true"}
                                },
                                {
                                        {"Alpha", "Beta", "Gamma"},
                                        {"delta", "epsilon", "Z"}
                                }
                        },
                        {
                                {
                                        {"macOS", "Linux", "Windows"},
                                        {"HTML", "CSS", "JS"}
                                },
                                {
                                        {"AI", "ML", "DL"},
                                        {"VR", "AR", "MR"}
                                }
                        }
                }
        };
        System.out.println(Arrays.deepToString(replaceToStringLength(arrayOfTask22)));

        System.out.println("Task 23:");
        String[][][][][] arrayOFTask23 = {
                {
                        {
                                {
                                        {"apple", "sun", "asda"},
                                        {"cat", "light"}
                                },
                                {
                                        {"eye", "java", "milk"},
                                        {"cup", "bob", "loop"}
                                }
                        },
                        {
                                {
                                        {"wow", "end", "tree"},
                                        {"non", "madam", "wind"}
                                },
                                {
                                        {"pop", "noon", "dog"},
                                        {"book", "code", "radar"}
                                }
                        }
                },
                {
                        {
                                {
                                        {"deed", "robot", "hat"},
                                        {"eye", "gig", "no"}
                                },
                                {
                                        {"sis", "tat", "refer"},
                                        {"wow", "stats", "bib"}
                                }
                        },
                        {
                                {
                                        {"red", "blue", "green"},
                                        {"a", "b", "c"}
                                },
                                {
                                        {"level", "cool", "did"},
                                        {"dad", "mom", "rotor"}
                                }
                        }
                }
        };
        System.out.println(findFirstAnLastSameLetter(arrayOFTask23));

        System.out.println("Task 24:");
        String[][][][][] arrayOfTask24 = {
                {
                        {
                                {
                                        {"Hello", "world"},
                                        {"Java", "rocks"}
                                },
                                {
                                        {"ChatGPT", "AI"},
                                        {"fun", "code"}
                                }
                        },
                        {
                                {
                                        {"cool", "beans"},
                                        {"openAI", "yes"}
                                },
                                {
                                        {"GPT", "Neo"},
                                        {"text", "gen"}
                                }
                        }
                },
                {
                        {
                                {
                                        {"smart", "brain"},
                                        {"data", "train"}
                                },
                                {
                                        {"logic", "loop"},
                                        {"zip", "zap"}
                                }
                        },
                        {
                                {
                                        {"red", "green"},
                                        {"blue", "pink"}
                                },
                                {
                                        {"fast", "slow"},
                                        {"in", "out"}
                                }
                        }
                }
        };
        System.out.println(concatenateAllString(arrayOfTask24));
    }

    // Task 21: Return the number of strings that do not contain the letters “e”, “E”, or “r”.
    public static int findArrayIndexWithoutEAndR(String[][][][][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        for (int m = 0; m < array[i][j][k][l].length; m++) {
                            boolean isTrue = false;
                            for (int n = 0; n < array[i][j][k][l][m].length(); n++) {
                                if (array[i][j][k][l][m].toLowerCase().charAt(n) == 'e' || array[i][j][k][l][m].charAt(n) == 'r') {
                                    isTrue = false;
                                    break;
                                } else {
                                    isTrue = true;
                                }
                            }
                            if (isTrue) {
                                counter++;
                            }
                        }
                    }
                }
            }
        }
        return counter;
    }

    // Task 22: Return a new 5D array with all strings replaced by their lengths.
    public static int[][][][][] calculateArraySize(String[][][][][] array) {
        int[][][][][] result = new int[array.length][][][][];
        for (int i = 0; i < array.length; i++) {
            result[i] = new int[array[i].length][][][];
            for (int j = 0; j < array[i].length; j++) {
                result[i][j] = new int[array[i][j].length][][];
                for (int k = 0; k < array[i][j].length; k++) {
                    result[i][j][k] = new int[array[i][j][k].length][];
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        result[i][j][k][l] = new int[array[i][j][k][l].length];
                    }
                }
            }
        }
        return result;
    }

    public static int[][][][][] replaceToStringLength(String[][][][][] array) {
        int[][][][][] result = calculateArraySize(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        for (int m = 0; m < array[i][j][k][l].length; m++) {
                            result[i][j][k][l][m] = array[i][j][k][l][m].length();
                        }
                    }
                }
            }
        }
        return result;
    }

    // Task 23: Return the total number of characters
    // across all strings that start and end with the same letter.
    public static int findFirstAnLastSameLetter(String[][][][][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        for (int m = 0; m < array[i][j][k][l].length; m++) {
                            if (array[i][j][k][l][m].charAt(0) == array[i][j][k][l][m].charAt(array[i][j][k][l][m].length() - 1)) {
                                result++;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    // Task 24: Return one big string, which is the concatenation of all strings.
    public static String concatenateAllString(String[][][][][] array) {
        StringBuilder allString = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        for (int m = 0; m < array[i][j][k][l].length; m++) {
                            allString.append(array[i][j][k][l][m]);
                        }
                    }
                }
            }
        }
        return String.valueOf(allString);
    }
}