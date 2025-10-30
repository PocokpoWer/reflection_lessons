package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    @Override
    public String toString() {
        return String.format("ID: %d, First name: %s, Last name: %s, Mother name: %s, Father name: %s, Birthdate: %s, Gender: %s, Highest Education: %s, Children: %d", getId(), getFirstName(), getLastName(), getMotherName(), getFatherName(), getBirthDate(), getGender(), getHighestEducation(), getNumberOfChildren());
    }
}
