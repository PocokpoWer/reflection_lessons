package org.univ.system;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Researcher implements Enrollable {
    private String name;
    private String researchArea;
    private int yearsOfResearchExperience;
}
