package org.example;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

public class AddPerson {
    PersonManager personManager;
    Person person;

    public AddPerson(PersonManager personManager) {
        this.personManager = personManager;
    }

    void add() throws SQLException {
        Scanner scanner = new Scanner(System.in);
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
        person = new Person(firstName, lastName, motherName, fatherName, Date.valueOf(birthDate), gender, highestEducation, children);
        personManager.addPerson(person);
        scanner.close();
    }
}
