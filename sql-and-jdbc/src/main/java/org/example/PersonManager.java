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
    public void getPersonById(int numberInput) throws SQLException {
        String query = "SELECT first_name, last_name, mother_name, father_name, birth_date, gender, highest_education, number_of_children FROM person WHERE id = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setLong(1, numberInput);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            System.out.println("First name: " + rs.getString("first_name"));
            System.out.println("Last name: " + rs.getString("last_name"));
            System.out.println("Mother name: " + rs.getString("mother_name"));
            System.out.println("Father name: " + rs.getString("father_name"));
            System.out.println("Birth date: " + rs.getString("birth_date"));
            System.out.println("Gender: " + rs.getString("gender"));
            System.out.println("Highest education: " + rs.getString("highest_education"));
            System.out.println("Number of children: " + rs.getString("number_of_children"));
            System.out.println();
        } else {
            System.out.println("No person found with ID: " + numberInput);
        }
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
    public void deletePerson(int numberInput) throws SQLException {
        String query = "DELETE FROM person WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setLong(1, numberInput);
        preparedStatement.executeUpdate();
    }

    @Override
    public List<Person> getAllPerson() throws SQLException {
        String query = "SELECT id, first_name, last_name, mother_name, father_name, birth_date, gender, highest_education, number_of_children FROM person";
        List<Person> list = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            Person person = new Person(
                    Long.parseLong(rs.getString("id")),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("mother_name"),
                    rs.getString("father_name"),
                    rs.getDate("birth_date"),
                    Gender.valueOf(rs.getString("gender")),
                    HighestEducation.valueOf(rs.getString("highest_education")),
                    Integer.parseInt(rs.getString("number_of_children")));
            list.add(person);
        }
        return list;
    }
}
