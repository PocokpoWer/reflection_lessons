package org.univ.system;

import exceptions.AlreadyExistHandleException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class University {
    private static University instance;

    private Set<Course> courses = new HashSet<>();
    private Set<Professor> professors = new HashSet<>();
    private Set<Enrollable> participants = new HashSet<>();

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }

    public void offerCourse(Course course) {
        if (!courses.add(course)) {
            throw new AlreadyExistHandleException("Course already offered");
        }
    }

    public void hireProfessor(Professor professor) {
        if (!professors.add(professor)) {
            throw new AlreadyExistHandleException("Professor already hired");
        }
    }

    public void admitEnrollable(Enrollable enrollable) {
        if (!participants.add(enrollable)) {
            throw new AlreadyExistHandleException("Participant already admitted");
        }
    }

    // The task requires this method.
    public List<Enrollable> getParticipantsOfCourse(Course course) {
        return new ArrayList<>(course.getEnrolledParticipants());
    }

    public List<Course> getCoursesProfessor(Professor professor) {
        return courses.stream().filter(course -> course.getProfessor().equals(professor)).toList();
    }
}
