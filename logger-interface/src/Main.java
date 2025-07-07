import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger("file.txt");

        consoleLogger.log("Hello World!");
        fileLogger.log("Lilu Dallas Multi Pass");
        fileLogger.log("something message");
    }
}