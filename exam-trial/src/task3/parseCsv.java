package task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class parseCsv {
    public static Set<Person> read(String file) throws IOException {
        Set<Person> result = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            String[] split = line.split(",");
            String name = split[0].trim();
            int age = Integer.parseInt(split[1].trim());
            Person person = new Person.Builder().setAge(age).setName(name).build();
            result.add(person);
        }
        return result;
    }
}
