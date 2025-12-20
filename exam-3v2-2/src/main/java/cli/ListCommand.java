package cli;

import model.Task;
import service.TaskService;

import java.util.ArrayList;
import java.util.List;

import static picocli.CommandLine.*;

@Command(name = "listCommand")
public class ListCommand implements Runnable {
    @Option(names = {"-l", "--list"}, description = "List all tasks")
    List<Task> tasks = new ArrayList<>();

    @Override
    public void run() {
        tasks = TaskService.getAllTasks();
        tasks.forEach(System.out::println);
        System.out.println("Total tasks: " + tasks.size());
    }
}
