package service;

import model.Task;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {
    @BeforeAll
    static void setUp() {
        Task task1 = TaskService.addTask("Test task", "Test description");
        Task task2 = TaskService.addTask("Test task2", "Test description_2");
        Task task3 = TaskService.addTask("Test task3", "Test description_3");
        Task task4 = TaskService.addTask("Test task4", "Test description_4");
    }

    @Test
    void addTask() {
        TaskService.addTask("Test task", "Test description");
        assertEquals(5, TaskService.getAllTasks().size());
    }

    @Test
    void getAllTasks() {
        assertEquals(5, TaskService.getAllTasks().size());
    }

    @Test
    void deleteTask() {
        TaskService.deleteTask(3L);
        assertEquals(4, TaskService.getAllTasks().size());
    }
}