package task4;

public abstract sealed class OutdoorActivity extends BaseActivity permits Running, Cycling, Hiking {
    public OutdoorActivity(double durationMinutes) {
        super(durationMinutes);
    }
}
