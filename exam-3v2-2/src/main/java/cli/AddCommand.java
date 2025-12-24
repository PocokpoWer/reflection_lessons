package cli;

import lombok.NoArgsConstructor;
import service.TaskService;

import static picocli.CommandLine.*;

@NoArgsConstructor
@Command(name = "addCommand")
public class AddCommand implements Runnable {
    @Option(names = {"-t", "--title"}, description = "Task title")
    private String title;

    @Option(names = {"-d", "--description"}, description = "Task description")
    private String description;

    private TaskService taskService;

    public AddCommand(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void run() {
        TaskService.addTask(title, description);
        System.out.println("Task added");
    }
}
