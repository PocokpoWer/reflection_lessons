public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.printf("Message: %s\n", message);
    }
}
