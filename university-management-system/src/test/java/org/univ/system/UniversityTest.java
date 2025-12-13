package org.univ.system;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniversityTest {
    University university = University.getInstance();

    @Test
    void shouldParticipantsOfCourse() {
        Course course = new Course("MAT-123", "Linear algebra", new Professor("Dr. X", Faculty.COMPUTER_SCIENCE, 5));
        Student s1 = new Student("Zsolt", "654987", Faculty.COMPUTER_SCIENCE);
        Student s2 = new Student("Bob", "1458723", Faculty.ENGINEERING);
        course.enrollParticipant(s1);
        course.enrollParticipant(s2);

        List<Enrollable> result = university.getParticipantsOfCourse(course);

        assertEquals(2, result.size());
        assertTrue(result.containsAll(List.of(s1, s2)));
        assertNotSame(course.getEnrolledParticipants(), result);
    }

    @Test
    void shouldCoursesProfessor() {
        Professor prof = new Professor("Dr. X", Faculty.CHEMICAL_ENGINEERING, 5);
        Professor other = new Professor("Dr. Y", Faculty.COMPUTER_SCIENCE, 10);

        Course c1 = new Course("FAK-458", "Train driver", prof);
        Course c2 = new Course("PHY-111", "Bus driver", prof);
        Course c3 = new Course("CHE-471", "hygiene manager", other);

        university.offerCourse(c1);
        university.offerCourse(c2);
        university.offerCourse(c3);

        List<Course> result = university.getCoursesProfessor(prof);

        assertEquals(List.of(c1, c2), result);
    }
}