package org.univ.system;

import exceptions.AlreadyExistException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniversityTest {
    private static final University university = University.getInstance();

    @Test
    void shouldGetOfferCourse() {
        Course course = new Course("MAT-123", "Linear algebra", new Professor("Dr. X", Faculty.COMPUTER_SCIENCE, 5));
        Course course2 = new Course("FLY-003", "Vektor", new Professor("Dr. XY", Faculty.ENGINEERING, 10));

        List<Course> list = List.of(course, course2);
        university.offerCourse(course);
        assertTrue(list.containsAll(List.of(course, course2)));
        assertEquals(2, list.size());
    }

    @Test
    void shouldGetOfferCourseThrow() {
        Course course = new Course("MAT-123", "Linear algebra", new Professor("Dr. X", Faculty.COMPUTER_SCIENCE, 5));
        university.offerCourse(course);
        assertThrows(AlreadyExistException.class, () -> university.offerCourse(course));
    }

    @Test
    void shouldHireProfessor() {
        Professor professor = new Professor("Dr. Tihamér", Faculty.CHEMICAL_ENGINEERING, 2);
        List<Professor> list = List.of(professor);
        assertEquals(1, list.size());
        assertTrue(list.contains(professor));
    }

    @Test
    void shouldHireProfessorThrow() {
        Professor professor = new Professor("Dr. Tihamér", Faculty.CHEMICAL_ENGINEERING, 2);
        university.hireProfessor(professor);
        assertThrows(AlreadyExistException.class, () -> university.hireProfessor(professor));
    }

    @Test
    void shouldAdmitEnrollable() {
        Student student = new Student("Zsolt", "654987", Faculty.COMPUTER_SCIENCE);
        Researcher researcher = new Researcher("Dr. X", "AI", 5);
        List<Enrollable> list = List.of(student, researcher);
        assertEquals(2, list.size());
        assertTrue(list.containsAll(List.of(student, researcher)));
    }

    @Test
    void shouldAdmitEnrollableThrow() {
        Student student = new Student("Zsolt", "654987", Faculty.COMPUTER_SCIENCE);
        university.admitEnrollable(student);
        assertThrows(AlreadyExistException.class, () -> university.admitEnrollable(student));
    }

    @Test
    void shouldAddParticipantsToCourse() {
        Course course = new Course("MAT-123", "Linear algebra", new Professor("Dr. X", Faculty.COMPUTER_SCIENCE, 5));
        Student s1 = new Student("Zsolt", "654987", Faculty.COMPUTER_SCIENCE);
        Student s2 = new Student("Bob", "1458723", Faculty.ENGINEERING);
        course.enrollParticipant(s1);
        course.enrollParticipant(s2);

        List<Enrollable> result = university.getParticipantsToCourse(course);

        assertEquals(2, result.size());
        assertTrue(result.containsAll(List.of(s1, s2)));
    }

    @Test
    void shouldGetCoursesWithProfessor() {
        Professor prof = new Professor("Dr. X", Faculty.CHEMICAL_ENGINEERING, 5);
        Professor other = new Professor("Dr. Y", Faculty.COMPUTER_SCIENCE, 10);

        Course c1 = new Course("FAK-458", "Train driver", prof);
        Course c2 = new Course("PHY-111", "Bus driver", prof);
        Course c3 = new Course("CHE-471", "hygiene manager", other);

        university.offerCourse(c1);
        university.offerCourse(c2);
        university.offerCourse(c3);

        List<Course> result = university.getCoursesProfessor(prof);
        assertEquals(2, result.size());
        assertTrue(result.containsAll(List.of(c1, c2)));
    }
}