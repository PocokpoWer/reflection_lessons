import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    private String fileName;
    private BufferedWriter writer;

    public FileLogger(String fileName) throws IOException {
        this.fileName = fileName;
        this.writer = new BufferedWriter(new FileWriter(fileName, true));
    }

    @Override
    public void log(String message) throws IOException {
        writer.write(message);
        writer.newLine();
        writer.flush();
    }

    void close() throws IOException {
        writer.close();
    }
}
