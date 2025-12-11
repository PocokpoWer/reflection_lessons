package org.example;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static final CsvWriter csvWriter = new CsvWriter();
    public static final JsonWriter jsonWriter = new JsonWriter();
    public static List<User> peoples = new ArrayList<>();

    public static void main(String[] args) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException {


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
        chooseWriter(format);
        scanner.close();
    }

    private static void chooseWriter(String format) throws CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, IOException {
        if (format.equals("csv")) {
            csvWriter.write(peoples, Path.of("employees.csv"));
            System.out.println("CSV done!");
        } else if (format.equals("json")) {
            jsonWriter.write(peoples, Path.of("employees.json"));
            System.out.println("Json done!");
        } else {
            throw new RuntimeException("Unknown format");
        }
    }
}