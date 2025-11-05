package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class Main {
    static void main() {
        // N+1 query problem
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_practice-pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Course> list = entityManager.createQuery("SELECT c FROM Course c", Course.class).getResultList();
        for (Course c : list) {
            System.out.println(c.getName() + ": " + c.getDescription());
        }

        List<Student> students = entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
        for (Student s : students) {
            System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getEmail());
        }

        // Only one SQl query
        List<Course> list2 = entityManager.createQuery(
                "SELECT DISTINCT c FROM Course c JOIN FETCH c.students", Course.class
        ).getResultList();
        for (Course c : list2)
            for (Student s : c.getStudents())
                System.out.println(c.getName() + " - " + s.getFirstName());
    }
}
