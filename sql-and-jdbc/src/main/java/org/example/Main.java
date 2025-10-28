package org.example;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Date;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        Scanner scanner = new Scanner(System.in);
        properties.load(new FileReader("src/main/resources/application.yml"));
        String url = properties.getProperty("connection-string");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            PersonManager personManager = new PersonManager(connection);
            System.out.println("Connected to MySql!");
            System.out.printf("Choice a function:\n" +
                    "1 - Add a person\n" +
                    "2 - Update a person\n" +
                    "3 - Delete a person\n" +
                    "4 - List all person\n");
            int inputChoice = scanner.nextInt();
            scanner.nextLine();
            switch (inputChoice) {
                case 1:
                    System.out.println("First name:");
                    String firstName = scanner.nextLine();
                    System.out.println("Last name:");
                    String lastName = scanner.nextLine();
                    System.out.println("Mother name:");
                    String motherName = scanner.nextLine();
                    System.out.println("Father name:");
                    String fatherName = scanner.nextLine();
                    System.out.println("Birthdate(yyyy-mm-dd):");
                    String birthDate = scanner.nextLine();
                    System.out.println("Gender:");
                    Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());
                    System.out.println("Highest Education:");
                    HighestEducation highestEducation = HighestEducation.valueOf(scanner.nextLine().toUpperCase());
                    System.out.println("Children:");
                    int children = scanner.nextInt();
                    scanner.nextLine();
                    Person person1 = new Person(firstName, lastName, motherName, fatherName, Date.valueOf(birthDate), gender, highestEducation, children);
                    personManager.addPerson(person1);
                    break;
                case 2:
                    System.out.println("First name:");
                    firstName = scanner.nextLine();
                    System.out.println("Last name:");
                    lastName = scanner.nextLine();
                    System.out.println("Mother name:");
                    motherName = scanner.nextLine();
                    System.out.println("Father name:");
                    fatherName = scanner.nextLine();
                    System.out.println("Birthdate(yyyy-mm-dd):");
                    birthDate = scanner.nextLine();
                    System.out.println("Gender:");
                    gender = Gender.valueOf(scanner.nextLine().toUpperCase());
                    System.out.println("Highest Education:");
                    highestEducation = HighestEducation.valueOf(scanner.nextLine().toUpperCase());
                    System.out.println("Children:");
                    children = scanner.nextInt();
                    scanner.nextLine();
                    Person person2 = new Person(firstName, lastName, motherName, fatherName, Date.valueOf(birthDate), gender, highestEducation, children);
                    personManager.updatePerson(person2);
                    break;
                case 3:
                    System.out.println("Id:");
                    int idNumber = scanner.nextInt();
                    Person person = new Person(idNumber);
                    personManager.deletePerson(person);
                    break;
                case 4:
                    personManager.getAllPerson().stream().forEach(System.out::print);
                    break;
                default:
                    System.out.println("Incorrect number!");
            }
            scanner.close();
        } catch (SQLException e) {
            System.err.println("Error MySql connecting: " + e.getMessage());
        }
    }
}