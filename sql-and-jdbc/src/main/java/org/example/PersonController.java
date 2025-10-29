package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class PersonController {
    private final AddPerson addPerson;
    private final UpdatePerson updatePerson;
    private final DeletePerson deletePerson;
    private final ReadPerson readPerson;

    public PersonController(PersonManager personManager) {
        this.addPerson = new AddPerson(personManager);
        this.updatePerson = new UpdatePerson(personManager);
        this.deletePerson = new DeletePerson(personManager);
        this.readPerson = new ReadPerson(personManager);
    }

    void start() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Choice a function" +
                "1 - Add person\n" +
                "2 - Update person\n" +
                "3 - Delete person\n" +
                "4 - Read person\n");
        int inputChoice = scanner.nextInt();
        scanner.nextLine();
        switch (inputChoice) {
            case 1:
                addPerson.add();
                break;
            case 2:
                updatePerson.update();
                break;
            case 3:
                deletePerson.delete();
                break;
            case 4:
                readPerson.read();
                break;
            default:
                System.out.println("Incorrect number");
        }
    }
}
