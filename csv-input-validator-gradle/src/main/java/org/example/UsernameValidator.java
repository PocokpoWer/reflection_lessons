package org.example;

public class UsernameValidator implements Validator<String> {
    @Override
    public boolean isValid(String input) {
        String regex = "^[a-zA-Z0-9]+$";
        return input.matches(regex);
    }
}
