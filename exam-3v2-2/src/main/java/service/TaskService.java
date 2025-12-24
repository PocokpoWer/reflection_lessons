package service;

import cli.AddCommand;
import cli.DeleteCommand;
import cli.ListCommand;
import model.Task;

import java.util.ArrayList;
import java.util.List;

import static picocli.CommandLine.*;

@Command(name = "task", mixinStandardHelpOptions = true, subcommands = {AddCommand.class, ListCommand.class, DeleteCommand.class})
public class TaskService implements Runnable {
    static long taskId = 1;

    @Override
    public void run() {
        System.out.println("Choose command: add, list or delete");
    }

    private static List<Task> tasks = new ArrayList<>();

    public static Task addTask(String title, String description) {
        Task task = Task.builder().id(taskId++).title(title).description(description).build();
        tasks.add(task);
        return task;
    }

    public static List<Task> getAllTasks() {
        List<Task> list = new ArrayList<>(tasks);
        return list;
    }

    public static void deleteTask(Long id) {
        tasks.removeIf(tasks -> tasks.getId().equals(id));
    }
}