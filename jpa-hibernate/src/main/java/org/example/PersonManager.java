package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Scanner;

@Component
public class PersonManager {
    private final AddPerson addPerson;
    private final FindPerson findPerson;
    private final UpdatePerson updatePerson;
    private final DeletePerson deletePerson;
    private final ReadPerson readPerson;

    @Autowired
    public PersonManager(AddPerson addPerson,
                         FindPerson findPerson,
                         UpdatePerson updatePerson,
                         DeletePerson deletePerson,
                         ReadPerson readPerson) {
        this.addPerson = addPerson;
        this.findPerson = findPerson;
        this.updatePerson = updatePerson;
        this.deletePerson = deletePerson;
        this.readPerson = readPerson;
    }

    void start() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Choice a function\n" +
                    "1 - Add person\n" +
                    "2 - Get Person By ID\n" +
                    "3 - Update person\n" +
                    "4 - Delete person\n" +
                    "5 - Read person\n" +
                    "6 - Exit\n");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    addPerson.add();
                    break;
                case 2:
                    findPerson.findPersonById();
                    break;
                case 3:
                    updatePerson.update();
                    break;
                case 4:
                    deletePerson.delete();
                    break;
                case 5:
                    readPerson.findAllPerson();
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Incorrect number");
                    break;
            }
        }
    }
}
