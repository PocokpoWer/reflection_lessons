package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CsvParserTest {
    private static Path tempFile;

    @BeforeAll
    static void setUp() throws IOException {
        tempFile = Files.createTempFile("users_sample", ".csv");
        Files.write(tempFile, List.of(
                "John,john@example.com,I am glad to see you",
                "Bruce,bruce@example.com,How are you?"
        ));
    }

    @AfterAll
    static void tearDown() throws IOException {
        Files.deleteIfExists(tempFile);
    }

    @Test
    public void shouldRead() throws MyCustomException {
        CsvParser csvParser = new CsvParser();

        List<User> users = csvParser.read(tempFile.toString());

        assertEquals(2, users.size());

        User first = users.get(0);
        assertEquals("John", first.getUsername());
        assertEquals("john@example.com", first.getEmail());
        assertEquals("I am glad to see you", first.getComment());

        User second = users.get(1);
        assertEquals("Bruce", second.getUsername());
        assertEquals("bruce@example.com", second.getEmail());
        assertEquals("How are you?", second.getComment());
    }
}