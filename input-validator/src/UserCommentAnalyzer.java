import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class UserCommentAnalyzer {
    public void reader(String file) throws IOException {
        Validator<String> usernamevalidator = new UsernameValidator();
        Validator<String> emailvalidator = new EmailValidator();
        Validator<String> commentvalidator = new CommentValidator();

        List<String> fileContent = Files.readAllLines(Path.of(file));

        for (String line : fileContent) {
            String[] splitLine = line.split(",", 3);
            String userName = Sanitizer.sanitize(splitLine[0]);
            String email = Sanitizer.sanitize(splitLine[1]);
            String comment = Sanitizer.sanitize(splitLine[2]);
            if (usernamevalidator.isValid(userName) || emailvalidator.isValid(email) || commentvalidator.isValid(comment)) {
                User user = new User(userName, email, comment);
                System.out.println(user);
            }
        }
    }
}
