package org.example;

public class Sanitizer {
    public static String sanitize(String input) {
        return input.replaceAll("<.*?>", "");
    }
}
