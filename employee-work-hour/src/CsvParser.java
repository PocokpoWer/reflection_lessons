import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class CsvParser {
    List<Employee> employees = new ArrayList<>();

    public void read(String file) throws IOException {
        List<String> parseText = Files.readAllLines(Path.of(file));
        for (String line : parseText) {
            if (!Objects.equals(line, "Name,Department,Monday,Tuesday,Wednesday,Thursday,Friday")) {
                String[] splitLine = line.split(",");
                String name = splitLine[0];
                String department = splitLine[1];
                Map<String, Integer> shiftHours = getShiftOnDay(splitLine);
                employees.add(new Employee(name, department, shiftHours));
            }
        }
    }

    private static Map<String, Integer> getShiftOnDay(String[] splitLine) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Map<String, Integer> shiftHours = new HashMap<>();
        int weekDaysIndex = 0;
        shiftHours.put(weekDays[weekDaysIndex++], Integer.parseInt(splitLine[2]));
        shiftHours.put(weekDays[weekDaysIndex++], Integer.parseInt(splitLine[3]));
        shiftHours.put(weekDays[weekDaysIndex++], Integer.parseInt(splitLine[4]));
        shiftHours.put(weekDays[weekDaysIndex++], Integer.parseInt(splitLine[5]));
        shiftHours.put(weekDays[weekDaysIndex], Integer.parseInt(splitLine[6]));
        return shiftHours;
    }
}
