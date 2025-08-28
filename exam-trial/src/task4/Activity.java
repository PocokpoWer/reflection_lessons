package task4;

public interface Activity {
    double caloriesBurned();

    default boolean isIntense() {
        double hours = getDurationMinutes() / 60.0;
        return (caloriesBurned() / hours) > 600;
    }

    double getDurationMinutes();
}
