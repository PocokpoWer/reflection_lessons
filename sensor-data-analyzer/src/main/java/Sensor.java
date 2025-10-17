import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonPropertyOrder({"ID", "SensorType", "Readings"})
public abstract class Sensor {
    @JsonProperty("SensorType")
    public abstract String sensorType();

    @JsonProperty("ID")
    private final int id;
    @JsonIgnore
    private final MyDateTime myDateTime;
    @JsonProperty("Readings")
    private final List<Reading> readings = new ArrayList<>();

    public Sensor(MyDateTime myDateTime, int id) {
        this.myDateTime = myDateTime;
        this.id = id;
    }

    public void addReading(double value) {
        addReading(value, myDateTime);
    }

    public void addReading(double value, MyDateTime timestamp) {
        readings.add(new Reading(value, timestamp));
    }

    @JsonIgnore
    public Reading getLatestReading() {
        if (readings.isEmpty()) {
            throw new IllegalStateException("No readings for sensor id=" + id);
        }
        return readings.get(readings.size() - 1);
    }

    @JsonIgnore
    public double getLatestReadingValue() {
        return getLatestReading().value();
    }
}
