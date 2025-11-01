package org.example;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    void addPerson(Person person) throws SQLException;

    Optional<Person> findPersonById(int numberInput) throws SQLException;

    void updatePerson(Person person) throws SQLException;

    void deletePerson(int number) throws SQLException;

    List<Person> getAllPerson() throws SQLException;
}
