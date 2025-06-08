import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Employee> employees = new ArrayList<>();

        List<String> parseText = Files.readAllLines(Path.of("c:\\employee_hours.csv"));
        for (String line : parseText) {
            if (!Objects.equals(line, "Name,Department,Monday,Tuesday,Wednesday,Thursday,Friday")) {
                String[] splitLine = line.split(",");
                String name = splitLine[0];
                String department = splitLine[1];
                List<Integer> shiftHours = Arrays.asList(
                        Integer.parseInt(splitLine[2]),
                        Integer.parseInt(splitLine[3]),
                        Integer.parseInt(splitLine[4]),
                        Integer.parseInt(splitLine[5]),
                        Integer.parseInt(splitLine[6])
                );
                employees.add(new Employee(name, department, shiftHours));
            }
        }
        System.out.println(employees);

        // Determine the total weekly hours worked for each employee
        for (int i = 0; i < employees.size(); i++) {
            System.out.printf("%s %d %n", employees.get(i).name, sumTotalWeeklyHours(employees.get(i).shiftHours));
        }
        System.out.println();

        // Calculate the average daily hours for each employee
        for (int i = 0; i < employees.size(); i++) {
            System.out.printf("%s %.2f %n", employees.get(i).name, calcAverageWeeklyHours(employees.get(i).shiftHours));
        }
        System.out.println();

        // Determine the average weekly hours in each department
        for (int i = 0; i < employees.size(); i++) {
            String currentDepartment = employees.get(i).getDepartment();
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (employees.get(k).getDepartment().equals(currentDepartment)) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                int sum = 0;
                int count = 0;

                for (int j = 0; j < employees.size(); j++) {
                    if (employees.get(j).getDepartment().equals(currentDepartment)) {
                        sum += sumTotalWeeklyHours(employees.get(j).getShiftHours());
                        count++;
                    }
                }

                double avg = (double) sum / count;
                System.out.printf("%s average weekly hours: %.2f%n", currentDepartment, avg);
            }
        }
        System.out.println();
        // Determine the average weekly hours in each department
        List<Integer> sumHours = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            System.out.printf("%s %d %n", employees.get(i).department, sumTotalWeeklyHours(employees.get(i).shiftHours));
        }
        // Identify the employee with the highest total hours globally
        int weeklyHour = sumTotalWeeklyHours(employees.get(0).shiftHours);
        String employeeName = employees.get(0).name;
        for (int i = 1; i < employees.size(); i++) {
            if (sumTotalWeeklyHours(employees.get(i).shiftHours) > weeklyHour) {
                employeeName = employees.get(i).name;
                weeklyHour = sumTotalWeeklyHours(employees.get(i).shiftHours);
            }
        }
        System.out.printf("%s highest total with %d hours %n", employeeName, weeklyHour);
        System.out.println();
    }

    public static int sumTotalWeeklyHours(List<Integer> number) {
        int result = 0;
        for (Integer integer : number) {
            result += integer;
        }
        return result;
    }

    public static double calcAverageWeeklyHours(List<Integer> number) {
        int result = 0;
        for (Integer integer : number) {
            result += integer;
        }
        return (double) result / number.size();
    }
}
