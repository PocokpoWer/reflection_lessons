package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RequiredArgsConstructor
public class GetRequestCommand implements Command<String> {
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Logger logger = LoggerFactory.getLogger(GetRequestCommand.class);
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private final String getURL;

    @Override
    public String execute() throws IOException, InterruptedException {
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
    }

    private void logResponse(HttpResponse<String> response) {
        logger.info("Status code: " + response.statusCode());
        logger.info("Body: \n" + response.body());
    }
}