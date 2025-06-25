import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeAnalyzerTest {
    @Test
    public void shouldPrintEmployeeList() {
        Map<String, Integer> exception = new HashMap<>();
        exception.put("Tibor", 13);
        List<Employee> testList = new ArrayList<>();
        Map<String, Integer> shift = new HashMap<>();
        shift.put("Monday", 8);
        shift.put("Tuesday", 0);
        shift.put("Wednesday", 4);
        shift.put("Friday", 1);
        testList.add(new Employee("Tibor", "Igazgató", shift));
        EmployeeAnalyzer employeeanalyzer = new EmployeeAnalyzer();
        assertEquals(exception, employeeanalyzer.printEmployeeList(testList));
    }

    @Test
    public void shouldCalculateDailyHourAverage() {
        Map<String, Double> exception = new HashMap<>();
        exception.put("Dezső", 4.25);
        List<Employee> testList = new ArrayList<>();
        Map<String, Integer> shift = new HashMap<>();
        shift.put("Monday", 4);
        shift.put("Tuesday", 2);
        shift.put("Wednesday", 8);
        shift.put("Friday", 3);
        testList.add(new Employee("Dezső", "Konyhás", shift));
        EmployeeAnalyzer employeeanalyzer = new EmployeeAnalyzer();
        assertEquals(exception, employeeanalyzer.calculateDailyHourAverage(testList));
    }

    @Test
    public void shouldCalculateWeeklyHourAverage() {
        Map<String, Double> expected = new HashMap<>();
        expected.put("Engineer", 19.5);
        List<Employee> testList = new ArrayList<>();
        Map<String, Integer> shift = new HashMap<>();
        shift.put("Monday", 3);
        shift.put("Tuesday", 2);
        shift.put("Wednesday", 5);
        shift.put("Friday", 1);
        testList.add(new Employee("Irma", "Engineer", shift));
        Map<String, Integer> shift2 = new HashMap<>();
        shift2.put("Monday", 4);
        shift2.put("Tuesday", 6);
        shift2.put("Wednesday", 8);
        shift2.put("Friday", 10);
        testList.add(new Employee("Teri", "Engineer", shift2));
        EmployeeAnalyzer employeeanalyzer = new EmployeeAnalyzer();
        assertEquals(expected, employeeanalyzer.calculateWeeklyHourAverage(testList));
    }

    @Test
    public void shouldCalculateWeeklyHourAverage2() {
        Map<String, Double> expected = new HashMap<>();
        expected.put("Engineer", 11.0);
        expected.put("Cook", 28.0);
        List<Employee> testList = new ArrayList<>();
        Map<String, Integer> shift = new HashMap<>();
        shift.put("Monday", 3);
        shift.put("Tuesday", 2);
        shift.put("Wednesday", 5);
        shift.put("Friday", 1);
        testList.add(new Employee("Irma", "Engineer", shift));
        Map<String, Integer> shift2 = new HashMap<>();
        shift2.put("Monday", 4);
        shift2.put("Tuesday", 6);
        shift2.put("Wednesday", 8);
        shift2.put("Friday", 10);
        testList.add(new Employee("Teri", "Cook", shift2));
        EmployeeAnalyzer employeeanalyzer = new EmployeeAnalyzer();
        assertEquals(expected, employeeanalyzer.calculateWeeklyHourAverage(testList));
    }

    @Test
    public void shouldCalculateHighestTotalHour() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Bruce Willis", 60);
        List<Employee> testList = new ArrayList<>();
        Map<String, Integer> shift = new HashMap<>();
        shift.put("Monday", 8);
        shift.put("Tuesday", 8);
        shift.put("Wednesday", 8);
        shift.put("Thursday", 8);
        shift.put("Friday", 8);
        testList.add(new Employee("Jet Lee", "Film maker", shift));
        Map<String, Integer> shift2 = new HashMap<>();
        shift2.put("Monday", 12);
        shift2.put("Tuesday", 12);
        shift2.put("Wednesday", 12);
        shift2.put("Thursday", 12);
        shift2.put("Friday", 12);
        testList.add(new Employee("Bruce Willis", "Star", shift2));
        EmployeeAnalyzer employeeanalyzer = new EmployeeAnalyzer();
        assertEquals(expected, employeeanalyzer.calculateHighestTotalHour(testList));
    }

    @Test
    public void shouldCalculateHighestTotalHoursEachDepartment() {
        Map<String, String> expected = new HashMap<>();
        expected.put("Vonatkerék pumpáló", "Zsán Klód Vándám");
        expected.put("VooDoo Baba", "Brúsz Lí");
        List<Employee> testList = new ArrayList<>();
        Map<String, Integer> shift = new HashMap<>();
        shift.put("Monday", 8);
        shift.put("Tuesday", 6);
        shift.put("Wednesday", 4);
        shift.put("Thursday", 8);
        shift.put("Friday", 8);
        testList.add(new Employee("Superman", "Vonatkerék pumpáló", shift));
        Map<String, Integer> shift2 = new HashMap<>();
        shift2.put("Monday", 16);
        shift2.put("Tuesday", 16);
        shift2.put("Wednesday", 16);
        shift2.put("Thursday", 16);
        shift2.put("Friday", 16);
        testList.add(new Employee("Zsán Klód Vándám", "Vonatkerék pumpáló", shift2));
        Map<String, Integer> shift3 = new HashMap<>();
        shift3.put("Monday", 4);
        shift3.put("Tuesday", 6);
        shift3.put("Wednesday", 1);
        shift3.put("Thursday", 1);
        shift3.put("Friday", 12);
        testList.add(new Employee("Brúsz Lí", "VooDoo Baba", shift3));
        EmployeeAnalyzer employeeanalyzer = new EmployeeAnalyzer();
        assertEquals(expected, employeeanalyzer.calculateHighestTotalHoursEachDepartment(testList));
    }


    @Test
    public void shouldSumTotalWeeklyHours() {
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("Monday", 8);
        testMap.put("Tuesday", 3);
        testMap.put("Wednesday", 5);
        testMap.put("Thursday", 1);
        assertEquals(17, EmployeeAnalyzer.sumTotalWeeklyHours(testMap));
    }

    @Test
    public void shouldCalcAverageWeeklyHours() {
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("Monday", 8);
        testMap.put("Tuesday", 3);
        testMap.put("Wednesday", 5);
        testMap.put("Thursday", 1);
        assertEquals(4.25, EmployeeAnalyzer.calcAverageWeeklyHours(testMap));
    }
}
