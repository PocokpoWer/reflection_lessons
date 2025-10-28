package org.example;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "mother_name")
    private String motherName;
    @Column(name = "father_name")
    private String fatherName;
    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;
    @Enumerated(EnumType.STRING)
    @Column(name = "highest_education")
    private HighestEducation highestEducation;
    @Column(name = "number_of_children")
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
        return String.format("ID: %d, First name: %s, Last name: %s, Mother name: %s, Father name: %s, Birthdate: %s, Gender: %s, Highest Education: %s, Children: %s\n", getId(), getFirstName(), getLastName(), getMotherName(), getFatherName(), getBirthDate(), getGender(), getHighestEducation(), getNumberOfChildren());
    }
}
