package org.example;

import java.sql.SQLException;
import java.util.List;

public interface PersonRepository {
    void addPerson(Person person) throws SQLException;

    void updatePerson(Person person) throws SQLException;

    void deletePerson(Person person) throws SQLException;

    List<Person> getAllPerson() throws SQLException;
}
