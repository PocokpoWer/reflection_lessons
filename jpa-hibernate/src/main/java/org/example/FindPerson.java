package org.example;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class FindPerson {
    private final PersonService personService;
    private final Scanner scanner = new Scanner(System.in);

    public FindPerson(PersonService personService) {
        this.personService = personService;
    }

    void findPersonById() {
        System.out.println("Write an ID number:");
        long idNUmber = scanner.nextLong();
        personService.findPersonById(idNUmber);
    }
}
