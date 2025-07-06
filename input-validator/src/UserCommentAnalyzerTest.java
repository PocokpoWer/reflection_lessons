import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class UserCommentAnalyzerTest {
    @Test
    public void shouldRead() throws IOException {
        UserCommentAnalyzer userCommentAnalyzer = new UserCommentAnalyzer();
        List<User> result = userCommentAnalyzer.read("src/sampletest.csv");
        assertEquals("Lilu", result.get(0).getUsername());
        assertEquals("liludallas@email.hu", result.get(0).getEmail());
        assertEquals("Lilu Dallas Multi Pass", result.get(0).getComment());
        assertEquals("Dzseki Csen", result.get(1).getUsername());
        assertEquals("", result.get(1).getEmail());
    }
}
