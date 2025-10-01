import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {
    public List<City> read(String filePath) throws IOException {
        List<String> temperaturesData = Files.readAllLines(Path.of(filePath));
        List<City> tempData = new ArrayList<>();
        for (String line : temperaturesData) {
            String[] splitLine = line.split(",", 2);
            tempData.add(new City(splitLine[0], Integer.valueOf(splitLine[1])));
        }
        return tempData;
    }
}
