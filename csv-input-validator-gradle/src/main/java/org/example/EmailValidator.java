package org.example;

public class EmailValidator implements Validator<String> {
    @Override
    public boolean isValid(String input) {
        String regex = "[a-zA-Z0-9.]+@[a-zA-Z]+\\.[a-z]{2,3}";
        return input.matches(regex);
    }
}
