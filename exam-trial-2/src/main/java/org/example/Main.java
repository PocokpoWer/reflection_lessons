package org.example;

import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CsvWriter csvWriter = new CsvWriter();
        JsonWriter jsonWriter = new JsonWriter();
        List<User> peoples = new ArrayList<>();

        System.out.println("How many employees do you want to add? ");
        int employeesNumber = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < employeesNumber; i++) {
            System.out.println("Write a name: ");
            String name = scanner.nextLine();
            System.out.println("Write an age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Write a department: ");
            String department = scanner.nextLine();
            System.out.println("Write a salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            User user = User.builder()
                    .name(name)
                    .age(age)
                    .department(department)
                    .salary(salary)
                    .build();
            peoples.add(user);
        }

        System.out.println("What format would you like to write in? (csv/json)");
        String format = scanner.nextLine().trim().toLowerCase();

        if (format.equals("csv")) {
            try {
                csvWriter.writeCsv(peoples, Path.of("employees.csv"));
                System.out.println("CSV done!");
            } catch (CsvException | IOException e) {
                e.getMessage();
            }
        } else if (format.equals("json")) {
            try {
                jsonWriter.writeJson(peoples, Path.of("employees.json"));
                System.out.println("Json done!");
            } catch (IOException e) {
                e.getMessage();
            }
        } else {
            System.out.println("Unknown format");
        }
        scanner.close();
    }
}