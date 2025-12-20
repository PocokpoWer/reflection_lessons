package cli;

import lombok.NoArgsConstructor;
import service.TaskService;

import static picocli.CommandLine.*;

@NoArgsConstructor
@Command(name = "deleteCommand")
public class DeleteCommand implements Runnable {
    @Option(names = {"-i", "--id"}, description = "Task id")
    private long id;

    private TaskService taskService;

    public DeleteCommand(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void run() {
        TaskService.deleteTask(id);
        System.out.println("Task deleted");
    }
}
