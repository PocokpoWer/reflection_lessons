package org.example;


import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ObjectMapper mapper = new ObjectMapper();
        String GET1 = "https://jsonplaceholder.typicode.com/posts";
        String GET2 = "https://jsonplaceholder.typicode.com/posts/1";
        String GET3 = "https://jsonplaceholder.typicode.com/posts/1/comments";
        String GET4 = "https://jsonplaceholder.typicode.com/comments?postId=1";
        String POST = "https://jsonplaceholder.typicode.com/posts";
        String PUT = "https://jsonplaceholder.typicode.com/posts/1";
        String PATCH = "https://jsonplaceholder.typicode.com/posts/1";
        String DELETE = "https://jsonplaceholder.typicode.com/posts/1";
        String jsonPost = """
                  {"title":"hello","body":"world","userId":1}
                """;
        String jsonForPut = """
                  {"userId":1,"id":1,"title":"updated title","body":"updated body"}
                """;
        String jsonForPatch = """
                  {"userId":1,"id":1,"title":"updated title with patch","body":"updated body with patch"}
                """;
        String jsonForDelete = """
                  {"userId":1,"id":1,"title":"updated title","body":"updated body"}
                """;

        try (HttpClient client = HttpClient.newHttpClient()) {
            System.out.println("Task 1:");
            BlogPostResponse[] get1 = getRequestAndParse(client, mapper, GET1, BlogPostResponse[].class);
            System.out.println("Object version:");
            Arrays.stream(get1).forEach(System.out::println);
            System.out.println();
            System.out.println("Task 2:");
            BlogPostResponse get2 = getRequestAndParse(client, mapper, GET2, BlogPostResponse.class);
            System.out.println("Object version:");
            System.out.println(get2);
            System.out.println();
            System.out.println("Task 3:");
            BlogPostResponse2[] get3 = getRequestAndParse(client, mapper, GET3, BlogPostResponse2[].class);
            System.out.println("Object version:");
            System.out.println(Arrays.toString(get3));
            System.out.println();
            System.out.println("Task 4:");
            BlogPostResponse2[] get4 = getRequestAndParse(client, mapper, GET4, BlogPostResponse2[].class);
            System.out.println(Arrays.toString(get4));
            System.out.println();
            System.out.println("Task 5:");
            BlogPostResponse post = postRequestAndParse(client, mapper, POST, jsonPost, BlogPostResponse.class);
            System.out.println(post);
            System.out.println();
            System.out.println("Task 6:");
            BlogPostResponse put = putRequestAndParse(client, mapper, PUT, jsonForPut, BlogPostResponse.class);
            System.out.println(put);
            System.out.println();
            System.out.println("Task 7:");
            BlogPostResponse patch = patchRequestAndParse(client, mapper, PATCH, jsonForPatch, BlogPostResponse.class);
            System.out.println(patch);
            System.out.println();
            System.out.println("Task 8:");
            deleteRequest(DELETE);
        }
    }

    private static void deleteRequest(String url) throws IOException, InterruptedException {
        HttpRequest deleteRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json, charset=UTF-8")
                .header("Accept", "application/json")
                .DELETE()
                .build();
        System.out.println("Delete request sent.");
    }

    private static <T> T patchRequestAndParse(HttpClient client, ObjectMapper mapper, String url, String jsonPatch, Class<T> responseType) throws IOException, InterruptedException {
        HttpRequest patchRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json, charset=UTF-8")
                .header("Accept", "application/json")
                .method("PATCH", HttpRequest.BodyPublishers.ofString(jsonPatch))
                .build();
        HttpResponse<String> response = client.send(patchRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response body: " + response.body());
        return mapper.readValue(response.body(), responseType);
    }

    private static <T> T putRequestAndParse(HttpClient client, ObjectMapper mapper, String url, String jsonPut, Class<T> responseType) throws IOException, InterruptedException {
        HttpRequest putRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json, charset=UTF-8")
                .header("Accept", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(jsonPut))
                .build();

        HttpResponse<String> putResponse = client.send(putRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code: " + putResponse.statusCode());
        System.out.println("Response body: " + putResponse.body());
        return mapper.readValue(putResponse.body(), responseType);
    }

    private static <T> T postRequestAndParse(HttpClient client, ObjectMapper mapper, String url, String jsonPost, Class<T> responseType) throws IOException, InterruptedException {
        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonPost))
                .build();

        HttpResponse<String> response = client.send(postRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response body: " + response.body());
        return mapper.readValue(response.body(), responseType);
    }

    private static <T> T getRequestAndParse(HttpClient client, ObjectMapper mapper, String url, Class<T> responseType) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Response body: " + response.body());
        return mapper.readValue(response.body(), responseType);
    }
}