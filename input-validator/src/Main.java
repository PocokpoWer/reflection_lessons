import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        UserCommentAnalyzer userCommentAnalyzer = new UserCommentAnalyzer();
        System.out.println(userCommentAnalyzer.read("src/sample.csv"));
    }
}