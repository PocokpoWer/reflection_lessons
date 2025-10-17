import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvExport {
    public static void exportCsvFile(List<Sensor> sensors, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("SensorType,ID,TimeStamp, Value\n");
            for (Sensor e : sensors) {
                writer.write(String.format("SensorType: %s,ID: %d,%s,%n", e.sensorType(), e.getId(), e.getReadings()));
            }
            writer.flush();
            writer.close();
            System.out.println("Csv export finished: " + filename);
        } catch (IOException e) {
            System.err.println("Error exporting CSV file: " + e.getMessage());
        }
    }
}
