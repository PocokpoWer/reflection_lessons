package org.example;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
}
