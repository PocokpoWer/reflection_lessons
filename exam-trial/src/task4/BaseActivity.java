package task4;

public abstract class BaseActivity implements Activity {
    protected double durationMinutes;

    public BaseActivity(double durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    @Override
    public double getDurationMinutes() {
        return durationMinutes;
    }
}
