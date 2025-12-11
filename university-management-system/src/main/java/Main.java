import org.univ.system.*;

public class Main {
    static void main() {
        University university = University.getInstance();

        Professor professor1 = new Professor("Kovács Béla", Faculty.COMPUTER_SCIENCE, 10);
        Professor professor2 = new Professor("Horváth Aladár", Faculty.CHEMICAL_ENGINEERING, 5);

        university.hireProfessor(professor1);
        university.hireProfessor(professor2);

        Course course1 = new Course("MAT-001", "Java Backend Developer", professor1);
        Course course2 = new Course("FAK-458", "Java Frontend Developer", professor1);
        Course course3 = new Course("TAM-100", "Chemical", professor2);

        university.offerCourse(course1);
        university.offerCourse(course2);
        university.offerCourse(course3);

        Student student1 = new Student("Farkas Tibor", "3214866", Faculty.COMPUTER_SCIENCE);
        Student student2 = new Student("Kovács Attila", "654987", Faculty.COMPUTER_SCIENCE);
        Researcher researcher = new Researcher("Dr. Ábrahám Attila", "AI", 5);

        university.admitEnrollable(student1);
        university.admitEnrollable(student2);
        university.admitEnrollable(researcher);

        course1.enrollParticipant(student1);
        course1.enrollParticipant(student2);
        course2.enrollParticipant(student1);
        course2.enrollParticipant(student2);
        course3.enrollParticipant(researcher);

        for (Enrollable enrollable : university.getParticipantsOfCourse(course1)) {
            System.out.println(enrollable);
        }
        System.out.println();
        for (Course course : university.getCoursesProfessor(professor1)) {
            System.out.println(course);
        }

    }
}
