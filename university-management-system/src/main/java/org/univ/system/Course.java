package org.univ.system;

import exceptions.CourseAlreadyExistHandleException;
import lombok.Getter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@ToString
public class Course {
    private String courseCode;
    private String courseName;
    private Professor professor;
    private Set<Enrollable> enrolledParticipants = new HashSet<>();

    public Course(String courseCode, String courseName, Professor professor) {
        if (!courseCode.matches("[A-Z]{3}-\\d{3}")) {
            throw new IllegalArgumentException("Invalid course code format");
        }
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.professor = professor;
    }

    public void enrollParticipant(Enrollable enrollable) {
        if (enrollable == null) {
            throw new IllegalArgumentException("Participant cannot be null");
        }
        if (enrolledParticipants.contains(enrollable)) {
            throw new CourseAlreadyExistHandleException("Participant already enrolled");
        }
        enrolledParticipants.add(enrollable);
    }
}
