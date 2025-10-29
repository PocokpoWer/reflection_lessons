package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Person {
    private long id;
    private String firstName;
    private String lastName;
    private String motherName;
    private String fatherName;
    private Date birthDate;
    private Gender gender;
    private HighestEducation highestEducation;
    private int numberOfChildren;

    public Person(String firstName, String lastName, String motherName, String fatherName, Date birthDate, Gender gender, HighestEducation highestEducation, int numberOfChildren) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.highestEducation = highestEducation;
        this.numberOfChildren = numberOfChildren;
    }

    public Person(long id) {
        this.id = id;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return String.format("ID: %d, First name: %s, Last name: %s, Mother name: %s, Father name: %s, Birthdate: %s, Gender: %s, Highest Education: %s, Children: %d\n", getId(), getFirstName(), getLastName(), getMotherName(), getFatherName(), getBirthDate(), getGender(), getHighestEducation(), getNumberOfChildren());
    }
}
