import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Csvparser csvparser = new Csvparser();
        EmployeeAnalyzer analyzer = new EmployeeAnalyzer();
        csvparser.reader("c:\\employee_hours.csv");
        List<Employee> employees = csvparser.employees;

        // Determine the total weekly hours worked for each employee
        analyzer.printEmployeeList(employees);

        // Calculate the average daily hours for each employee
        analyzer.calculateDailyHourAverage(employees);

        // Determine the average weekly hours in each department
        analyzer.calculateWeeklyHourAverage(employees);

        // Determine the average weekly hours in each department
        analyzer.calculateWeeklylAverageDepartment(employees);

        // Identify the employee with the highest total hours globally
        analyzer.calculateHighestTotalHour(employees);


    }
}
