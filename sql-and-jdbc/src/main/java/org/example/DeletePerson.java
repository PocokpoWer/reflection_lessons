package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class DeletePerson {
    private final PersonManager personManager;

    public DeletePerson(PersonManager personManager) {
        this.personManager = personManager;
    }

    void delete() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Id:");
        int idNumber = scanner.nextInt();
        personManager.deletePerson(idNumber);
    }
}
