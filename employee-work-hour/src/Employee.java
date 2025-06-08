import java.util.List;

public class Employee {
    String name;
    String department;
    List<Integer> shiftHours;

    public Employee(String name, String department, List<Integer> shiftHours) {
        this.name = name;
        this.department = department;
        this.shiftHours = shiftHours;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Employee() {
    }

    public List<Integer> getShiftHours() {
        return shiftHours;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Department: %s Shift hours: %s%n", name, department, shiftHours);
    }
}
