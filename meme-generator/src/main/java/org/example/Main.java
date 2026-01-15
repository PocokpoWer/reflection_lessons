package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Scanner scanner = new Scanner(System.in);
    private static final ObjectMapper objectMapper = new ObjectMapper();

    static void main() throws IOException, InterruptedException {
        String getURL = "https://api.imgflip.com/get_memes";
        String postURL = "https://api.imgflip.com/caption_image";

        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create(getURL))
                .GET()
                .build();
        HttpResponse<String> response = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        Object json = objectMapper.readValue(response.body(), Object.class);
        String jsonFormat = objectMapper.writeValueAsString(json);
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Body: \n" + jsonFormat);

        System.out.println("Choice your favorite meme and enter id: :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your imgflip username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your imgflip password: ");
        String password = scanner.nextLine();
        System.out.println("Enter you text on the meme: ");
        String text1 = scanner.nextLine();
        System.out.println("Enter you another text on the meme: ");
        String text2 = scanner.nextLine();

        String formData = "template_id=" + id + "&username=" + username + "&password=" + password + "&text0=" + text1 + "&text1=" + text2;

        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(URI.create(postURL))
                .header("Content-Type", "application/x-www-form-urlencoded")
                .POST(HttpRequest.BodyPublishers.ofString(formData))
                .build();

        HttpResponse<String> postResponse = client.send(postRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code: " + postResponse.statusCode());
        Object jsonFormat2 = objectMapper.readValue(postResponse.body(), Object.class);
        String jsonPostFormat = objectMapper.writeValueAsString(jsonFormat2);
        System.out.println("Body: \n" + jsonPostFormat);

        scanner.close();
    }
}