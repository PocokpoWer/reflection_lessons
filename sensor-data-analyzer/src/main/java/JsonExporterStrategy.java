import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonExporterStrategy<T> implements Exporter<T> {
    @Override
    public void fileExporter(List<T> list, String file) {
        try {
            new ObjectMapper()
                    .writerWithDefaultPrettyPrinter().writeValue(new File(file), list);
            System.out.println("JSON export finished: " + file);
        } catch (IOException e) {
            System.err.println("Error exporting JSON file: " + e.getMessage());
        }
    }
}