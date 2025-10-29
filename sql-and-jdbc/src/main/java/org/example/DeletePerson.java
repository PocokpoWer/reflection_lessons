package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class DeletePerson {
    PersonManager personManager;
    Person person;

    public DeletePerson(PersonManager personManager) {
        this.personManager = personManager;
    }

    void delete() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Id:");
        int idNumber = scanner.nextInt();
        person = new Person(idNumber);
        personManager.deletePerson(person);
    }
}
