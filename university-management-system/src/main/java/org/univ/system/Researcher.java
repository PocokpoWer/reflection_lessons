package org.univ.system;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Researcher implements Enrollable {
    private String name;
    private String researchArea;
    private int yearsOfResearchExperience;
}
