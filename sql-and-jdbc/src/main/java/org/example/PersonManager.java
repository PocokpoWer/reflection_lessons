package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonManager implements PersonRepository {
    private final Connection connection;

    public PersonManager(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addPerson(Person person) throws SQLException {
        String query = "INSERT INTO person (first_name, last_name, mother_name, father_name, birth_date, gender, highest_education, number_of_children) values (?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, person.getFirstName());
        preparedStatement.setString(2, person.getLastName());
        preparedStatement.setString(3, person.getMotherName());
        preparedStatement.setString(4, person.getFatherName());
        preparedStatement.setDate(5, (Date) person.getBirthDate());
        preparedStatement.setString(6, String.valueOf(person.getGender()));
        preparedStatement.setString(7, String.valueOf(person.getHighestEducation()));
        preparedStatement.setInt(8, person.getNumberOfChildren());
        preparedStatement.executeUpdate();
    }

    @Override
    public void updatePerson(Person person) throws SQLException {
        String query = "UPDATE person SET first_name = ?, last_name = ?, mother_name = ?, father_name = ?, birth_date = ?, gender = ?, highest_education = ?, number_of_children = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, person.getFirstName());
        preparedStatement.setString(2, person.getLastName());
        preparedStatement.setString(3, person.getMotherName());
        preparedStatement.setString(4, person.getFatherName());
        preparedStatement.setDate(5, (Date) person.getBirthDate());
        preparedStatement.setString(6, String.valueOf(person.getGender()));
        preparedStatement.setString(7, String.valueOf(person.getHighestEducation()));
        preparedStatement.setInt(8, person.getNumberOfChildren());
        preparedStatement.setLong(9, person.getId());
        preparedStatement.executeUpdate();
    }

    @Override
    public void deletePerson(Person person) throws SQLException {
        String query = "DELETE FROM person WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setLong(1, person.getId());
        preparedStatement.executeUpdate();
    }

    @Override
    public List<Person> getAllPerson() throws SQLException {
        String query = "SELECT * FROM person";
        List<Person> list = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            Person person = new Person();
            person.setId(Long.parseLong(rs.getString("id")));
            person.setFirstName(rs.getString("first_name"));
            person.setLastName(rs.getString("last_name"));
            person.setMotherName(rs.getString("mother_name"));
            person.setFatherName(rs.getString("father_name"));
            person.setBirthDate(rs.getDate("birth_date"));
            person.setGender(Gender.valueOf(rs.getString("gender")));
            person.setHighestEducation(HighestEducation.valueOf(rs.getString("highest_education")));
            person.setNumberOfChildren(Integer.parseInt(rs.getString("number_of_children")));
            list.add(person);
        }
        return list;
    }
}
