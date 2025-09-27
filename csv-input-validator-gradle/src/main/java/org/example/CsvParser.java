package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {
    public List<User> read(String file) throws MyCustomException {
        List<User> users = new ArrayList<>();
        try {
            Validator<String> usernameValidator = new UsernameValidator();
            Validator<String> emailValidator = new EmailValidator();
            Validator<String> commentValidator = new CommentValidator();
            List<String> fileContent = Files.readAllLines(Path.of(file));
            for (String s : fileContent) {
                String[] split = s.split(",", 3);
                String name = Sanitizer.sanitize(split[0]);
                String email = Sanitizer.sanitize(split[1]);
                String comment = Sanitizer.sanitize(split[2]);
                boolean isValidUser = usernameValidator.isValid(name);
                boolean isValidEmail = emailValidator.isValid(email);
                boolean isValidComment = commentValidator.isValid(comment);
                if (!isValidUser) {
                    name = "";
                }
                if (!isValidEmail) {
                    email = "";
                }
                if (!isValidComment) {
                    comment = "";
                }
                users.add(new User(name, email, comment));
            }
        } catch (IOException e) {
            throw new MyCustomException("Unique Failed to read file: " + file, e);
        }
        return users;
    }
}
