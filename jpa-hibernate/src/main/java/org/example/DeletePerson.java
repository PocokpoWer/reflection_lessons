package org.example;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class DeletePerson {
    private final PersonService personService;
    private final Scanner scanner = new Scanner(System.in);

    public DeletePerson(PersonService personService) {
        this.personService = personService;
    }

    void delete() {
        System.out.println("Write an ID number: ");
        long inputNUmber = scanner.nextLong();
        personService.deletePerson(inputNUmber);
    }
}
