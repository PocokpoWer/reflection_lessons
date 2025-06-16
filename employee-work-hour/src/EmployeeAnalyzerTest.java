import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class EmployeeAnalyzerTest {
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
