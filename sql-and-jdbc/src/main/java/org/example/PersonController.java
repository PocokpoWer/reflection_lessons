package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class PersonController {
    private final AddPerson addPerson;
    private final GetPerson getPerson;
    private final UpdatePerson updatePerson;
    private final DeletePerson deletePerson;
    private final ReadPerson readPerson;

    public PersonController(PersonManager personManager) {
        this.addPerson = new AddPerson(personManager);
        this.getPerson = new GetPerson(personManager);
        this.updatePerson = new UpdatePerson(personManager);
        this.deletePerson = new DeletePerson(personManager);
        this.readPerson = new ReadPerson(personManager);
    }

    void start() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Choice a function\n" +
                    "1 - Add person\n" +
                    "2 - Get Person By ID" +
                    "3 - Update person\n" +
                    "4 - Delete person\n" +
                    "5 - Read person\n" +
                    "6 - Exit\n");
            int inputChoice = scanner.nextInt();
            switch (inputChoice) {
                case 1:
                    addPerson.add();
                    break;
                case 2:
                    getPerson.getPersonById();
                    break;
                case 3:
                    updatePerson.update();
                    break;
                case 4:
                    deletePerson.delete();
                    break;
                case 5:
                    readPerson.read();
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect number");
            }
        }
    }
}
