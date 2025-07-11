import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class UserCommentAnalyzerTest {
    private Path tempFile;

    @BeforeEach
    void setUp() throws IOException {
        tempFile = Files.createTempFile("sampletest2", ".csv");

        List<String> lines = List.of("Lilu,liludallas@email.hu,Lilu Dallas Multi Pass", "Dzseki Csen,valami:).hu@email,this comment");
        Files.write(tempFile, lines);
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(tempFile);
    }

    @Test
    public void shouldRead() throws IOException {
        UserCommentAnalyzer userCommentAnalyzer = new UserCommentAnalyzer();
        List<User> result = userCommentAnalyzer.read(tempFile.toString());

        assertEquals("Lilu", result.get(0).getUsername());
        assertEquals("liludallas@email.hu", result.get(0).getEmail());
        assertEquals("Lilu Dallas Multi Pass", result.get(0).getComment());
        assertEquals("Dzseki Csen", result.get(1).getUsername());
        assertEquals("", result.get(1).getEmail());
        assertEquals("this comment", result.get(1).getComment());
    }
}
