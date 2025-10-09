import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExport {
    public static void exportJson(List<Sensor> list, String filename) {
        var payload = list.stream()
                .map(s -> Map.of(
                        "ID", s.getId(),
                        "SensorType", s.sensorType(),
                        "Readings", s.getReadings().stream()
                                .map(r -> Map.of("Value", r.value(),
                                        "Timestamp", String.valueOf(r.timestamp())
                                ))
                                .collect(Collectors.toList())
                ))
                .collect(Collectors.toList());
        try {
            new ObjectMapper()
                    .writerWithDefaultPrettyPrinter().writeValue(new File(filename), payload);
            System.out.println("JSON export finished: " + filename);
        } catch (IOException e) {
            System.err.println("Error exporting JSON file: " + e.getMessage());
        }
    }
}