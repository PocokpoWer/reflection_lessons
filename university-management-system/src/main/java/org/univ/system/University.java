package org.univ.system;

import exceptions.CourseAlreadyExistHandleException;
import exceptions.EnrollableAlreadyExistHandleException;
import exceptions.ProfessorAlreadyExistHandleException;

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
            throw new CourseAlreadyExistHandleException("Course already offered");
        } else {
            courses.add(course);
        }
    }

    public void hireProfessor(Professor professor) {
        if (!professors.add(professor)) {
            throw new ProfessorAlreadyExistHandleException("Professor already hired");
        } else {
            professors.add(professor);
        }
    }

    public void admitEnrollable(Enrollable enrollable) {
        if (!participants.add(enrollable)) {
            throw new EnrollableAlreadyExistHandleException("Participant already admitted");
        } else {
            participants.add(enrollable);
        }
    }

    public List<Enrollable> getParticipantsOfCourse(Course course) {
        return new ArrayList<>(course.getEnrolledParticipants());
    }

    public List<Course> getCoursesProfessor(Professor professor) {
        List<Course> list = new ArrayList<>();
        for (Course c : courses) {
            if (c.getProfessor().equals(professor)) {
                list.add(c);
            }
        }
        return list;
    }
}
