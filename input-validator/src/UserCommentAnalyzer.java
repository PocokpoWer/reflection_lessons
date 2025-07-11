import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class UserCommentAnalyzer {
    public List<User> read(String file) throws IOException {
        Validator<String> usernamevalidator = new UsernameValidator();
        Validator<String> emailvalidator = new EmailValidator();
        Validator<String> commentvalidator = new CommentValidator();
        List<User> users = new ArrayList<>();
        List<String> fileContent = Files.readAllLines(Path.of(file));

        for (String line : fileContent) {
            String[] splitLine = line.split(",", 3);
            String userName = Sanitizer.sanitize(splitLine[0]);
            String email = Sanitizer.sanitize(splitLine[1]);
            String comment = Sanitizer.sanitize(splitLine[2]);
            boolean isValidUser = usernamevalidator.isValid(userName);
            boolean isValidEmail = emailvalidator.isValid(email);
            boolean isValidComment = commentvalidator.isValid(comment);

            if (!isValidUser) {
                userName = "";
            }
            if (!isValidEmail) {
                email = "";
            }
            if (!isValidComment) {
                comment = "";
            }

            users.add(new User(userName, email, comment));
        }
        return users;
    }
}
