import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MainTest {
    @Test
    void shouldFindArrayIndexWithoutEAndR() {
        String[][][][][] arrayOfTask21 = {
                {
                        {
                                {
                                        {"apple", "sun"},
                                        {"Moon", "sky"}
                                },
                                {
                                        {"Tree", "Cup"},
                                        {"DOG", "ant"}
                                }
                        },
                        {
                                {
                                        {"java", "milk"},
                                        {"CODE", "light"}
                                },
                                {
                                        {"Dark", "blue"},
                                        {"house", "Key"}
                                }
                        }
                },
                {
                        {
                                {
                                        {"note", "leaf"},
                                        {"RED", "star"}
                                },
                                {
                                        {"gold", "SILVER"},
                                        {"book", "CHAIR"}
                                }
                        },
                        {
                                {
                                        {"wind", "fog"},
                                        {"fox", "owl"}
                                },
                                {
                                        {"bat", "sun"},
                                        {"ice", "map"}
                                }
                        }
                }
        };
        assertEquals(19, Main.findArrayIndexWithoutEAndR(arrayOfTask21));
    }

    // Task 22:
    @Test
    void shouldReplaceToStringLength() {
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
        int[][][][][] expected = {
                {
                        {
                                {
                                        {5, 1, 8},
                                        {3, 7}
                                },
                                {
                                        {5, 3, 7},
                                        {3, 5, 3}
                                }
                        },
                        {
                                {
                                        {0, 3, 6},
                                        {9, 3, 3}
                                },
                                {
                                        {3, 3, 3},
                                        {3, 2, 5}
                                }
                        }
                },
                {
                        {
                                {
                                        {4, 6, 3, 5},
                                        {4, 4}
                                },
                                {
                                        {5, 4, 5},
                                        {5, 7, 1}
                                }
                        },
                        {
                                {
                                        {5, 5, 7},
                                        {4, 3, 2}
                                },
                                {
                                        {2, 2, 2},
                                        {2, 2, 2}
                                }
                        }
                }
        };
        assertTrue(Arrays.deepEquals(expected, Main.replaceToStringLength(arrayOfTask22)));
    }

    @Test
    void shouldFindFirstAnLastSameLetter() {
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
        assertEquals(26, Main.findFirstAnLastSameLetter(arrayOFTask23));
    }

    @Test
    void shouldConcatenateAllString() {
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
        String actual = Main.concatenateAllString(arrayOfTask24);
        String expected = "HelloworldJavarocksChatGPTAIfuncodecoolbeansopenAIyesGPTNeotextgensmartbraindatatrainlogicloopzipzapredgreenbluepinkfastslowinout";
        assertEquals(expected, actual);
    }
}
