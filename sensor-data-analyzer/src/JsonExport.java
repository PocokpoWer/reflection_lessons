import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExport {
    public static void exportJson(List<Sensor> list, String filename) {
        try {
            new ObjectMapper()
                    .writerWithDefaultPrettyPrinter().writeValue(new File(filename), list);
            System.out.println("JSON export finished: " + filename);
        } catch (IOException e) {
            System.err.println("Error exporting JSON file: " + e.getMessage());
        }
    }
}