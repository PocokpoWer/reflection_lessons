import java.util.Map;

public class Employee {
    private String name;
    private String department;
    private Map<String, Integer> shiftHours;

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Map<String, Integer> getShiftHours() {
        return shiftHours;
    }

    public Employee(String name, String department, Map<String, Integer> shiftHours) {
        this.name = name;
        this.department = department;
        this.shiftHours = shiftHours;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Department: %s Shift hours: Monday: %s Tuesday: %s Wednesday: %s Thursday: %s Friday: %s%n", name, department, shiftHours.get("Monday"), shiftHours.get("Tuesday"), shiftHours.get("Wednesday"), shiftHours.get("Thursday"), shiftHours.get("Friday"));
    }
}
