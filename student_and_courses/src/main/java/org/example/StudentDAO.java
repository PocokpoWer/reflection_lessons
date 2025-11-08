package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StudentDAO {
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_practice-pu");

    void addStudent(Student student) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(student);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
            throw e;
        } finally {
            entityManager.close();
        }
    }

    Student findStudentById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Student student;
        try {
            student = entityManager.find(Student.class, id);
        } catch (RuntimeException e) {
            throw e;
        } finally {
            entityManager.close();
        }
        return student;
    }

    void updateCourse(Student student) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(student);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
            throw e;
        } finally {
            entityManager.close();
        }
    }

    void deleteStudent(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Student student = entityManager.find(Student.class, id);
            entityManager.remove(student);
            entityManager.getTransaction().commit();

        } catch (RuntimeException e) {
            throw e;
        } finally {
            entityManager.close();
        }
    }
}
