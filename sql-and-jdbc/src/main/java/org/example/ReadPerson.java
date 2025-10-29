package org.example;

import java.sql.SQLException;

public class ReadPerson {
    PersonManager personManager;

    public ReadPerson(PersonManager personManager) {
        this.personManager = personManager;
    }

    void read() throws SQLException {
        personManager.getAllPerson().forEach(System.out::print);
    }
}
