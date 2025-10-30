package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class GetPerson {
    private final PersonManager personManager;

    public GetPerson(PersonManager personManager) {
        this.personManager = personManager;
    }

    void getPersonById() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Pesron ID: ");
        int numberInput = scanner.nextInt();
        personManager.getPersonById(numberInput);
    }
}
