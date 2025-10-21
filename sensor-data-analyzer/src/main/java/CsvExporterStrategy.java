import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvExporterStrategy<T> implements Exporter<T> {
    @Override
    public void fileExporter(List<T> list, String file) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("SensorType,ID,TimeStamp, Value\n");
            for (T content : list) {
                writer.write(content.toString() + "\n");
            }
            writer.flush();
            writer.close();
            System.out.println("Csv export finished: " + file);
        } catch (IOException e) {
            System.err.println("Error exporting CSV file: " + e.getMessage());
        }
    }
}
