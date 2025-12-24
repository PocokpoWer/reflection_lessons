package org.univ.system;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Researcher implements Enrollable {
    private String name;
    private String researchArea;
    private int yearsOfResearchExperience;
}
