package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {
    private String username;
    private String email;
    private String comment;

    @Override
    public String toString() {
        return String.format("Username: %s Email: %s Comment: %s\n", username, email, comment);
    }
}
