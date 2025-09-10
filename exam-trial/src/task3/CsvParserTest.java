package task3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class CsvParserTest {
    @TempDir
    Path tempDir;

    @Test
    void shouldCsvParser() throws IOException {
        Path csv = tempDir.resolve("tempFile.csv");
        Files.write(csv, java.util.List.of(
                "Alice, 30",
                "Bob,25"
        ));

        Set<Person> people = CsvParser.read(csv.toString());

        assertEquals(2, people.size());

        Person alice = new Person.Builder().setName("Alice").setAge(30).build();
        Person bob = new Person.Builder().setName("Bob").setAge(25).build();

        assertTrue(people.contains(alice));
        assertTrue(people.contains(bob));
    }
}
