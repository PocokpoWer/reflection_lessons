package org.example;

public class CommentValidator implements Validator<String> {
    @Override
    public boolean isValid(String input) {
        String regex = "^[A-Za-z0-9 _!?.$-]+$";
        return input.matches(regex);
    }
}
