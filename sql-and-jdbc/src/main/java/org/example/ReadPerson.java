package org.example;

import lombok.AllArgsConstructor;

import java.sql.SQLException;

@AllArgsConstructor
public class ReadPerson {
    private final PersonManager personManager;

    void read() throws SQLException {
        personManager.getAllPerson().forEach(System.out::println);
    }
}
