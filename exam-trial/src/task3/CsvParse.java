package task3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CsvParse {
    public static Set<Person> read(String file) throws IOException {
        List<String> dataFromFile = Files.readAllLines(Path.of(file));
        Set<Person> result = new HashSet<>();
        for (String line : dataFromFile) {
            String[] split = line.split(",", 2);
            String name = split[0];
            int age = Integer.parseInt(split[1].trim());
            Person person = new Person.Builder().setName(name).setAge(age).build();
            result.add(person);
        }
        return result;
    }
}
