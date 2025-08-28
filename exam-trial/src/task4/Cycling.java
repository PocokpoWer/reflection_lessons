package task4;

public non-sealed class Cycling extends OutdoorActivity {
    private double averageSpeedKmH;

    public Cycling(double durationMinutes, double averageSpeedKmH) {
        super(durationMinutes);
        this.averageSpeedKmH = averageSpeedKmH;
    }

    @Override
    public double caloriesBurned() {
        return durationMinutes * averageSpeedKmH * 0.2;
    }
}
