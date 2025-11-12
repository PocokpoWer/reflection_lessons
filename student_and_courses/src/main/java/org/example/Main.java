package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Root;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        // N+1 query problem
        List<Course> list = entityManager.createQuery("SELECT c FROM Course c", Course.class).getResultList();
        for (Course c : list) {
            System.out.println(c.getName() + ": " + c.getDescription());
        }

        List<Student> students = entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
        for (Student s : students) {
            System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getEmail());
        }

        // Only one SQl query
        List<Course> list2 = findAllCourses();
        for (Course c : list2) {
            for (Student s : c.getStudents()) {
                System.out.println(c.getName() + " - " + s.getFirstName());
            }
        }
    }

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_practice-pu");
    private static final EntityManager entityManager = emf.createEntityManager();

    static List<Course> findAllCourses() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Course> cq = cb.createQuery(Course.class);
        Root<Course> list = cq.from(Course.class);
        list.fetch("students", JoinType.INNER);
        cq.select(list).distinct(true);
        return entityManager.createQuery(cq).getResultList();
    }
}
