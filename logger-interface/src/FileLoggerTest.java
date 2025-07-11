import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class FileLoggerTest {
    private Path tempLogFile;

    @BeforeEach
    void setup() throws IOException {
        tempLogFile = Files.createTempFile("testlog", ".csv");
    }

    @AfterEach
    void closing() throws IOException {
        Files.deleteIfExists(tempLogFile);
    }

    @Test
    void shouldLog() throws IOException {
        FileLogger logger = new FileLogger(tempLogFile.toString());

        logger.log("Hello logger");
        logger.log("Második sor");
        logger.close();
        String content = Files.readString(tempLogFile);
        String[] lines = content.split(System.lineSeparator());

        assertEquals(2, lines.length);
        assertEquals("Hello logger", lines[0]);
        assertEquals("Második sor", lines[1]);
    }
}
