package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;

import java.util.ArrayList;
import java.util.List;

public class CourseDAO {
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_practice-pu");

    void addCourse(Course course) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(course);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
                throw e;
            }
        } finally {
            entityManager.close();
        }
    }

    Course findCourseById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Course course;
        try {
            course = entityManager.find(Course.class, id);
        } catch (RuntimeException e) {
            throw e;
        } finally {
            entityManager.close();
        }
        return course;
    }

    void updateCourse(Course course) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(course);
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (RuntimeException e) {
            throw e;
        } finally {
            entityManager.close();
        }
    }

    void deleteCourse(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            Course course = entityManager.find(Course.class, id);
            entityManager.remove(course);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
            throw e;
        }
        entityManager.close();
    }
}
