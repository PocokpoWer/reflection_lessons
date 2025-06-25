import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Csvparser csvparser = new Csvparser();
        EmployeeAnalyzer analyzer = new EmployeeAnalyzer();
        csvparser.reader("c:\\employee_hours.csv");
        List<Employee> employees = csvparser.employees;

        // Determine the total weekly hours worked for each employee
        System.out.println(analyzer.printEmployeeList(employees));
        System.out.println();
        // Calculate the average daily hours for each employee
        System.out.println(analyzer.calculateDailyHourAverage(employees));
        System.out.println();
        // Determine the average weekly hours in each department
        System.out.println(analyzer.calculateWeeklyHourAverage(employees));
        System.out.println();
        // Identify the employee with the highest total hours globally
        System.out.println(analyzer.calculateHighestTotalHour(employees));
        System.out.println();
        // Identify the employee with the highest total hours in each department
        System.out.println(analyzer.calculateHighestTotalHoursEachDepartment(employees));


    }
}
