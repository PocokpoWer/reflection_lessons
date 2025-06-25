import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeAnalyzer {

    public Map<String, Integer> printEmployeeList(List<Employee> list) {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            result.put(list.get(i).getName(), sumTotalWeeklyHours(list.get(i).getShiftHours()));
        }
        return result;
    }

    public Map<String, Double> calculateDailyHourAverage(List<Employee> list) {
        Map<String, Double> result = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            result.put(list.get(i).getName(), calcAverageWeeklyHours(list.get(i).getShiftHours()));
        }
        return result;
    }

    public Map<String, Double> calculateWeeklyHourAverage(List<Employee> list) {
        Map<String, Double> result = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String currentDepartment = list.get(i).getDepartment();
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (list.get(k).getDepartment().equals(currentDepartment)) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                int sum = 0;
                int count = 0;

                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j).getDepartment().equals(currentDepartment)) {
                        sum += sumTotalWeeklyHours(list.get(j).getShiftHours());
                        count++;
                    }
                }

                double avg = (double) sum / count;
                result.put(currentDepartment, avg);
            }
        }
        return result;
    }

    public Map<String, Integer> calculateHighestTotalHour(List<Employee> list) {
        Map<String, Integer> result = new HashMap<>();
        int weeklyHour = sumTotalWeeklyHours(list.get(0).getShiftHours());
        String employeeName = list.get(0).getName();
        for (int i = 1; i < list.size(); i++) {
            if (sumTotalWeeklyHours(list.get(i).getShiftHours()) > weeklyHour) {
                employeeName = list.get(i).getName();
                weeklyHour = sumTotalWeeklyHours(list.get(i).getShiftHours());
            }
        }
        result.put(employeeName, weeklyHour);
        return result;
    }

    public Map<String, String> calculateHighestTotalHoursEachDepartment(List<Employee> list) {
        Map<String, String> topEmployee = new HashMap<>();
        Map<String, Integer> shiftHours = new HashMap<>();
        for (Employee employee : list) {
            String department = employee.getDepartment();
            int weeklyHours = sumTotalWeeklyHours(employee.getShiftHours());
            if (!shiftHours.containsKey(department) || weeklyHours > shiftHours.get(department)) {
                shiftHours.put(department, weeklyHours);
                topEmployee.put(department, employee.getName());
            }
        }
        return topEmployee;
    }


    public static int sumTotalWeeklyHours(Map<String, Integer> number) {
        int result = 0;
        for (Integer integer : number.values()) {
            result += integer;
        }
        return result;
    }

    public static double calcAverageWeeklyHours(Map<String, Integer> number) {
        int result = 0;
        for (Integer integer : number.values()) {
            result += integer;
        }
        return (double) result / number.size();
    }
}
