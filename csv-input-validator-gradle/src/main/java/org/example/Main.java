package org.example;

import java.nio.file.Paths;

class Main {
    public static void main(String[] args) {
        try {
            CsvParser csvParser = new CsvParser();
            var url = Main.class.getResource("/sample.csv");
            if (url == null) throw new MyCustomException("Resource not found on classpath: /sample.csv");
            var path = Paths.get(url.toURI());
            var result = csvParser.read(path.toString());
            System.out.println(result);
        } catch (MyCustomException e) {
            System.err.println("Custom error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}