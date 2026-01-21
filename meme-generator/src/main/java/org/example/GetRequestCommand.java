package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Slf4j
@RequiredArgsConstructor
public class GetRequestCommand implements Command<String> {
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private final String getURL;

    @Override
    public String execute() throws IOException, InterruptedException {
        log.info("Sending get request to {}", getURL);
        try {
            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(URI.create(getURL))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            Object json = objectMapper.readValue(response.body(), Object.class);
            String jsonFormat = objectMapper.writeValueAsString(json);
            logResponse(response);
            return jsonFormat;
        } catch (IOException | InterruptedException e) {
            log.error("Error sending get request to {}: {}", getURL, e.getMessage());
            throw e;
        }
    }

    private void logResponse(HttpResponse<String> response) {
        log.info("Status code: {}", response.statusCode());
        log.info("Body: \n {}", response.body());
    }
}