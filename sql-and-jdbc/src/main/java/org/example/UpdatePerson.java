package org.example;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePerson {
    private final PersonManager personManager;
    private Person person;

    public UpdatePerson(PersonManager personManager) {
        this.personManager = personManager;
    }

    void update() throws SQLException {
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
        person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setMotherName(motherName);
        person.setFatherName(fatherName);
        person.setBirthDate(Date.valueOf(birthDate));
        person.setGender(gender);
        person.setHighestEducation(highestEducation);
        person.setNumberOfChildren(children);
        personManager.updatePerson(person);
    }
}
