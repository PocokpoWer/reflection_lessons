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
public class PostRequestCommand implements Command<String> {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final HttpClient client = HttpClient.newHttpClient();
    private final String postURL;
    private final String formData;

    @Override
    public String execute() throws IOException, InterruptedException {
        log.info("Sending post request to {}", postURL);
        try {
            HttpRequest postRequest = HttpRequest.newBuilder()
                    .uri(URI.create(postURL))
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .POST(HttpRequest.BodyPublishers.ofString(formData))
                    .build();
            HttpResponse<String> postResponse = client.send(postRequest, HttpResponse.BodyHandlers.ofString());
            Object jsonFormat2 = objectMapper.readValue(postResponse.body(), Object.class);
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            String jsonPostFormat = objectMapper.writeValueAsString(jsonFormat2);
            logResponse(postResponse, jsonPostFormat);
            return jsonPostFormat;
        } catch (IOException | InterruptedException e) {
            log.error("Error sending post request to {}: {}", postURL, e.getMessage());
            throw e;
        }
    }

    private void logResponse(HttpResponse<String> postResponse, String jsonPostFormat) {
        log.info("Status code: {}", postResponse.statusCode());
        log.info("Body: \n {}", jsonPostFormat);
    }
}