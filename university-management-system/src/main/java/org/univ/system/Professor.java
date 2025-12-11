package org.univ.system;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Professor {
    private String name;
    private Faculty faculty;
    private int yearsOfExperience;
}
