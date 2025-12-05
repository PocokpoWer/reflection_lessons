package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class JsonWriter {
    ObjectMapper objectMapper = new ObjectMapper();

    void writeJson(List<User> inputLine, Path path) throws IOException {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File(path.toString()), inputLine);
    }
}
