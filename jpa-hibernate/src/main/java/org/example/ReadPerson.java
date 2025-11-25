package org.example;

import org.springframework.stereotype.Component;

@Component
public class ReadPerson {
    private final PersonService personService;

    public ReadPerson(PersonService personService) {
        this.personService = personService;
    }

    void findAllPerson() {
        personService.findAllPerson().forEach(System.out::println);
    }
}
