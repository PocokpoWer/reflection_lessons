import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MainTest {
    // Task 16:
    @Test
    void shouldCountLowerCaseWords() {
        String[][][][] arrayOfTask16 = {
                {
                        {
                                {"hello", "world", "Java"},
                                {"apple", "banana", "TREE"}
                        },
                        {
                                {"test", "data", "shall"},
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
        assertEquals(18, Main.countLowerCaseWords(arrayOfTask16));
    }

    // Task 17:
    @Test
    void shouldReverseString() {
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
        String[][][][] expected = {
                {
                        {
                                {"elppa", "ananab"},
                                {"yrrehc", "etad"}
                        },
                        {
                                {"tnahpele", "hsif"},
                                {"eparg", "oppih"}
                        }
                },
                {
                        {
                                {"anaugi", "raugaj"},
                                {"alaok", "rumel"}
                        },
                        {
                                {"yeknom", "lahwran"},
                                {"supotco", "niugnep"}
                        }
                }
        };
        assertTrue(Arrays.deepEquals(expected, Main.reverseString(arrayOfTask17)));
    }

    // Task 18:
    @Test
    void shouldCalculateAllStringAverage() {
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
        assertEquals(4, Main.calculateAllStringAverage(arrayOfTask18));
    }

    // Task 19:
    @Test
    void shouldCalculateArraySizeOfTask19() {
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
        assertEquals(7, Main.calculateArraySizeOfTask19(arrayOfTask19));
    }

    @Test
    void shouldGetStringsWithTwoVowel() {
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
        String[] expected = {"education", "audio", "unique", "xylophone", "queue", "algorithm", "umbrella"};
        assertArrayEquals(expected, Main.getStringsWithTwoVowel(arrayOfTask19));
    }

    // Task 20:
    @Test
    void shouldCalculateArraySizeOfTak20() {
        String[][][][] arrayOfTask20Test
                = {
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
                                {"lime", "date", "zz"}
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
        assertEquals(12, Main.calculateArraySizeOfTak20(arrayOfTask20Test));
    }

    @Test
    void shouldFindShortestString() {
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
                                {"lime", "date", "zz"}
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
        String[] expected = {"kiwi", "a", "x", "b", "abc", "zz", "dog", "hi", "m", "q", "z", "r",};
        assertArrayEquals(expected, Main.findShortestString(arrayOfTask20));
    }

}
