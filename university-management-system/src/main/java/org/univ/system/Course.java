package org.univ.system;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;
@Getter
public class Course {
    private String courseCode;
    private String courseName;
    private Professor professor;
    private Set<Enrollable> enrolledParticipants = new HashSet<>();

    public Course(String courseCode, String courseName, Professor professor, Set<Enrollable> enrolledParticipants) {
        if (courseCode.matches("[A-Z]{3}-\\d{3}]"))
            this.courseCode = courseCode;
        this.courseName = courseName;
        this.professor = professor;
        this.enrolledParticipants = enrolledParticipants;
    }

    void enrollParticipant(Enrollable enrollable) {
        if (!enrolledParticipants.add(enrollable)) ;
    }
}
