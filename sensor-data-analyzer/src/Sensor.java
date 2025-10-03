import java.util.ArrayList;
import java.util.List;

public abstract class Sensor {
    private final int id;
    private final List<Double> readings = new ArrayList<>();


    public Sensor(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<Double> getReadings() {
        return readings;
    }

    public void addReading(double value) {
        readings.add(value);
    }

    public double getLatestReading() {
        if (readings.isEmpty()) {
            throw new IllegalStateException("No readings for sensor id=" + id);
        }
        return readings.get(readings.size() - 1);
    }

    public abstract String sensorType();
}
