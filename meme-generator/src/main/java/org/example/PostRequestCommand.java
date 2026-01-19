package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    private static final Logger logger = LoggerFactory.getLogger(PostRequestCommand.class);
    private final String postURL;
    private final String formData;

    @Override
    public String execute() throws IOException, InterruptedException {
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
    }

    private void logResponse(HttpResponse<String> postResponse, String jsonPostFormat) {
        logger.info("Status code: ", postResponse.statusCode());
        logger.info("Body: \n", jsonPostFormat);
    }
}