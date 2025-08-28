package task4;

public final class Hiking extends OutdoorActivity {
    private double elevation;

    public Hiking(double durationMinutes, double elevation) {
        super(durationMinutes);
        this.elevation = elevation;
    }

    @Override
    public double caloriesBurned() {
        return durationMinutes * 7 + elevation;
    }
}
