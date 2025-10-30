package org.example;

import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

public class FindPerson {
    private final PersonManager personManager;

    public FindPerson(PersonManager personManager) {
        this.personManager = personManager;
    }

    Optional<Person> findPersonById() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Person ID: ");
        int numberInput = scanner.nextInt();
        return personManager.findPersonById(numberInput);
    }
}
