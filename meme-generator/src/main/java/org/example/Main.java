package org.example;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.Scanner;

public class Main {
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Scanner scanner = new Scanner(System.in);

    static void main() throws IOException, InterruptedException {
        try (client; scanner) {
            GetRequestCommand getRequest = new GetRequestCommand(URLConstants.getURL);
            System.out.println(getRequest.execute());

            PostRequestCommand postRequest = new PostRequestCommand(URLConstants.postURL, getUserInput(scanner));
            System.out.println(postRequest.execute());
        }
    }

    private static String getUserInput(Scanner scanner) {
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
        return String.format("template_id=%d&username=%s&password=%s&text0=%s&text1=%s", id, username, password, text1, text2);
    }
}