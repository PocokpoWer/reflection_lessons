package org.example;

import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@Component
public class AddPerson {
    private final Scanner scanner = new Scanner(System.in);
    private final PersonService personService;

    public AddPerson(PersonService personService) {
        this.personService = personService;
    }

    void add() throws ParseException {
        System.out.println("Enter a first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter a last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter a mother name: ");
        String motherName = scanner.nextLine();
        System.out.println("Enter a father name: ");
        String fatherName = scanner.nextLine();
        System.out.println("Enter a birth date (yyyy-mm-dd): ");
        Date birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(scanner.nextLine());
        System.out.println("Enter a gender: ");
        Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Enter a highest education: ");
        HighestEducation highestEducation = HighestEducation.valueOf(scanner.nextLine().toUpperCase().replace(' ', '_'));
        System.out.println("Enter children number: ");
        int number_of_children = scanner.nextInt();
        Person person = Person.builder()
                .firstName(firstName)
                .lastName(lastName)
                .motherName(motherName)
                .fatherName(fatherName)
                .birthDate(birthDate)
                .gender(gender)
                .highestEducation(highestEducation)
                .numberOfChildren(number_of_children).build();
        personService.addPerson(person);
    }
}
