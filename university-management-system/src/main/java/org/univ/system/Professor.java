package org.univ.system;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Professor {
    private String name;
    private Faculty faculty;
    private int yearsOfExperience;
}
