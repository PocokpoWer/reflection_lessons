import picocli.CommandLine;
import service.TaskService;

public class Main {
    static void main(String[] args) {
        TaskService taskService = new TaskService();
        CommandLine commandLine = new CommandLine(taskService);
        commandLine.execute("addCommand", "-t", "Test task", "-d", "Test description");
        commandLine.execute("addCommand", "-t", "Test task2", "-d", "Test description2");
        commandLine.execute("listCommand");
        commandLine.execute("deleteCommand", "-i", "1");
        commandLine.execute("listCommand");
    }
}
