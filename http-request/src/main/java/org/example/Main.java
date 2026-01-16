package org.example;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.Arrays;

public class Main {
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final GetRequestCommand<BlogPostResponse[]> getRequest = new GetRequestCommand(URLConstants.GET_POSTS, BlogPostResponse[].class);
    private static final GetRequestCommand<BlogPostResponse> getRequestWithPost = new GetRequestCommand(URLConstants.GET_POST_1, BlogPostResponse.class);
    private static final GetRequestCommand<BlogPostResponse2[]> getRequestGetComments = new GetRequestCommand(URLConstants.GET_COMMENTS, BlogPostResponse2[].class);
    private static final GetRequestCommand<BlogPostResponse2[]> getRequestGetPostById = new GetRequestCommand(URLConstants.GET_POST_ID_1, BlogPostResponse2[].class);
    private static final PostRequestCommand<BlogPostResponse> postRequest = new PostRequestCommand<>(URLConstants.POST, URLConstants.JSONPOST, BlogPostResponse.class);
    private static final PutRequestCommand<BlogPostResponse> putRequest = new PutRequestCommand<>(URLConstants.PUT_POST_1, URLConstants.JSON_FOR_PUT, BlogPostResponse.class);
    private static final PatchRequestCommand<BlogPostResponse> patchRequest = new PatchRequestCommand<>(URLConstants.PATCH_POST_1, URLConstants.JSON_FOR_PATCH, BlogPostResponse.class);
    private static final DeleteRequestCommand deleteRequest = new DeleteRequestCommand(URLConstants.DELETE_POST_1);

    public static void main(String[] args) throws IOException, InterruptedException {
        try (client) {
            System.out.println("Task 1:");
            BlogPostResponse[] get1 = getRequest.execute();
            System.out.println("Object version:");
            Arrays.stream(get1).forEach(System.out::println);
            System.out.println();
            System.out.println("Task 2:");
            BlogPostResponse get2 = getRequestWithPost.execute();
            System.out.println("Object version:");
            System.out.println(get2);
            System.out.println();
            System.out.println("Task 3:");
            BlogPostResponse2[] get3 = getRequestGetComments.execute();
            System.out.println("Object version:");
            System.out.println(Arrays.toString(get3));
            System.out.println();
            System.out.println("Task 4:");
            BlogPostResponse2[] get4 = getRequestGetPostById.execute();
            System.out.println(Arrays.toString(get4));
            System.out.println();
            System.out.println("Task 5:");
            BlogPostResponse post = postRequest.execute();
            System.out.println(post);
            System.out.println();
            System.out.println("Task 6:");
            BlogPostResponse put = putRequest.execute();
            System.out.println(put);
            System.out.println();
            System.out.println("Task 7:");
            BlogPostResponse patch = patchRequest.execute();
            System.out.println(patch);
            System.out.println();
            System.out.println("Task 8:");
            deleteRequest.execute();
        }
    }
}