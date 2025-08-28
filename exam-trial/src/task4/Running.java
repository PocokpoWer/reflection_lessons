package task4;

public non-sealed class Running extends OutdoorActivity {
    private double distanceKm;

    public Running(double durationMinutes, double distanceKm) {
        super(durationMinutes);
        this.distanceKm = distanceKm;
    }

    @Override
    public double caloriesBurned() {
        return durationMinutes * 10 + distanceKm * 5;
    }
}
