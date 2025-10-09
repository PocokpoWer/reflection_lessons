import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"ID", "SensorType", "Readings"})
public abstract class Sensor {
    @JsonProperty("id")
    private final int id;
    @JsonProperty("myDateTime")
    private final MyDateTime myDateTime;
    @JsonProperty("readings")
    private final List<Reading> readings = new ArrayList<>();

    public Sensor(MyDateTime myDateTime, int id) {
        this.myDateTime = myDateTime;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public MyDateTime getMyDateTime() {
        return myDateTime;
    }

    public List<Reading> getReadings() {
        return Collections.unmodifiableList(readings);
    }

    public void addReading(double value) {
        addReading(value, myDateTime);
    }

    public void addReading(double value, MyDateTime timestamp) {
        readings.add(new Reading(value, timestamp));
    }

    public Reading getLatestReading() {
        if (readings.isEmpty()) {
            throw new IllegalStateException("No readings for sensor id=" + id);
        }
        return readings.get(readings.size() - 1);
    }

    public double getLatestReadingValue() {
        return getLatestReading().value();
    }

    @JsonProperty("sensorType")
    public abstract String sensorType();
}
