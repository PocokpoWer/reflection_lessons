package org.example;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;

public class Main {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException, InterruptedException {

        try (client) {
            System.out.println("Task 1:");
            BlogPostResponse[] get1 = getRequestAndParse(URLConstants.GET_POSTS, BlogPostResponse[].class);
            System.out.println("Object version:");
            Arrays.stream(get1).forEach(System.out::println);
            System.out.println();
            System.out.println("Task 2:");
            BlogPostResponse get2 = getRequestAndParse(URLConstants.GET_POSTS_1, BlogPostResponse.class);
            System.out.println("Object version:");
            System.out.println(get2);
            System.out.println();
            System.out.println("Task 3:");
            BlogPostResponse2[] get3 = getRequestAndParse(URLConstants.GET_COMMENTS, BlogPostResponse2[].class);
            System.out.println("Object version:");
            System.out.println(Arrays.toString(get3));
            System.out.println();
            System.out.println("Task 4:");
            BlogPostResponse2[] get4 = getRequestAndParse(URLConstants.GET_POST_ID_1, BlogPostResponse2[].class);
            System.out.println(Arrays.toString(get4));
            System.out.println();
            System.out.println("Task 5:");
            BlogPostResponse post = postRequestAndParse(URLConstants.POST, URLConstants.JSONPOST, BlogPostResponse.class);
            System.out.println(post);
            System.out.println();
            System.out.println("Task 6:");
            BlogPostResponse put = putRequestAndParse(URLConstants.PUT_POST_1, URLConstants.JSON_FOR_PUT, BlogPostResponse.class);
            System.out.println(put);
            System.out.println();
            System.out.println("Task 7:");
            BlogPostResponse patch = patchRequestAndParse(URLConstants.PATCH_POST_1, URLConstants.JSON_FOR_PATCH, BlogPostResponse.class);
            System.out.println(patch);
            System.out.println();
            System.out.println("Task 8:");
            deleteRequest(URLConstants.DELETE_POST_1);
        }
    }

    private static void deleteRequest(String url) throws IOException, InterruptedException {
        String jsonBody = "{\"id\":1}";
        HttpRequest deleteRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json, charset=UTF-8")
                .header("Accept", "application/json")
                .method("DELETE", HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        HttpResponse<String> response = client.send(deleteRequest, HttpResponse.BodyHandlers.ofString());

        logger.info("Status code: " + response.statusCode());
        logger.debug("Body: " + response.body());
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response body: " + response.body());
        System.out.println("Delete request sent.");
    }

    private static <T> T patchRequestAndParse(String url, String jsonPatch, Class<T> responseType) throws IOException, InterruptedException {
        HttpRequest patchRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json, charset=UTF-8")
                .header("Accept", "application/json")
                .method("PATCH", HttpRequest.BodyPublishers.ofString(jsonPatch))
                .build();
        HttpResponse<String> response = client.send(patchRequest, HttpResponse.BodyHandlers.ofString());
        logger.info("Status code: " + response.statusCode());
        logger.debug("Body: " + response.body());
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response body: " + response.body());
        return mapper.readValue(response.body(), responseType);
    }

    private static <T> T putRequestAndParse(String url, String jsonPut, Class<T> responseType) throws IOException, InterruptedException {
        HttpRequest putRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json, charset=UTF-8")
                .header("Accept", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(jsonPut))
                .build();

        HttpResponse<String> putResponse = client.send(putRequest, HttpResponse.BodyHandlers.ofString());
        logger.info("Status code: " + putResponse.statusCode());
        logger.debug("Body: " + putResponse.body());
        System.out.println("Status code: " + putResponse.statusCode());
        System.out.println("Response body: " + putResponse.body());
        return mapper.readValue(putResponse.body(), responseType);
    }

    private static <T> T postRequestAndParse(String url, String jsonPost, Class<T> responseType) throws IOException, InterruptedException {
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonPost))
                .build();

        HttpResponse<String> response = client.send(postRequest, HttpResponse.BodyHandlers.ofString());
        logger.info("Status code: " + response.statusCode());
        logger.debug("Body: " + response.body());
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response body: " + response.body());
        return mapper.readValue(response.body(), responseType);
    }

    private static <T> T getRequestAndParse(String url, Class<T> responseType) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        logger.info("Status code: " + response.statusCode());
        logger.debug("Body: " + response.body());
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response body: " + response.body());
        return mapper.readValue(response.body(), responseType);
    }
}