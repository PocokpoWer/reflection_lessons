package org.example;

public class URLConstants {
    protected static String GET_POSTS = "https://jsonplaceholder.typicode.com/posts";
    protected static String GET_POSTS_1 = "https://jsonplaceholder.typicode.com/posts/1";
    protected static String GET_COMMENTS = "https://jsonplaceholder.typicode.com/posts/1/comments";
    protected static String GET_POST_ID_1 = "https://jsonplaceholder.typicode.com/comments?postId=1";
    protected static String POST = "https://jsonplaceholder.typicode.com/posts";
    protected static String PUT_POST_1 = "https://jsonplaceholder.typicode.com/posts/1";
    protected static String PATCH_POST_1 = "https://jsonplaceholder.typicode.com/posts/1";
    protected static String DELETE_POST_1 = "https://jsonplaceholder.typicode.com/posts/1";
    protected static String JSONPOST = """
              {"title":"hello","body":"world","userId":1}
            """;
    protected static String JSON_FOR_PUT = """
              {"userId":1,"id":1,"title":"updated title","body":"updated body"}
            """;
    protected static String JSON_FOR_PATCH = """
              {"userId":1,"id":1,"title":"updated title with patch","body":"updated body with patch"}
            """;
}