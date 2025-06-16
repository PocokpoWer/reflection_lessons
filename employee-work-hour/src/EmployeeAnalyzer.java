import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeAnalyzer {

    public void printEmployeeList(List<Employee> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s %d %n", list.get(i).getName(), sumTotalWeeklyHours(list.get(i).getShiftHours()));
        }
    }

    public void calculateDailyHourAverage(List<Employee> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s %.2f %n", list.get(i).getName(), calcAverageWeeklyHours(list.get(i).getShiftHours()));
        }
    }

    public void calculateWeeklyHourAverage(List<Employee> list) {
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
                System.out.printf("%s average weekly hours: %.2f%n", currentDepartment, avg);
            }
        }
    }

    public void calculateWeeklylAverageDepartment(List<Employee> list) {
        List<Integer> sumHours = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s %d %n", list.get(i).getDepartment(), sumTotalWeeklyHours(list.get(i).getShiftHours()));
        }
    }

    public void calculateHighestTotalHour(List<Employee> list) {
        int weeklyHour = sumTotalWeeklyHours(list.get(0).getShiftHours());
        String employeeName = list.get(0).getName();
        for (int i = 1; i < list.size(); i++) {
            if (sumTotalWeeklyHours(list.get(i).getShiftHours()) > weeklyHour) {
                employeeName = list.get(i).getName();
                weeklyHour = sumTotalWeeklyHours(list.get(i).getShiftHours());
            }
        }
        System.out.printf("%s highest total with %d hours %n", employeeName, weeklyHour);
    }

    public static int sumTotalWeeklyHours(HashMap<String, Integer> number) {
        int result = 0;
        for (Integer integer : number.values()) {
            result += integer;
        }
        return result;
    }

    public static double calcAverageWeeklyHours(HashMap<String, Integer> number) {
        int result = 0;
        for (Integer integer : number.values()) {
            result += integer;
        }
        return (double) result / number.size();
    }
}
