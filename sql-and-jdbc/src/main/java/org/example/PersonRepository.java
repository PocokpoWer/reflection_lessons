package org.example;

import java.sql.SQLException;
import java.util.List;

public interface PersonRepository {
    void addPerson(Person person) throws SQLException;

    void getPersonById(int numberInput) throws SQLException;

    void updatePerson(Person person) throws SQLException;

    void deletePerson(int number) throws SQLException;

    List<Person> getAllPerson() throws SQLException;
}
